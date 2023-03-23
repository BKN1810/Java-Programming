//Creating Frame Window by Instantiating Frame class
// awtFrame.java
import java.awt.*;
import java.awt.event.WindowEvent;    
import java.awt.event.WindowListener;   
import java.awt.event.WindowAdapter; 

public class awtFrame extends Frame{
	awtFrame(){
		Button b1=new Button("Button1"); //Declare a button 
		b1.setBounds(10,10,10,10); //Add button on the frame 
		// setBounds(int x-coordinate, int y-coordinate, int width, int height)
        add(b1); // Add button on the frame
		 
		Label lb = new Label("welcome to java AWT Frame Example");   
		b1.setBounds(50,50,10,10); //Add button on the frame */
		add(lb);   //adding label to the frame
		
		setTitle("This is AWT example");  //Set the title for the Frame 
		setLayout(new FlowLayout());  //Set the layout for the Frame 
		
		setSize(250,250);    //setting frame size.
		setVisible(true);     //set frame visibilty true
		
		// the windowClosing() method of WindowAdapter class  
        addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e){                    dispose();  }    
        });    
	}
	
	public static void main(String args[])  {
		awtFrame ta = new awtFrame();
	}
}// end of class