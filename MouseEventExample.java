//MouseEventExample.java
import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
class MouseEventExample extends Frame implements MouseListener {
	Label label;
	public MouseEventExample(){
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
	public void mousePressed(MouseEvent me) {
		setBackground(Color.green);
		String msg= new String("Mouse Pressed at coordinates (x,y) = ");
		label.setText(msg +"("+me.getX()+", "+me.getY()+")");
	}
	public void mouseReleased(MouseEvent me){
		setBackground(Color.pink);
		String msg= new String("Mouse Released at coordinates (x,y) = ");
		label.setText(msg +"("+me.getX()+", "+me.getY()+")");
	}
	public void mouseClicked(MouseEvent me)	{
		setBackground(Color.yellow);
		String msg= new String("Mouse Clicked at coordinates (x,y) = ");
		label.setText(msg +"("+me.getX()+", "+me.getY()+")");
	}
	public void mouseEntered(MouseEvent me)	{
		setBackground(Color.red);
		String msg= new String("Mouse Entered at coordinates (x,y) = ");
		label.setText(msg +"("+me.getX()+", "+me.getY()+")");
	}
	public void mouseExited(MouseEvent me) 	{
		setBackground(Color.white);
		String msg= new String("Mouse Exited at coordinates (x,y) = ");
		label.setText(msg +"("+me.getX()+", "+me.getY()+")");
	}
	public static void main(String[] args){
		 new MouseEventExample();
	}
}//end of class
