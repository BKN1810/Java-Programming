//LoginFrameFlow.java
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class LoginFrameFlow extends JFrame {
	LoginFrameFlow(){
		setSize(250,150);
		setTitle("Login Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JLabel userLabel=new JLabel("User Name");
		add(userLabel);
		JTextField userTF=new JTextField(15);
		add(userTF);
		JLabel passLabel=new JLabel("Password");
		add(passLabel);
		JTextField passTF=new JTextField(15);
		add(passTF);
		JButton loginButton=new JButton("Login");
		add(loginButton);
		JButton resetButton=new JButton("Reset");
		add(resetButton);
		JButton closeButton=new JButton("Close");
		add(closeButton);
		setVisible(true);	
	}
	public static void main(String[] args){
		new LoginFrameFlow();
	}// end of main function
}// end of class
