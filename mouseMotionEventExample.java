//mouseMotionEventExample.java
import java.awt.*;  
import java.awt.event.*;  
class mouseMotionEventExample extends Frame implements MouseMotionListener{  
    mouseMotionEventExample(){  
		setTitle("Mouse Motion Drawing!!!");  setSize(500,400);
		setLayout(null);
        addMouseMotionListener(this);  
        // the windowClosing() method of WindowAdapter class  
        addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                dispose();    }    
        }); 
        setVisible(true);  
    }  
	public void mouseDragged(MouseEvent e) {  
	    Graphics g=getGraphics();  
		g.setColor(Color.BLUE);  
		g.fillOval(e.getX(),e.getY(),10,10);  
	}  
	public void mouseMoved(MouseEvent e) {
		Graphics g=getGraphics();  
		g.setColor(Color.RED);  
		g.fillRect(e.getX(),e.getY(),20,20);  }  
  
	public static void main(String[] args) {  
		new mouseMotionEventExample();  
	} // end of main function
} // end of class
