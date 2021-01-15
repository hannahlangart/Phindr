import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GradientPanel extends JPanel {

    private BufferedImage logo;

    public GradientPanel(String path) {
        try {
            logo = ImageIO.read(new File(path)); //path to Logo
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    //Will allow the creation of a panel with a green faded background and the PhabPharmacy Logo
    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);

        int w = getWidth();
        int h = getHeight();

        //dark green to light option
        Color color1 = new Color(40,128,40);
        Color color2 = new Color(144,196,144);

        GradientPaint gp = new GradientPaint(0, 0, color1, 0, h, color2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
        g2d.drawImage(logo, 125, 20, getWidth()-1000, getHeight()-550, this);
    }

}