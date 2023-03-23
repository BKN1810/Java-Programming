// keyEventExample.java
import java.awt.*;    
import java.awt.event.*;    
public class keyEventExample extends Frame implements KeyListener {    
    Label label;     TextArea ta;    
    keyEventExample() {    
        setTitle(" Key Event Example!!");
		setLayout(new GridLayout(3,1, 20, 20));   
		label= new Label();    
        //label.setBounds (20, 50, 200, 20);    
        ta = new TextArea();    
        //ta.setBounds (20, 80, 300, 300);    
        ta.addKeyListener(this);    
		add(label);    add(ta);    
		// the windowClosing() method of WindowAdapter class  
		addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                dispose(); }    
        });
		setSize(300,200);
        setVisible (true);    
    }// end of constructor  
    public void keyPressed(KeyEvent e) {}    
	
    public void keyReleased (KeyEvent e) {    
        String text = ta.getText();    
        String words[] = text.split ("\\s");    
	    label.setText ("Words: " + words.length + " Characters:" + text.length());    
    }   
	
    public void keyTyped(KeyEvent e) {}    

    public static void main(String[] args) {    
        new keyEventExample();    
    } // end of main class   
}// end of class 
