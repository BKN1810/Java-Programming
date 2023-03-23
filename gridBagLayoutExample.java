// gridBagLayoutExample.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class gridBagLayoutExample extends Frame {
	gridBagLayoutExample(){
		setTitle("GridBag Layout Example");  setSize(450,250);
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
	
		gbc.fill = GridBagConstraints.HORIZONTAL;
		Button btn = new Button("Add");
		gbc.weightx = 0.5; 	gbc.gridx = 0;   gbc.gridy = 0;
		add(btn, gbc);

		Button	btn2 = new Button("Copy");
		gbc.gridx = 1;  gbc.gridy = 0;  add(btn2, gbc);
	
		Button	btn3 = new Button("Password");
		gbc.gridx = 2;  gbc.gridy = 0;  add(btn3, gbc);

		Button btn4 = new Button("Confirmed Password");
		gbc.ipady = 140; gbc.weightx = 0.0;  gbc.gridwidth = 3; 
		gbc.gridx = 0;  gbc.gridy = 1; add(btn4, gbc);

		Button btn5 = new Button("Submit");
		gbc.ipady = 0;  gbc.weighty = 1.0;
		gbc.anchor = GridBagConstraints.PAGE_END; // bottom of space
		gbc.gridx = 1;  gbc.gridwidth = 2; gbc.gridy = 2;
		add(btn5, gbc);
		
		// the windowClosing() method of WindowAdapter class  
        addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                dispose();    
            }    
        }); 
		setVisible(true);     //set frame visibilty true
	}
	public static void main(String[] args)  {
		new gridBagLayoutExample(); }
}// end of class

