import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map;
import java.io.IOException;
import java.util.Vector;

public class MapUI extends JPanel {

    private JPanel mainPanel;
    private JPanel mapPanel;
    public String cat;

    public MapUI() {

        mainPanel = new GradientPanel(); //panel with dropdown list
        GridLayout grid = new GridLayout(1, 2);
        mainPanel.setLayout(grid);



        mapPanel = new ImagePanel(); //panel with shop map
        mapPanel.setOpaque(false);
        //Graphics g= mapPanel.getGraphics();


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
        HashMap<String, String> hashMap = createHashMap();
       // dummyFrame dummyFR = new dummyFrame();

        //set a dummy Jframe to pop up when A is selected
        JFrame A = new JFrame("A");
        A.setSize(200,200);
        A.setAlwaysOnTop(true);
        A.setBackground(Color.GRAY);

        JFrame B = new JFrame("B ");
        B.setSize(200,200);
        B.setAlwaysOnTop(true);
        B.setBackground(Color.cyan);

        JFrame C = new JFrame("C ");
        C.setSize(200,200);
        C.setAlwaysOnTop(true);
        C.setBackground(Color.magenta);

        JFrame D = new JFrame("D ");
        D.setSize(200,200);
        D.setAlwaysOnTop(true);
        D.setBackground(Color.pink);

        JFrame E = new JFrame("E ");
        E.setSize(200,200);
        E.setAlwaysOnTop(true);
        E.setBackground(Color.orange);

        JFrame F = new JFrame("F ");
        F.setSize(200,200);
        F.setAlwaysOnTop(true);
        F.setBackground(Color.orange);


       ActionListener cbActionListener = new ActionListener() { //add actionlistener to listen for change
            @Override
            public void actionPerformed(ActionEvent e) {

                String s = (String) med.getSelectedItem();
                //loop HashMap
                for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                    if (s == entry.getKey().toString()) {
                        cat = entry.getValue();
                        System.out.println("Category is : " + cat);
                        if(cat=="A"){
                            A.setVisible(true);//set the proper one to true and rest to false
                            B.setVisible(false);
                            C.setVisible(false);
                            D.setVisible(false);
                            E.setVisible(false);
                            F.setVisible(false);
                        }else if (cat =="B"){
                            A.setVisible(false);
                            B.setVisible(true);
                            C.setVisible(false);
                            D.setVisible(false);
                            E.setVisible(false);
                            F.setVisible(false);
                        }else if (cat =="C"){
                            A.setVisible(false);
                            B.setVisible(false);
                            C.setVisible(true);
                            D.setVisible(false);
                            E.setVisible(false);
                            F.setVisible(false);
                        }else if (cat =="D"){
                            A.setVisible(false);
                            B.setVisible(false);
                            C.setVisible(false);
                            D.setVisible(true);
                            E.setVisible(false);
                            F.setVisible(false);
                        }else if (cat =="E"){
                            A.setVisible(false);
                            B.setVisible(false);
                            C.setVisible(false);
                            D.setVisible(false);
                            E.setVisible(true);
                            F.setVisible(false);
                        }else if (cat =="F"){
                            A.setVisible(false);
                            B.setVisible(false);
                            C.setVisible(false);
                            D.setVisible(false);
                            E.setVisible(false);
                            F.setVisible(true);
                        }
                    }

                }
            }


        };


       // drawing red circles to indicate location
        /*g.setColor(Color.red);
        else if (cat == "B") {
        g.drawOval(57,490,50,50); }
        else if (cat == "D") {
        g.drawOval(260,492,50,50); }
        else if (cat == "E") {
        g.drawOval(363,492,50,50); }
        else if (cat == "C") {
        g.drawOval(60,605,50,50); }
        else if (cat == "F") {
        g.drawOval(310, 630, 50, 50); }*/


        med.addActionListener(cbActionListener);
        med.setVisible(true);
        mainPanel.add(med);
        mainPanel.add(mapPanel);
    }

    private static HashMap<String, String> createHashMap() {
                HashMap<String, String> hashMap = new HashMap<String, String>();
                hashMap.put("Dettol", "A");
                hashMap.put("Elastoplast", "A");
                hashMap.put("TCP", "A");
                hashMap.put("E45", "B");
                hashMap.put("Eurax","B");
                hashMap.put("Eucerin","B");
                hashMap.put("Dermalex","B");
                hashMap.put("Cetaphil","B");
                hashMap.put("Nurofen","C");
                hashMap.put("Cuprofen","C");
                hashMap.put("Solpadeine","C");
                hashMap.put("Anadin","C");
                hashMap.put("Disprin","C");
                hashMap.put("Dioralyte","D");
                hashMap.put("Gaviscon","D");
                hashMap.put("Senokot","D");
                hashMap.put("Benadryl","E");
                hashMap.put("Piriteze","E");
                hashMap.put("Beconase","E");
                hashMap.put("Vicks","F");
                hashMap.put("Gsk","F");
                hashMap.put("Lemsip","F");
                hashMap.put("Sudafed","F");
                hashMap.put("Benylin","F");
                return hashMap;
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }



}


