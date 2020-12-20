import javax.swing.*;
import java.awt.*;

public class Main {
    static GraphicsConfiguration gc; // Class field containing config info

    public static void main(String[] args) {

        JFrame frame = new JFrame(gc); // Create a new JFrame
        frame.setSize(2000, 2000);
        frame.setTitle("Phab Pharmacy Map");
        // This next line closes the program when the frame is closed
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        MapUI mUI= new MapUI();
        frame.add(mUI.getMainPanel());

        frame.setVisible(true);
    }
}
