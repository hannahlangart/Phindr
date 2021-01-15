package Locations;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class ShopLocationC extends JPanel {

    private BufferedImage imageC;

    public ShopLocationC() {
        try {
            imageC = ImageIO.read(new File("shop2C.png")); //path to shop map
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //The getWidth and getHeight functions make this scalable to any monitor size.
        g.drawImage(imageC, 0, 10,this.getWidth()-10, this.getHeight()-10,  this); //drawing map
    }
}
