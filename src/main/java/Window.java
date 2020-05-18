import components.ControlPanel;
import components.Graph;
import constants.SizeFrames;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ui.ApplicationFrame;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

import static components.Graph.createDemoPanel;
import static org.jfree.chart.ui.UIUtils.centerFrameOnScreen;

public class Window extends JFrame {

    private String title;

    public Window(String title) throws IOException {
        super(title);
        this.title = title;
        setCenterWindow(SizeFrames.WIDTH_MAINFRAME, SizeFrames.HEIGHT_MAINFRAME);
        setResizable(false);
        setVisible(true);
        setSize(SizeFrames.WIDTH_MAINFRAME, SizeFrames.HEIGHT_MAINFRAME);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setComponents();
    }


   public void setComponents() throws IOException {
        JPanel controlPanel = new ControlPanel();
        JPanel graph = Graph.createDemoPanel();
        add(graph);
        graph.setBounds( 0, 0, SizeFrames.WIDTH_GRAPH, SizeFrames.HEIGHT_GRAPH);
        controlPanel.setBounds( 0, SizeFrames.HEIGHT_GRAPH,
                SizeFrames.WIDTH_CONTROL_PANEL, SizeFrames.HEIGHT_CONTROL_PANEL);
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



