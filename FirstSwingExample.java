//FirstSwingExample.java
import javax.swing.*;
import java.awt.*;
class FirstSwingExample {
	public static void main(String args[]) {
		// Create a new JFrame container.
		JFrame jfrm = new JFrame();
		jfrm.setTitle("First Frame Example");
		// Create a text-based label.
		JButton button=new JButton("Submit");
		JLabel jlab = new JLabel(" Swing Label.");
		JTextField tf=new JTextField(30);
		JTextArea ta=new JTextArea(10,20);
		jfrm.add(button);
		jfrm.add(jlab);
		jfrm.add(tf);
		jfrm.add(ta);
		
		// Display the frame.
		jfrm.setSize(300,300);  
		jfrm.setLayout(new GridLayout(2,2));  
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		jfrm.setVisible(true);
	}
}
