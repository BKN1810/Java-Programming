//LoginFrameGBagL.java
//package exam;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class LoginFrameGBagL extends JFrame {
	LoginFrameGBagL(){
		setSize(350,150);
		setTitle("Login Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;  	  gbc.gridy = 0;
		gbc.gridwidth = 1; 	  gbc.gridheight=1;
		JLabel userLabel=new JLabel("User Name");
		add(userLabel,gbc);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 1;       gbc.gridy = 0;
		gbc.gridwidth = 1;   gbc.gridheight=1;
		JTextField userTF=new JTextField(15);
		add(userTF,gbc);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;      gbc.gridy = 1;
		gbc.gridwidth = 1;  gbc.gridheight=1;
		JLabel passLabel=new JLabel("Password");
		add(passLabel,gbc);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 1;         gbc.gridy = 1;
		gbc.gridwidth = 1;     gbc.gridheight=1;
		JTextField passTF=new JTextField(15);
		add(passTF,gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;  	gbc.gridy = 2;
		gbc.ipadx = 10;    	gbc.ipady = 10;
		gbc.gridwidth = 1;  gbc.gridheight=1;
		JButton loginButton=new JButton("Login");
		
		loginButton.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
					String name=userTF.getText();  
					String password= passTF.getText();  
					System.out.println("User: "+ name +"Password: "+ password);
					new RegisterFrameGBagL();
					dispose();
				}  
			});  
		add(loginButton,gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 1;   	gbc.gridy = 2;
		gbc.ipadx = 10;     gbc.ipady = 10;
		gbc.gridwidth = 1;  gbc.gridheight=1;
		JButton resetButton=new JButton("Reset");
		
		resetButton.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
					userTF.setText("");  
					passTF.setText("");  
				}  
			}); 
		add(resetButton,gbc);
		gbc.gridx = 2;       gbc.gridy = 2;
		gbc.ipadx = 10;      gbc.ipady = 10;
		gbc.gridwidth = 1;   gbc.gridheight=1;
		JButton closeButton=new JButton("Close");
		
		closeButton.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
					dispose();
				}  
			}); 
		add(closeButton,gbc);
		setVisible(true);
	}
	public static void main(String[] args){
		new LoginFrameGBagL();
	}// end of main function
}// end of class
