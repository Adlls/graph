import components.ControlPanel;
import components.Graph;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ui.ApplicationFrame;

import javax.swing.*;
import java.awt.*;

import static components.Graph.createDemoPanel;
import static org.jfree.chart.ui.UIUtils.centerFrameOnScreen;

public class Window extends JFrame {
    private int width;
    private int height;
    private String title;

    public Window(String title, int width, int height) {
        super(title);

        this.title = title;
        this.width = width;
        this.height = height;
        setCenterWindow(width, height);
        setResizable(false);
        setVisible(true);
        setSize(width, height);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setComponents();
    }


   public void setComponents() {
        JPanel controlPanel = new ControlPanel();
        JPanel graph = Graph.createDemoPanel();
        add(graph);
        graph.setBounds( 0, 0, this.width, this.height - ControlPanel.getHeightCP());
        controlPanel.setBounds( 0, this.height - ControlPanel.getHeightCP(),
                this.width, ControlPanel.getHeightCP());
        add(controlPanel);
        controlPanel.setBackground(Color.WHITE);
   }


   public void setCenterWindow(int width, int height) {
       Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
       int x = (int) ((dimension.getWidth() - width) / 2);
       int y = (int) ((dimension.getHeight() - height) / 2);
       setLocation(x, y);
   }
}

