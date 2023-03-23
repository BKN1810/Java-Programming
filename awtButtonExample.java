//awtButtonExample.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
 public class awtButtonExample extends Frame implements ActionListener{
    awtButtonExample(){
		/* Set properties of the Frame. */
		setTitle("AWT Button Example"); setLayout(new FlowLayout());   
		setSize(300,300);
		
		Label label=new Label();
		Button bt1=new Button("Open");   Button bt2=new Button("Submit");
		Button bt3=new Button();   	bt3.setLabel("Re-submit");                
 		/* Add Buttons on the Frame. */
		add(bt1);  add(bt2);  add(bt3); add(label); 
		//Add action listener for Buttons
		bt1.addActionListener(this);
		bt2.addActionListener(this);  bt3.addActionListener(this);
 		// the windowClosing() method of WindowAdapter class  
        addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                dispose();    }    
        }); 
		setVisible(true);    
     }
	// Handling button action events
	public void actionPerformed(ActionEvent e) {
		String str=e.getActionCommand();
		String msg;
		if(str.equals("Open"))
			msg="You pressed Open Button.";
		else if (str.equals("Submit"))
			msg="You pressed Submit Button.";
		else 
			msg="You pressed Re-Submit Button.";
        JOptionPane.showMessageDialog(null,msg); 
        }
	 
    public static void main(String[] ar){
        new awtButtonExample(); }
 } // end of class
 
 
 
         
      