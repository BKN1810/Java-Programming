//MouseAdapterExample.java
import java.awt.*;  
import java.awt.event.*;  
public class MouseAdapterExample extends MouseAdapter{  
    Frame frame;  
    MouseAdapterExample(){  
        frame=new Frame("Mouse Adapter Example");  
        frame.addMouseListener(this); 
        frame.setSize(500,350);  
        frame.setLayout(null);  
		// the windowClosing() method of WindowAdapter class  
        frame.addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                frame.dispose(); }    
        });
        frame.setVisible(true);  
    }  
    public void mouseClicked(MouseEvent e) {  
        Graphics g=frame.getGraphics();  
        g.setColor(Color.BLUE);  
		g.fillOval(e.getX(),e.getY(),20,20);
     }   
	public static void main(String[] args) {  
		new MouseAdapterExample();  
	} // end of main function 
}// end of main class
