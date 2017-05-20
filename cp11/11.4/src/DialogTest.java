package classes;

import java.awt.Frame;
import java.awt.Dialog;
import java.awt.Button;
import static java.awt.BorderLayout.*;

public class DialogTest {
    Frame f = new Frame("Dialog Test");
    Dialog d1 = new Dialog(f, "model dialog", true);
    Dialog d2 = new Dialog(f, "non-model dialog", false);
    Button b1 = new Button("Open model dialog");
    Button b2 = new Button("Open non-model dialog");

    private void init() {
        d1.setBounds(20, 30, 300, 400);
        d2.setBounds(20, 30, 300, 400);
        b1.addActionListener(e -> d1.setVisible(true));
        b2.addActionListener(e -> d2.setVisible(true));
        f.add(b1);
        f.add(b2, SOUTH);
        f.pack();
        f.setVisible(true);
    }

    public static void main (String[] args) {
        new DialogTest().init();
    }
}
