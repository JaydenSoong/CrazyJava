package classes;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.Button;
import java.awt.CheckboxGroup;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.List;
import java.awt.TextArea;
import java.awt.TextField;
import javax.swing.Box;
import static java.awt.BorderLayout.*;

/**
 * awt Component Test
 */
public class CommonComponent {
    Frame f = new Frame("Common Component Test Window");
    Button ok = new Button("OK");
    CheckboxGroup cbg = new CheckboxGroup();
    Checkbox male = new Checkbox("male", cbg, true);
    Checkbox female = new Checkbox("female", cbg, false);
    Checkbox married = new Checkbox("Is married?", false);
    Choice colorChooser = new Choice();
    List colorList = new List(6, true);
    TextArea ta = new TextArea(5, 20);
    TextField name = new TextField(50);

    private void init() {
        colorChooserInit();
        colorListInit();
        Panel bottom = new Panel();
        bottomInit(bottom);
        f.add(bottom, SOUTH);
        Panel checkPanel = new Panel();
        checkPanelInit(checkPanel);
        Box topLeft = Box.createVerticalBox();
        topLeftInit(topLeft, checkPanel);
        Box top = Box.createHorizontalBox();
        topInit(top, topLeft);
        f.add(top);
        f.pack();
        f.setVisible(true);
    }

    private void topInit(Box top, Box topLeft) {
        top.add(topLeft);
        top.add(colorList);
    }

    private void topLeftInit(Box topLeft, Panel checkPanel) {
        topLeft.add(ta);
        topLeft.add(checkPanel);
    }

    private void checkPanelInit(Panel p) {
        p.add(colorChooser); 
        p.add(male);
        p.add(female);
        p.add(married);
    }
    
    private void bottomInit(Panel p) {
        p.add(name);
        p.add(ok);
    }

    private void colorChooserInit() {
        colorChooser.add("Red");
        colorChooser.add("Green");
        colorChooser.add("Blue");
    }

    private void colorListInit() {
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Blue");
    }

    public static void main (String[] args) {
        new CommonComponent().init();
    }
}
