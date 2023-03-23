//JCheckBoxExample.java
import java.awt.*; 
import javax.swing.*; 
import java.awt.event.*; 
class JCheckBoxExample extends JFrame implements ItemListener { 
	JCheckBox chbox1, chbox2,chbox3; JLabel label;
	
	JCheckBoxExample (){ 
		setTitle("Check Box Example");   
		setLayout(new FlowLayout());         
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	  
		setSize(400,150); 
		String path1="C:/Users/balkr/Documents/Java/imgs/c++.png";
		String path2="C:/Users/balkr/Documents/Java/imgs/java.png";
		String path3="C:/Users/balkr/Documents/Java/imgs/python.png";
		
		label=new JLabel("Select your Programming Language: ");
		// create checkbox 
		chbox1 = new JCheckBox(new ImageIcon(path1), false);
		chbox2 = new JCheckBox(new ImageIcon(path2), false);
		chbox3 = new JCheckBox(new ImageIcon(path3), false);		
		// add ItemListener 
		chbox1.addItemListener(this); 	chbox2.addItemListener(this); 
		chbox3.addItemListener(this);
		// create a new panel 
		JPanel panel = new JPanel(); 
		// add checkbox to panel 
		panel.add(label);     panel.add(chbox1);   panel.add(chbox2); 
		panel.add(chbox3);     add(panel); 
		setVisible(true);
	} 
	public void itemStateChanged(ItemEvent e) { 
		// if the state of checkbox1 is changed 
		if (e.getSource() == chbox1) {
			if (e.getStateChange() == 1)
				JOptionPane.showMessageDialog(this, "My Programming Language is C++.");}
		else if (e.getSource() == chbox2) {
			if (e.getStateChange() == 1)
				JOptionPane.showMessageDialog(this, "My Programming Language is Java.");}
		else if (e.getSource() == chbox3) {
			if (e.getStateChange() == 1)
				JOptionPane.showMessageDialog(this, "My Programming Language is Python.");}
		else 
			JOptionPane.showMessageDialog(this, "Programming Language Not Selected.");  
	} 
	
	public static void main(String s[]) {
		new JCheckBoxExample(); }
}//end of class

