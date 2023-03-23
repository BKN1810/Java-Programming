//swingEventExample.java
import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
public class swingEventExample extends JFrame implements ActionListener{  
	JTextField tfield; JLabel label; JButton btn;  
	
	swingEventExample(){  
				
        tfield=new JTextField();     tfield.setBounds(50,50, 100,20);  
        label=new JLabel();          label.setBounds(50,100, 100,20);      
        btn=new JButton("Submit");   btn.setBounds(50,150,100,20);  
		
        btn.addActionListener(this);    
        add(tfield); 
		add(label); 
		add(btn);               
		     
        setTitle("Swing Event Example");
		setSize(300,300);        
		setLayout(null);  
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);  
		
    }  // end of constructor
    public void actionPerformed(ActionEvent e) {  
        String str=tfield.getText();  
        label.setText(str);     
	}   // end of actioner listerner class
		
    public static void main(String[] args) {  
        new swingEventExample();  } // end of main function
}  // end of class
