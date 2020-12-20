import javax.swing.*;
import java.awt.*;

public class GradientPanel extends JPanel {
    //will allow the creation of a panel with a faded background
    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);

        int w = getWidth();
        int h = getHeight();

        //light blue to blue option
        Color color1 = new Color(40,128,40);
        Color color2 = new Color(144,196,144);


        GradientPaint gp = new GradientPaint(0, 0, color1, 0, h, color2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
    }

}