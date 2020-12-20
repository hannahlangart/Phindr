import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImagePanel extends JPanel{

    private BufferedImage image;

    public ImagePanel() {
        try {
            image = ImageIO.read(new File("shop2.png"));
        } catch (IOException ex) {
            // handle exception...
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 50, 200, this); // see javadoc for more info on the parameters
        g.setColor(Color.red);
        g.drawOval(60,380,50,50);
        g.drawOval(57,490,50,50);
        g.drawOval(260,492,50,50);
        g.drawOval(363,492,50,50);
        g.drawOval(60,605,50,50);
        g.drawOval(310,630,50,50);
    }

}
