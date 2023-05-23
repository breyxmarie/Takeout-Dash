import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 

class ComboBoxExample extends JFrame implements ItemListener { 

    // frame 
    static JFrame frame; 
    // combobox 
    static JComboBox combobox; 
    // label 
    static JLabel l1, l2; 

    public static void main(String[] args) 
    {
        // create a new frame 
        frame = new JFrame("frame"); 
  
        // create an object
        ComboBoxExample obj = new ComboBoxExample(); 
  
        // set the layout of the frame 
        frame.setLayout(new FlowLayout()); 
  
        // array of strings containing languages
        String s1[] = { "Java", "PHP", "Python", "C++", "Ruby" }; 
  
        // create a checkbox
        combobox = new JComboBox(s1); 
  
        // add ItemListener
        combobox.addItemListener(obj); 
  
        // create labels
        l1 = new JLabel("What is your favorite language? "); 
        l2 = new JLabel("[Java]"); 
  
        // set the text color
        l2.setForeground(Color.blue); 
  
        // create a new panel
        JPanel p = new JPanel(); 

        // add combobox and labels to the panel
        p.add(l1);
        p.add(combobox); 
        p.add(l2); 

        // add panel to frame
        frame.add(p); 

        // set the frame size 
        frame.setSize(400, 200); 

        frame.show(); 
    } 
    public void itemStateChanged(ItemEvent e) 
    { 
        // check if the state of the combobox is changed 
        if (e.getSource() == combobox) { 
  
            l2.setText(" ["+combobox.getSelectedItem()+"]"); 
        } 
    } 
}
