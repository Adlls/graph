import constants.SizeFrames;

import java.io.IOException;

import static org.jfree.chart.ui.UIUtils.centerFrameOnScreen;

public class main {
    public static void main(String[] args) throws IOException {
       Window mainFrame = new Window("Graph");
       centerFrameOnScreen(mainFrame);
       mainFrame.setVisible(true);

    }
}
