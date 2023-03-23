//JComboBoxExample.java
import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
public class JComboBoxExample extends JFrame implements ActionListener{  
    String names[] ={"Ram Sharma", "Hari Thapa", "Dinesh Karki","Prabesh Thapa"};
	JComboBox<String> jcb;             JLabel label;
	JComboBoxExample(){  
		setTitle("Combo Box Example");   setLayout(new FlowLayout());         
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	  setSize(400,250); 		
        // create checkbox
        jcb = new JComboBox<String>(names);
		jcb.addActionListener(this);               add(jcb);               

		label = new JLabel("select Name");   label.setForeground(Color.blue);
		add(label);    
       	setVisible(true);  	
    }  // end of constructor
    public void actionPerformed(ActionEvent e) {  
        String str= jcb.getSelectedItem().toString(); 
        label.setText(str);     }   // end of actioner listerner class
		
    public static void main(String[] args) {  
        new JComboBoxExample();  } // end of main function
}  // end of class
