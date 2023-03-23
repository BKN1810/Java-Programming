//LoginFrameClassExample.java
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
class LoginFrameClassExample extends JFrame implements ActionListener{
	JTextField userTF,passTF;
	LoginFrameClassExample(){
		JLabel userLabel=new JLabel("User Name");
		userLabel.setBounds(20,50, 100,20);  
		add(userLabel);
		
		
		userTF=new JTextField();
		userTF.setBounds(100,50,100,20);  
		add(userTF);
		
		JLabel passLabel=new JLabel("Password");
		passLabel.setBounds(20,80, 100,20); 
		add(passLabel);
		
		passTF=new JTextField();
		passTF.setBounds(100,80,100,20);
		add(passTF);
		
		JButton loginButton=new JButton("Login");
		loginButton.setBounds(20,110,80,30);
		add(loginButton);
		
		JButton resetButton=new JButton("Reset");
		resetButton.setBounds(100,110,80,30);
		add(resetButton);
		
		JButton closeButton=new JButton("Close");
		closeButton.setBounds(180,110,80,30);
		add(closeButton);

		resetButton.addActionListener(this);
		loginButton.addActionListener(this);
		closeButton.addActionListener(this);
		
		setSize(300,200);
		setTitle("Login Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);	
	}
	
	public void actionPerformed(ActionEvent e){
		String str=e.getActionCommand();
		if(str.equals("Reset")){
			userTF.setText("");
			passTF.setText("");
		}
		else if(str.equals("Login")){
			String uname=userTF.getText();
			String pass=passTF.getText();
			System.out.println("User Name:"+uname);
			System.out.println("password:"+pass);
			String message= "User Name: " + uname+ "\n Password: " +pass;
			JOptionPane.showMessageDialog(this,message);
		}
		else if(str.equals("Close")){
			int option=JOptionPane.showConfirmDialog(null,"Are you sure want to Exit?");  
			if(option==JOptionPane.YES_OPTION){ 
				setVisible(false);	
				new RegisterFrameGBagL();
			}
		}
	}
	
	public static void main(String[] args){
		new LoginFrameClassExample();
	}// end of main function
}// end of class
