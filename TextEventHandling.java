//TextEventHandling.java
import java.awt.*;
import java.awt.event.*;

public class TextEventHandling extends Frame{
    Label label1,label2;   TextField txtField;

	public TextEventHandling() {
		setTitle("TextEvent Examples");
		setSize(300, 200);
	    setLayout(new GridLayout(3, 1));
		
		label1 = new Label("Text Listener in Action", Label.CENTER);
		label2 = new Label(" ", Label.CENTER);
		txtField = new TextField(15);
	    add(label1);   add(txtField);   add(label2);
      
		txtField.addTextListener(new TextListener() {
            @Override
            public void textValueChanged(TextEvent e) {
                label2.setText("Entered text: " + txtField.getText());
            }
        });
	   // the windowClosing() method of WindowAdapter class  
        addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                dispose();    }    
        }); 
        setVisible(true);
    }

    public static void main(String[] args) {
        new TextEventHandling();
    }
}
