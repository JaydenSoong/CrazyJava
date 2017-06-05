package classes;

import javax.swing.filechooser.FileFilter;
import java.util.ArrayList;
import java.io.File;

/**
 * ExtensionFileFilter
 * FileFilter的子类，用以实现文件过滤功能
 */
class ExtensionFileFilter extends FileFilter {
    private String description;
    private ArrayList<String> extensions = new ArrayList<>();
    
    //自定义方法，用于添加文件扩展名。
    public void addExtension (String extension) {
        if (!extension.startsWith(".")) {
                extension = "." + extension;
                extensions.add(extension.toLowerCase());
        } 
    }
    
    //用于设置该文件过滤器的描述文本
    public void setDescription (String aDescription) {
        description = aDescription;
    }
    
    //返回过滤器描述文本
    @Override
    public String getDescription() {
        return description;
    }

    //判断该文件过滤器是否接受该文件
    @Override
    public boolean accept (File f) {
        //如果该文件是路径，则接受该文件
        if (f.isDirectory()) {
            return true;
        }
        //将文件名转为小写，以忽略文件名大小写
        String name = f.getName().toLowerCase();
        //遍历所有可接受的扩展名，如果扩展名相同，该文件就可接受
        for (String extension : extensions) {
            if (name.endsWith(extension)) {
                return true;
            } 
        } 
        return false;
    }
}
