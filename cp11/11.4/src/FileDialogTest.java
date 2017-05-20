package classes;

import java.awt.Frame;
import java.awt.FileDialog;
import java.awt.Button;
import static java.awt.BorderLayout.*;

public class FileDialogTest {
    Frame f = new Frame("Dialog Test");
    FileDialog d1 = new FileDialog(f, "Choose file to open", FileDialog.LOAD);
    FileDialog d2 = new FileDialog(f, "Choose file to save", FileDialog.SAVE);
    Button b1 = new Button("Open File");
    Button b2 = new Button("Save File");

    private void init() {
        b1.addActionListener(e -> {
            d1.setVisible(true);
            System.out.println(d1.getDirectory() + d1.getFile());
        });
        b2.addActionListener(e -> {
            d2.setVisible(true);
            System.out.println(d2.getDirectory() + d2.getFile());
        });
        f.add(b1);
        f.add(b2, SOUTH);
        f.pack();
        f.setVisible(true);
    }

    public static void main (String[] args) {
        new FileDialogTest().init();
    }
}
