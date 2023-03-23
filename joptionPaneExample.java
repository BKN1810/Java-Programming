//joptionPaneExample.java
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class joptionPaneExample extends JFrame implements ActionListener{
	JButton btn1,btn2,btn3,btn4,btn5;
	joptionPaneExample(){
		setTitle(" JOptionPane Example!!");
		setSize(350,150);   setLayout(new GridLayout(4,1,5,5));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		int alert=JOptionPane.WARNING_MESSAGE;
		btn1=new JButton("Information");  add(btn1);
		btn2=new JButton("Input");  add(btn2);
		btn3=new JButton("Warning");  add(btn3);
		btn4=new JButton("Error");  add(btn4);
		btn5=new JButton("Exit/Confirm");  add(btn5);
		btn1.addActionListener(this);  btn2.addActionListener(this);
		btn3.addActionListener(this);  btn4.addActionListener(this);
		btn5.addActionListener(this);
		setVisible(true);
	}
    public void actionPerformed(ActionEvent event) {
        String str=event.getActionCommand();
		String message=new String();
		int messageType;
		if (str.equals("Information")){
			messageType = JOptionPane.INFORMATION_MESSAGE;
			message = "Information Message";
            JOptionPane.showMessageDialog(this,message,
									"Information Dialog",messageType);
        }else if (str.equals("Input")){
			messageType = JOptionPane.QUESTION_MESSAGE; 
			String name = JOptionPane.showInputDialog("Enter your name: ");
				JOptionPane.showMessageDialog(null, "This is  " + name,
									"Input Dialog", messageType);
        }else if (str.equals("Error")){
			messageType = JOptionPane.ERROR_MESSAGE;
			message = "Error Message";
			JOptionPane.showMessageDialog(null, message,
									"Error Dialog", messageType);
        }else if (str.equals("Warning")){
			messageType = JOptionPane.WARNING_MESSAGE;
			message = "Warning Message";
			JOptionPane.showMessageDialog(null, message,
									"Warning Dialog", messageType);
        }else if (str.equals("Exit/Confirm")){
			int option=JOptionPane.showConfirmDialog(null,
									"Are you sure want to Exit?");  
			message = "We Exited...";
			messageType = JOptionPane.INFORMATION_MESSAGE;
			if(option==JOptionPane.YES_OPTION){  
				JOptionPane.showMessageDialog(this,message,
									"From Confirmation Dialog",messageType);}
		}
    }// end of constructor
	public static void main(String[] args) {
		new joptionPaneExample();
	}// end of main function
}// end of class

