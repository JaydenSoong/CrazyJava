package classes;

import javax.swing.filechooser.FileView;
import javax.swing.filechooser.FileFilter;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.io.File;

/**
 * FileIconView
 * FileView子类，用于为指定类型的文件或路径设置图标
 */
class FileIconView extends FileView {
    private FileFilter filter;

    public FileIconView(FileFilter filter) {
        this.filter = filter;
    }

    //重写该方法，为文件或路径设置图标
    @Override
    public Icon getIcon(File f) {
        if (!f.isDirectory() && filter.accept(f)) {
            return new ImageIcon("ico/pict.png");
        } else  if (f.isDirectory()) {
            //获取所有根路径
            File[] fList = File.listRoots();
            for (File tmp : fList) {
                //如果该路径是根路径
                if (tmp.equals(f)) {
                    return new ImageIcon("ico/dsk.png");
                } 
            } 
            return new ImageIcon("ico/folder.png");
        } else {
            return null;
        } 
    }
}
