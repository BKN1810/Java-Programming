//JRadioButtonExample.java
import java.awt.*; 
import javax.swing.*; 
import java.awt.event.*; 

public class JRadioButtonExample extends JFrame implements ActionListener{ 
		JRadioButton jrb1;  JRadioButton jrb2;  JRadioButton jrb3; 
		JButton submitBtn;   ButtonGroup groupBtn; 

	public JRadioButtonExample() { 
		setTitle("Radio Button Example");   
		setLayout(new FlowLayout());         
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	  
		setSize(400,150); 
		
		jrb1 = new JRadioButton();   jrb1.setText("Under-Graduate"); 
		jrb2 = new JRadioButton();   jrb2.setText("Graduate"); 
		jrb3 = new JRadioButton("Ph.D."); 
		JLabel label=new JLabel("Qualification");    add(label);
		submitBtn = new JButton("Submit");    
		
		groupBtn = new ButtonGroup(); //   ButtonGroup  class.  and adding radio button to the group button
		groupBtn.add(jrb1);  groupBtn.add(jrb2);  groupBtn.add(jrb3);
		add(jrb1);   add(jrb2);  add(jrb3);  //adding radio button to frame
		submitBtn.addActionListener(this);   add(submitBtn); //adding submit button
		setVisible(true);
	} 
	public void actionPerformed(ActionEvent e){ 
		String msg = " "; 
		// If jrb1is selected. 
		if (jrb1.isSelected())  
			msg = "Under-Graduate."; 
		else if (jrb2.isSelected())  
			msg = "Graduate."; 
		else if (jrb3.isSelected())  
			msg = "Ph.D.";  
		else
			msg = "No Qualification."; 
		// MessageDialog to show information selected radio buttons. 
		JOptionPane.showMessageDialog(this, "Qualification is "+ msg); 
			} 
	public static void main(String s[]) {
		new JRadioButtonExample();
	}
}//end of class

