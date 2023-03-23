//RegisterFrameGBagL.java
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class RegisterFrameGBagL extends JFrame {
	RegisterFrameGBagL(){
		setSize(350,350);  	setTitle("Registration Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		//gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0; 	gbc.gridy = 0; 
		gbc.gridwidth = 1; 		gbc.gridheight=1;
		JLabel idLabel=new JLabel("ID "); 	add(idLabel,gbc);
		//gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 1;  	gbc.gridy = 0;
		gbc.gridwidth = 1; 	gbc.gridheight=1;
		JTextField idTF=new JTextField(15);  add(idTF,gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;  	gbc.gridy = 2;
		gbc.gridwidth = 1;  gbc.gridheight=1;
		JLabel fnameLabel=new JLabel("Name ");  add(fnameLabel,gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 1;  	gbc.gridy = 2;
		gbc.gridwidth = 1;  gbc.gridheight=1;
		JTextField fnameTF=new JTextField(15); 	add(fnameTF,gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;  	gbc.gridy = 3;
		gbc.gridwidth = 1;   gbc.gridheight=1;
		JLabel lnameLabel=new JLabel("Mobile "); add(lnameLabel,gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 1; 	gbc.gridy = 3;
		gbc.gridwidth = 1;  gbc.gridheight=1;
		JTextField lnameTF=new JTextField(15);  	add(lnameTF,gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0; 		gbc.gridy = 4;
		gbc.gridwidth = 1; 	gbc.gridheight=1;
		JLabel cLabel=new JLabel("Address ");  	add(cLabel,gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 1; 		gbc.gridy = 4;
		gbc.gridwidth = 1;  gbc.gridheight=1;
		JTextField cTF=new JTextField(15);  	add(cTF,gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;  	gbc.gridy = 5;  gbc.ipadx = 10; 
		gbc.ipady = 10; 	gbc.gridwidth = 1; 	gbc.gridheight=1;
		JButton loginButton=new JButton("Add "); add(loginButton,gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 1;  	gbc.gridy = 5;     gbc.ipadx = 10;
		gbc.ipady = 10; 	gbc.gridwidth = 1;  gbc.gridheight=1;
		JButton resetButton=new JButton("Reset"); add(resetButton,gbc);
		
		gbc.gridx = 2; 	gbc.gridy = 5;  gbc.ipadx = 10;
		gbc.ipady = 10; 	gbc.gridwidth = 1;   gbc.gridheight=2;
		JButton closeButton=new JButton("Close"); add(closeButton,gbc);
		
		setVisible(true);
	}
	public static void main(String[] args){
		new RegisterFrameGBagL();
	}
}// end of class
