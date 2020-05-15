import javax.swing.*;
import java.awt.*;

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
        setVisible(true);
        setSize(width, height);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new Frame());
    }


   public void setCenterWindow(int width, int height) {
       Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
       int x = (int) ((dimension.getWidth() - width) / 2);
       int y = (int) ((dimension.getHeight() - height) / 2);
       setLocation(x, y);
   }
}
