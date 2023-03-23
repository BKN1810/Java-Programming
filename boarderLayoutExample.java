// boarderLayoutExample.java
import java.awt.*;    
import java.awt.event.*;    
public class boarderLayoutExample extends Frame {     
	boarderLayoutExample() {  
		setTitle("Boarder Layout Example");
		Label label = new Label("Label at North.");    
		TextField tf= new TextField("Text field loacted at South.");    
		Button btn1 = new Button("EAST");   
		Button btn2 = new Button("WEST");    
		TextArea ta = new TextArea("Text Area located at Centered.");  
		// adding componebts to the layout 
		setLayout(new BorderLayout(25,25));  
		add(label, BorderLayout.NORTH);    
		add(tf, BorderLayout.SOUTH);    
		add(btn1, BorderLayout.EAST);    
		add(btn2, BorderLayout.WEST);    
		add(ta, BorderLayout.CENTER);   
		// the windowClosing() method of WindowAdapter class  
		addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                dispose(); }    
        });
		setSize(350,350);    setVisible(true);    
	}    
	public static void main(String argvs[]){    
			new boarderLayoutExample(); }    
} // end of class 

