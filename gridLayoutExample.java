// gridLayoutExample.java
import java.awt.*;    
import java.awt.event.*;   
public class gridLayoutExample extends Frame {    
	gridLayoutExample(){    
		setTitle("Grid Layout Example");
		setLayout(new GridLayout(3,3, 15, 15));    
		Button btn1 = new Button("1");    
		Button btn2 = new Button("2");    
		Button btn3 = new Button("3");    
		Button btn4 = new Button("4");    
		Button btn5 = new Button("5");    
		Button btn6 = new Button("6");    
		Button btn7 = new Button("7");    
		Button btn8 = new Button("8");   
		Button btn9 = new Button("9");   		
		    
		add(btn1); add(btn2); add(btn3);  
		add(btn4); add(btn5); add(btn6);  
		add(btn7); add(btn8); add(btn9); 
		// the windowClosing() method of WindowAdapter class  
		addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                dispose(); }    
        });
		setSize(350,150);    setVisible(true);   
	}  
	public static void main(String[] argvs){    
			new gridLayoutExample(); }    
} // end of class   
