//MouseMotionAdapterExample.java
import java.awt.*;  
import java.awt.event.*;  
public class MouseMotionAdapterExample extends MouseMotionAdapter{  
    Frame frame;  
    MouseMotionAdapterExample(){  
        frame=new Frame("Mouse Motion Adapter");  
        frame.addMouseMotionListener(this);  
        frame.setSize(400,200);   frame.setLayout(null);  
		// the windowClosing() method of WindowAdapter class  
        frame.addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                frame.dispose(); }    
        });  
        frame.setVisible(true);  
    }  
	public void mouseDragged(MouseEvent e) {  
		Graphics g=frame.getGraphics();  
		g.setColor(Color.ORANGE);  
		g.fillOval(e.getX(),e.getY(),10,10);  
	}  
	public static void main(String[] args) {  
		new MouseMotionAdapterExample();  
	}// end of main function
}// end of class

