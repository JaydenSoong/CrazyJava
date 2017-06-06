package classes;

import javax.swing.filechooser.FileFilter;
import java.util.ArrayList;
import java.io.File;

/**
 * ExtensionFileFilter
 * 扩展的 FileFilter 类，用于文件过滤
 */
class ExtensionFileFilter extends FileFilter {
    private String description = "";
    //保存扩展类型
    private ArrayList<String> extensions = new ArrayList<>();

    //自定义方法，添加文件扩展名
    public void addExtension(String extension) {
        if (!extension.startsWith(".")) {
            extension = "." + extension;
            extensions.add(extension.toLowerCase());
        }
    }
    
    //设置文件该过滤器的描述信息
    public void setDescription(String aDescription) {
        this.description = aDescription;
    }

    //继承了FileFilter类必须实现的抽象方法，用于获取该文件过滤器的描述信息
    @Override
    public String getDescription() {
        return description;
    }

    //继承了FileFilter类必须实现的抽象方法，用于判断过滤器是否接受该文件
    public boolean accept(File f) {
        //如果是一个目录，接受
        if (f.isDirectory()) {
            return true;
        }
        //将文件名转为小写
        String name = f.getName().toLowerCase();
         for (String extension : extensions) {
             if (name.endsWith(extension)) {
                 return true;
             } 
         } 
         return false;
    }
}
