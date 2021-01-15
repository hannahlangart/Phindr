import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.startsWith;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Vector;

public class TestMedList {
    @Test
    public void testSortedComboBox(){
        Vector<String> order = new Vector<String>();
        order.addElement("Benadryl"); // adding medicines in wrong alphabetical order
        order.addElement("Cetaphil");
        order.addElement("Anadin");
        order.addElement("Cuprofen");
        SortedComboBoxModel<String> sortedModel = new SortedComboBoxModel<String>(order); // creating sortedModel with SortedComboBoxModel class
        Assert.assertEquals("Anadin", sortedModel.getElementAt(0)); // checking expected alphabetical order vs element at actual index
        Assert.assertEquals("Benadryl", sortedModel.getElementAt(1));
        Assert.assertEquals("Cetaphil", sortedModel.getElementAt(2));
        Assert.assertEquals("Cuprofen", sortedModel.getElementAt(3));
    }
}
