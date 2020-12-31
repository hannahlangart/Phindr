import Locations.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class MapUI extends JPanel {

    private JPanel mainPanel;
    private JPanel mapPanel;
    private JPanel ShopLocationA; //each ShopLocaiton JPanel corresponds to a different shop map for each category
    private JPanel ShopLocationB;
    private JPanel ShopLocationC;
    private JPanel ShopLocationD;
    private JPanel ShopLocationE;
    private JPanel ShopLocationF;
    public String cat;
    static GraphicsConfiguration g;

    public MapUI() {

        mainPanel = new GradientPanel(); //panel with dropdown list
        GridLayout grid = new GridLayout(1, 2);
        mainPanel.setLayout(grid);

        mapPanel = new ImagePanel(); //panel with shop map
        mapPanel.setVisible(true);

        ShopLocationA=new ShopLocationA(); //panel with shop map and location
        ShopLocationB=new ShopLocationB();
        ShopLocationC=new ShopLocationC();
        ShopLocationD=new ShopLocationD();
        ShopLocationE=new ShopLocationE();
        ShopLocationF=new ShopLocationF();

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

        //A new JFrame with map location pops up when A is selected, same for each category
        JFrame A = new JFrame(g);
        A.setSize(500,500);
        A.setAlwaysOnTop(true);
        A.setTitle("Your chosen medicine location");

        JFrame B = new JFrame(g);
        B.setSize(500,500);
        B.setAlwaysOnTop(true);
        B.setTitle("Your chosen medicine location");

        JFrame C = new JFrame(g);
        C.setSize(500,500);
        C.setAlwaysOnTop(true);
        C.setTitle("Your chosen medicine location");


        JFrame D = new JFrame(g);
        D.setSize(500,500);
        D.setAlwaysOnTop(true);
        D.setTitle("Your chosen medicine location");

        JFrame E = new JFrame(g);
        E.setSize(500,500);
        E.setAlwaysOnTop(true);
        E.setTitle("Your chosen medicine location");

        JFrame F = new JFrame(g);
        F.setSize(500,500);
        F.setAlwaysOnTop(true);
        F.setTitle("Your chosen medicine location");


       ActionListener cbActionListener = new ActionListener() { //add actionlistener to listen for change
            @Override
            public void actionPerformed(ActionEvent e) {

                String s = (String) med.getSelectedItem();
                //loop HashMap
                for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                    if (s == entry.getKey().toString()) { // compares medicine selected to medicines (Key) in HashMap
                        cat = entry.getValue(); //cat is assigned the corresponding value from HashMap
                        System.out.println("Category is : " + cat); //check category selected
                        if(cat=="A"){
                            A.add(ShopLocationA);
                            A.setVisible(true);//set the proper one with map location to true and rest to false
                            B.setVisible(false);
                            C.setVisible(false);
                            D.setVisible(false);
                            E.setVisible(false);
                            F.setVisible(false);
                        }else if (cat =="B"){
                            B.add(ShopLocationB);
                            A.setVisible(false);
                            B.setVisible(true);
                            C.setVisible(false);
                            D.setVisible(false);
                            E.setVisible(false);
                            F.setVisible(false);
                        }else if (cat =="C"){
                            C.add(ShopLocationC);
                            A.setVisible(false);
                            B.setVisible(false);
                            C.setVisible(true);
                            D.setVisible(false);
                            E.setVisible(false);
                            F.setVisible(false);
                        }else if (cat =="D"){
                            D.add(ShopLocationD);
                            A.setVisible(false);
                            B.setVisible(false);
                            C.setVisible(false);
                            D.setVisible(true);
                            E.setVisible(false);
                            F.setVisible(false);
                        }else if (cat =="E"){
                            E.add(ShopLocationE);
                            A.setVisible(false);
                            B.setVisible(false);
                            C.setVisible(false);
                            D.setVisible(false);
                            E.setVisible(true);
                            F.setVisible(false);
                        }else if (cat =="F"){
                            F.add(ShopLocationF);
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

        med.addActionListener(cbActionListener);
        med.setVisible(true);
        mainPanel.add(med);
        mainPanel.add(mapPanel);
    }

    private static HashMap<String, String> createHashMap() { //HashMap allows to link each medicine (Key) to a category (Value)
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


