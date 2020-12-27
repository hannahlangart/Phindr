import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

public class MapUI extends JPanel {

    private JPanel mainPanel;
    private JPanel mapPanel;

    public String cat;

    public MapUI() {

        mainPanel = new GradientPanel(); //panel with dropdown list
        mapPanel = new ImagePanel(); //panel with shop map

        GridLayout grid = new GridLayout(1, 2);
        mainPanel.setLayout(grid);

        // Drop down list of all medicines available
        Vector<String> medname = new Vector<String>();
        medname.addElement("Vicks");
        medname.addElement("Gsk");
        medname.addElement("Lemsip");
        medname.addElement("Sudafed");
        medname.addElement("Benylin");
        medname.addElement("E45");
        medname.addElement("Eurax");
        medname.addElement("Eucerin");
        medname.addElement("Dermalex");
        medname.addElement("Cetaphil");
        medname.addElement("Nurofen");
        medname.addElement("Cuprofen");
        medname.addElement("Solpadeine");
        medname.addElement("Anadin");
        medname.addElement("Disprin");
        medname.addElement("Dioralyte");
        medname.addElement("Gaviscon");
        medname.addElement("Senokot");
        medname.addElement("Benadryl");
        medname.addElement("Piriteze");
        medname.addElement("Beconase");
        medname.addElement("Dettol");
        medname.addElement("Elastoplast");
        medname.addElement("TCP");
        SortedComboBoxModel<String> model = new SortedComboBoxModel<String>(medname);
        final JComboBox<String> med = new JComboBox<String>(model);

        // Giving category for selected medicine
        ActionListener cbActionListener = new ActionListener() { //add actionlistener to listen for change
            @Override
            public void actionPerformed(ActionEvent e) {

                String s = (String) med.getSelectedItem();//get the selected item

                switch (s) {//check for a match
                    case "Dettol":
                        cat = "A";
                        getCat();
                        System.out.println("Category is " + cat);
                        break;
                    case "Elastoplast":
                        cat = "A";
                        getCat();
                        System.out.println("Category is " + cat);
                        break;
                    case "TCP":
                        cat = "A";
                        getCat();
                        System.out.println("Category is " + cat);
                        break;
                    case "E45":
                        cat = "B";
                        getCat();
                        System.out.println("Category is " + cat);
                        break;
                    case "Eurax":
                        cat = "B";
                        getCat();
                        System.out.println("Category is " + cat);
                        break;
                    case "Eucerin":
                        cat = "B";
                        getCat();
                        System.out.println("Category is " + cat);
                        break;
                    case "Dermalex":
                        cat = "B";
                        getCat();
                        System.out.println("Category is " + cat);
                        break;
                    case "Cetaphil":
                        cat = "B";
                        getCat();
                        System.out.println("Category is " + cat);
                        break;
                    case "Nurofen":
                        cat = "C";
                        getCat();
                        System.out.println("Category is " + cat);
                        break;
                    case "Cuprofen":
                        cat = "C";
                        getCat();
                        System.out.println("Category is " + cat);
                        break;
                    case "Solpadeine":
                        cat = "C";
                        getCat();
                        System.out.println("Category is " + cat);
                        break;
                    case "Anadin":
                        cat = "C";
                        getCat();
                        System.out.println("Category is " + cat);
                        break;
                    case "Disprin":
                        cat = "C";
                        getCat();
                        System.out.println("Category is " + cat);
                        break;
                    case "Dioralyte":
                        cat = "D";
                        getCat();
                        System.out.println("Category is " + cat);
                        break;
                    case "Gaviscon":
                        cat = "D";
                        getCat();
                        System.out.println("Category is " + cat);
                        break;
                    case "Senokot":
                        cat = "D";
                        getCat();
                        System.out.println("Category is " + cat);
                        break;
                    case "Benadryl":
                        cat = "E";
                        getCat();
                        System.out.println("Category is " + cat);
                        break;
                    case "Piriteze":
                        cat = "E";
                        getCat();
                        System.out.println("Category is " + cat);
                        break;
                    case "Beconase":
                        cat = "E";
                        getCat();
                        System.out.println("Category is " + cat);
                        break;
                    case "Vicks":
                        cat = "F";
                        getCat();
                        System.out.println("Category is " + cat);
                        break;
                    case "Gsk":
                        cat = "F";
                        getCat();
                        System.out.println("Category is " + cat);
                        break;
                    case "Lemsip":
                        cat = "F";
                        getCat();
                        System.out.println("Category is " + cat);
                        break;
                    case "Sudafed":
                        cat = "F";
                        getCat();
                        System.out.println("Category is " + cat);
                        break;
                    case "Benylin":
                        cat = "F";
                        getCat();
                        System.out.println("Category is " + cat);
                        break;
                    default:
                        cat = " ";
                        getCat();
                        System.out.println("No category selected");
                        break;
                }
            }
        };
        med.addActionListener(cbActionListener);
        med.setVisible(true);
        mainPanel.add(med);
        mainPanel.add(mapPanel);
    }

    public String getCat() { //could allow to draw location according to category in ImagePanel
        return cat;
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}


