// flowLayoutExample.java
import java.awt.*;    
import javax.swing.*;    
public class flowLayoutExample extends JFrame {    
	flowLayoutExample() {    
		setLayout(new FlowLayout(FlowLayout.LEFT, 20, 25));    
		setTitle("FlowLayout Example");
		setSize(100,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		// creating the buttons  
		JButton b1 = new JButton("1");    
		JButton b2 = new JButton("2");    
		JButton b3 = new JButton("3");    
		JButton b4 = new JButton("4");    
		JButton b5 = new JButton("5");  
		JButton b6 = new JButton("6");    
		JButton b7 = new JButton("7");    
		JButton b8 = new JButton("8");    
		// adding the buttons to frame        
		add(b1); add(b2); add(b3); add(b4);      
		add(b5); add(b6);  add(b7);  add(b8);    
         setVisible(true);    
    }    // end of constructor
	public static void main(String argvs[]) {    
			new flowLayoutExample(); }    
}// end of class
