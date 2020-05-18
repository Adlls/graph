package components;

import constants.SizeControls;
import constants.SizeFrames;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ControlPanel extends JPanel {

    private final int WIDTH_BTN_SIZE = 100;
    private final int HEIGHT_BTN_SIZE = 30;
    private final static int HEIGHT_CONTROL_PANEL = 100;

   public ControlPanel() throws IOException {
        super();
        setLayout(null);
        JButton pointButton = new JButton("Точка");
        JButton clearButton = new JButton("Очистить");
        JComboBox dropListInterval  = new JComboBox(new String[]{
                "30m", "60m"
        });
       ImageIcon image = new ImageIcon("../../images/line.png");
       JButton viewLineButton = new JButton("Лин.");
       JButton viewAshiButton = new JButton("Свечи");
       pointButton.setBounds(
               10,
               (HEIGHT_CONTROL_PANEL - HEIGHT_BTN_SIZE)/2,
               SizeControls.DEFAULT_BTN_WIDTH,
               SizeControls.DEFAULT_BTN_HEIGHT);
       clearButton.setBounds(
               SizeFrames.WIDTH_MAINFRAME - SizeControls.DEFAULT_BTN_WIDTH - 10,
               (HEIGHT_CONTROL_PANEL - HEIGHT_BTN_SIZE)/2,
               SizeControls.DEFAULT_BTN_WIDTH,
               SizeControls.DEFAULT_BTN_HEIGHT);

       dropListInterval.setBounds(
               250,
               (HEIGHT_CONTROL_PANEL - HEIGHT_BTN_SIZE)/2,
               SizeControls.SMALL_BTN_WIDTH,
               SizeControls.SMALL_BTN_HEIGHT);

       viewLineButton.setBounds(
               350,
               (HEIGHT_CONTROL_PANEL - HEIGHT_BTN_SIZE)/2,
               SizeControls.SMALL_BTN_WIDTH,
               SizeControls.SMALL_BTN_HEIGHT);

       viewAshiButton.setBounds(
               450,
               (HEIGHT_CONTROL_PANEL - HEIGHT_BTN_SIZE)/2,
               SizeControls.SMALL_BTN_WIDTH,
               SizeControls.SMALL_BTN_HEIGHT);

       add(pointButton);
       add(clearButton);
       add(dropListInterval);
       add(viewLineButton);
       add(viewAshiButton);
       setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, Color.GRAY));
    }

}
