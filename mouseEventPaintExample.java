//mouseEventPaintExample.java
import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
class mouseEventPaintExample extends Frame implements MouseListener {
	Label label;
	public mouseEventPaintExample(){
		setTitle("Mouse Event Handling Example");  setSize(400,200);
		// adding componebts to the layout 
		// adding componebts to the layout 
		setLayout(new BorderLayout(25,25));  
		label=new Label();  add(label, BorderLayout.SOUTH);    
		addMouseListener(this);		
		// the windowClosing() method of WindowAdapter class  
        addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                dispose();    }    
        }); 
        setVisible(true);
	}// end of constructor
	public void mousePressed(MouseEvent e) {
		Graphics g=getGraphics();  
		for (int i = 0; i < 10; i++)
				g.drawRect(e.getX(), e.getY() + 10 * i,100 - 10 * i, 10);
	}
	public void mouseReleased(MouseEvent e){
		Graphics g=getGraphics();  
		// inner red fill
		g.setColor(Color.RED);
		g.fillRect(e.getX(), e.getY(),50,30);
		// black outline
		g.setColor(Color.BLACK);
		g.drawRect(e.getX(), e.getY(),50,30);
		
	}
	public void mouseClicked(MouseEvent e)	{
		Graphics g=getGraphics();  
		g.setColor(Color.BLACK);
		g.fillRect(10, 30, 100, 50);
		g.setColor(Color.RED);
		g.fillOval(20, 70, 20, 20);
		g.fillOval(80, 70, 20, 20);
		g.setColor(Color.CYAN);
		g.fillRect(80, 40, 30, 20);
	}
	public void mouseEntered(MouseEvent e)	{
		repaint();
	}
	public void mouseExited(MouseEvent e) {
		Graphics g=getGraphics();  
		setBackground(Color.YELLOW);
		g.setColor(Color.MAGENTA);
		for (int i = 1; i <= 10; i++)
			g.drawOval(e.getX(), e.getY(), 20 * i, 20 * i);
	}
	public static void main(String[] args){
		 new mouseEventPaintExample();
	}
}//end of class
