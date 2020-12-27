import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class ImagePanel extends JPanel {

    private BufferedImage image;
    //public MapUI map;

    public ImagePanel() {
        try {
            image = ImageIO.read(new File("shop2.png")); //path to shop map
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    //trying to draw locations for a given category, but when "if" method is used the map doesn't appear...
    /*  if (map.getCat() == "A") {
        g2d.drawOval(60, 380, 50, 50);
        else if (map.getCat() == "B") {
             g2d.drawOval(57,490,50,50);
            //System.out.println("2");
       } else if (map.getCat() == "D") {
            g2d.drawOval(260,492,50,50);
            //System.out.println("4");
       } else if (map.getCat() == "E") {
            g2d.drawOval(363,492,50,50);
           // System.out.println("5");
        } else if (map.getCat() == "C") {
            g2d.drawOval(60,605,50,50);
            //System.out.println("3");
        } else if (map.getCat() == "F") {
             g2d.drawOval(310, 630, 50, 50);
            //System.out.println("6");
       } else {*/

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 50, 200, this); //drawing map

    }
}

