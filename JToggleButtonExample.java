//JToggleButtonExample.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class JToggleButtonExample extends JFrame implements ItemListener {
	JToggleButton tbtn;      JLabel label;
	JToggleButtonExample(){
			setTitle("Toggle Button Example");   
			setLayout(new FlowLayout());         
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	  
			setSize(300,100); 
			
			label=new JLabel("Button is Off.");
			tbtn=new JToggleButton("on/Off");
			
			tbtn.addItemListener(this);
			add(label);           add(tbtn);
			setVisible(true);		
		}
		
	public void itemStateChanged(ItemEvent e) {
			if (tbtn.isSelected())
				label.setText("Button is on.");
			else
			label.setText("Button is off.");
		}
	public static void main(String s[]) {
		new JToggleButtonExample();
	}
}//end of class
