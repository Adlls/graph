import javax.swing.*;
import java.awt.*;

public class Frame extends JPanel {


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D gr = (Graphics2D) g;
        //gr.drawLine(0,0,2000,2000);
    }
}
