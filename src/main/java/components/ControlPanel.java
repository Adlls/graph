package components;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ControlPanel extends JPanel {

    private final int WIDTH_BTN_SIZE = 100;
    private final int HEIGHT_BTN_SIZE = 30;
    private final static int HEIGHT_CONTROL_PANEL = 100;

   public ControlPanel() {
        super();
        setLayout(null);
        JButton button = new JButton("Точка");
        JButton button2 = new JButton("");
        button.setBounds(10,(HEIGHT_CONTROL_PANEL - HEIGHT_BTN_SIZE)/2, WIDTH_BTN_SIZE, HEIGHT_BTN_SIZE);
        button2.setBounds(150,(HEIGHT_CONTROL_PANEL - HEIGHT_BTN_SIZE)/2, WIDTH_BTN_SIZE, HEIGHT_BTN_SIZE);
        add(button);
        add(button2);
    }

    public static int getHeightCP() {
       return HEIGHT_CONTROL_PANEL;
    }

}
