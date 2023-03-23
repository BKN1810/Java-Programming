//TextEventExample.java
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;
 class TextEventExample extends Frame implements TextListener { 
   TextField tf; 
   public TextEventExample() { 
        setTitle("Text Listener Example"); 
        setLayout(new FlowLayout());  	setSize(250,100); 
        tf=new TextField(15); 
		tf.addTextListener(this);        add(tf); 
        // the windowClosing() method of WindowAdapter class  
        addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                dispose();    }    
        }); 
        setVisible(true);
    } 
    public void textValueChanged(TextEvent tet)  { 
        setTitle(tf.getText());
	} 
    public static void main(String[] args){ 
        new TextEventExample(); 
    } 
  } // end of class
  