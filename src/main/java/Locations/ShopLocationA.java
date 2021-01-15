package Locations;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class ShopLocationA extends JPanel {

    private BufferedImage imageA;

    public ShopLocationA() {
        try {
            imageA = ImageIO.read(new File("shop2A.png")); //path to shop map
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //The getWidth and getHeight functions make this scalable to any monitor size.
        g.drawImage(imageA, 0, 10, this.getWidth(), this.getHeight(), this); //drawing map
    }
}