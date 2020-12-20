import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;
import javax.swing.ImageIcon;


public class MapUI extends JPanel{

    GradientPanel mainPanel = new GradientPanel();
    //JButton selectMed;
    ImagePanel mapPanel=new ImagePanel();

    public MapUI(){
        GridLayout grid=new GridLayout(1,2);
        mainPanel.setLayout(grid);

        Vector<String> medname = new Vector<String>();
        medname.addElement("Select name of medicine");
        medname.addElement("Vicks");
        medname.addElement("Gsk");
        medname.addElement("Lemsip");
        medname.addElement("Sudafed");
        medname.addElement("Benylin");
        final JComboBox<String> med = new JComboBox<String>(medname);
        med.setVisible(true);
        mainPanel.add(med);
        mainPanel.add(mapPanel);

        //selectMed = new JButton("Select name of medicine");
        //mainPanel.add(selectMed);
    }

    public JPanel getMainPanel(){
        return mainPanel;
    }

}
