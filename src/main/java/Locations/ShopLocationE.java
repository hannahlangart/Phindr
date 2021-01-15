package Locations;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class ShopLocationE extends JPanel {

    private BufferedImage imageE;

    public ShopLocationE() {
        try {
            imageE = ImageIO.read(new File("shop2E.png")); //path to shop map
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //The getWidth and getHeight functions make this scalable to any monitor size.
        g.drawImage(imageE, 0, 10, this.getWidth(), this.getHeight(), this); //drawing map
    }
}