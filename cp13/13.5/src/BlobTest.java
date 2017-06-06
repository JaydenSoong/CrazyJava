package classes;

import static classes.InitParam.*;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JFileChooser;
import javax.swing.ListSelectionModel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Blob;
import java.io.File;
import java.io.InputStream;
import java.io.FileInputStream;

public class BlobTest {
    JFrame jf = new JFrame("图片管理程序");
    private static Connection conn;
    private static PreparedStatement insert;
    private static PreparedStatement query;
    private static PreparedStatement queryAll;
    //定义一个DefaultListModel对象，用于增加、删除JList中的对象
    private DefaultListModel<ImageHolder> imageModel = new DefaultListModel<>();
    private JList<ImageHolder> imageList = new JList<>(imageModel);
    private JTextField filePath = new JTextField(26);
    private JButton browserBn = new JButton("...");
    private JButton uploadBn = new JButton("上传");
    private JLabel imageLabel = new JLabel();
    //以当前路径创建文件选择器
    JFileChooser chooser = new JFileChooser(".");
    //创建文件过滤器
    ExtensionFileFilter filter = new ExtensionFileFilter();
    
    //静态初始化块
    static {
        try {
            initParam("mysql.properties");
            //获取数据库连接
            conn = DriverManager.getConnection(url, user, pwd);    
            //创建执行插入的PreparedStatement对象，该对象执行插入后，可以返回自动生成的主键
            insert = conn.prepareStatement("INSERT INTO img_table VALUES (null, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS);
            //创建两个PreparedStatement对象，用于查询指定图片，查询所有图片
            query = conn.prepareStatement("SELECT img_data FROM img_table WHERE img_id = ?");
            queryAll = conn.prepareStatement("SELECT img_id, img_name FROM img_table");
        } catch (Exception e) {
            e.printStackTrace();   
        }
    } 

    public void init() throws SQLException {
        //初始化文件选择器
        filter.addExtension("jpg");
        filter.addExtension("jpeg");
        filter.addExtension("gif");
        filter.addExtension("png");
        filter.setDescription("图片文件(*.jpg,*.jpeg,*.gif,*.png)");
        chooser.addChoosableFileFilter(filter);
        //禁止“文件类型”下拉列表中显示“所有文件”选项
        chooser.setAcceptAllFileFilterUsed(false);
        //初始化程序界面
        fillListModel();
        filePath.setEditable(false);
        //只能单选
        imageList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JPanel jp = new JPanel();
        jp.add(filePath);
        jp.add(browserBn);
        browserBn.addActionListener(event -> {
            //显示文件对话框
            int result = chooser.showDialog(jf, "浏览图片上传文件");
            //如果用户选择了APPROVE(赞同)按钮，即打开，保存等效按钮
            if (result == JFileChooser.APPROVE_OPTION) {
                filePath.setText(chooser.getSelectedFile().getPath());
            } 
        });
        jp.add(uploadBn);
        uploadBn.addActionListener(avt -> {
            //如果上传文件的文本框有内容
            if (filePath.getText().trim().length() > 0) {
                //将指定文件保存到数据库
                upload(filePath.getText());
                //清空文本框内容
                filePath.setText("");
            }
        });
        JPanel left = new JPanel();
        left.setLayout(new BorderLayout());
        left.add(new JScrollPane(imageLabel), BorderLayout.CENTER);
        left.add(jp, BorderLayout.SOUTH);
        jf.add(left);
        imageList.setFixedCellWidth(160);
        jf.add(new JScrollPane(imageList), BorderLayout.EAST);
        imageList.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //如果鼠标双击
                if (e.getClickCount() >= 2) {
                    //取出选中的List项
                    ImageHolder cur = (ImageHolder) imageList.getSelectedValue();
                    try {
                       //显示选中项对应的Image
                       showImage(cur.getId());
                    } catch (SQLException sqle) {
                        sqle.printStackTrace();

                    }
                } 
            }
        });
        jf.setSize(620, 400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }

    /**
     * 查找 img_table 填充 ListModel
     */
    public void fillListModel() throws SQLException {
        try (
             //执行查询
             ResultSet rs = queryAll.executeQuery()) {
            //先清除所有元素
            imageModel.clear();
            //把查询的全部记录添加到ListModel中
            while (rs.next()) {
                imageModel.addElement(new ImageHolder(rs.getInt(1), rs.getString(2)));
            } 
        } 
    }

    /**
     * 将指定图片放入数据库
     */
    public void upload(String fileName) {
        //截取文件名
        String imageName = fileName.substring(fileName.lastIndexOf('/') + 1, fileName.lastIndexOf('.'));
        File f = new File(fileName);
        try (InputStream is = new FileInputStream(f)) {
            //设置图片名参数
            insert.setString(1, imageName);
            //设置二进制流参数
            insert.setBinaryStream(2, is, (int) f.length());
            int affect = insert.executeUpdate();
            if (affect == 1) {
                //重新更新ListModel，将会让JList显示最新的图片列表
                fillListModel();
            }
        } catch (Exception e) {
               e.printStackTrace(); 
        }
    }

    /**
     * 根据图片ID显示图片
     */
    public void showImage(int id) throws SQLException {
        //设置参数
        query.setInt(1, id);
        try (//执行查询
             ResultSet rs = query.executeQuery()) {
            if (rs.next()) {
                //取出Blob列
                Blob imgBlob = rs.getBlob(1);
                //取出Blob列里的数据
                ImageIcon icon = new ImageIcon(imgBlob.getBytes(1L, (int)imgBlob.length()));
                imageLabel.setIcon(icon);
            } 
        }
    }

    public static void main (String [] args) throws Exception{
        new BlobTest().init();
    }
}
