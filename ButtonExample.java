//ButtonExample.java
import java.awt.event.*;  
import javax.swing.*;    
public class ButtonExample {  
	public static void main(String[] args) {  
		JFrame f=new JFrame(); 
		
		f.setTitle("Button Example");
		f.setSize(300,300);  
		f.setLayout(new FlowLayout());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
		JTextField tf=new JTextField();  
		tf.setBounds(50,50, 100,20);  
		
		JButton b=new JButton("Click Here");  
		b.setBounds(50,100,95,30); 
		
		b.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
					
					b.setText(tf.getText());  
				}  
			}); 
		f.add(b);    		
		f.add(tf);   	
		f.setVisible(true); 		
	}	  
}  
