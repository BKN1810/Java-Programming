//ButtonExample2.java
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class ButtonExample2 extends JFrame{ 
	ButtonExample2(){
		setTitle("Button Event Example");
		
		JButton b=new JButton("Click");  
		add(b); //adding button on frame  
		JTextField tf=new JTextField();  
		add(tf);//adding tf on frame  
	
		b.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
					tf.setText("Swing Text Field.");  
				}  
			});
		setSize(400,200);     	setVisible(true); 
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	public static void main(String[] args) {  
		ButtonExample2 bt2=new ButtonExample2(); }	  //end of main function
}// end of class
