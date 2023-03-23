//awtCheckBoxGroup.java
import javax.swing.*;
import java.awt.*; 
import java.awt.event.*;
 public class awtCheckBoxGroup extends Frame implements ItemListener {  
	CheckboxGroup cbg; Checkbox ckbox1,ckbox2,ckbox3;
	awtCheckBoxGroup(){
		/* Set properties of the Frame. */
		setTitle("Check Box Group Example"); setLayout(new FlowLayout());   
		setSize(300,100); 
		cbg = new CheckboxGroup();  // to create Check Box Group
		ckbox1 = new Checkbox("Best",cbg,false);  
		ckbox2 = new Checkbox("Good", cbg,false);  
		ckbox3 = new Checkbox("Bad", cbg, true);  
		// check box adding to the frame		
		add(ckbox1);   add(ckbox2);  	add(ckbox3);
		//aad item listener to check box 
		ckbox1.addItemListener(this);  ckbox2.addItemListener(this);
		ckbox3.addItemListener(this);
		// the windowClosing() method of WindowAdapter class  
        addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                dispose();    
            }    
        }); 
		setVisible(true); 
	} 
	public void itemStateChanged(ItemEvent e) {   
		String msg;
        if(cbg.getSelectedCheckbox()== ckbox1)  {
			msg= "You are the Best."; }
		else if(cbg.getSelectedCheckbox()== ckbox2)  {
			msg= "You are the Good."; }
		else
			msg= "You are the Bad.";
		JOptionPane.showMessageDialog(this,msg); 
    }  
	public static void main(String args[])  {  
    new awtCheckBoxGroup(); }  
}// end of the class
  