//approachesWithinClass.java
import java.awt.*;
import java.awt.event.*;
class approachesWithinClass extends Frame implements ActionListener {
	TextField textField;
	approachesWithinClass(){
		setTitle(" Example for approaches Within Class");
		setSize(450,100);   setLayout(new FlowLayout());
		
		textField = new TextField(30);
		Button button = new Button("Click");
		button.addActionListener(this);
		add(textField); add(button);  
		// the windowClosing() method of WindowAdapter class  
        addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                dispose(); }    
        });
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)	{
		textField.setText("Implemented Within Class!!!");
	}
	public static void main(String[] args){
		new approachesWithinClass();
	}
}// end of class
