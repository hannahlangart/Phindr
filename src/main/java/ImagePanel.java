import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class ImagePanel extends JPanel {
    /*Reference 1 - taken from https://stackoverflow.com/questions/299495/how-to-add-an-image-to-a-jpanel*/
    private BufferedImage image;

    public ImagePanel() {
        try {
            image = ImageIO.read(new File("shop2original.png")); //path to original shop map
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //The getWidth and getHeight functions make this scalable to any monitor size
        g.drawImage(image, 0, 10, this.getWidth(), this.getHeight(), this); //drawing map
        /* end of reference 1*/
    }
}

