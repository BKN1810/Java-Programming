//usingAnonymousClass.java
import java.awt.*;
import java.awt.event.*;
class usingAnonymousClass extends Frame {
	TextField textField;
	usingAnonymousClass(){
		textField = new TextField(30);
		setTitle(" Example for approaches Other Class");
		setSize(450,100);   setLayout(new FlowLayout());
		
		textField = new TextField(30);
		Button button = new Button("Click");
		add(textField); add(button);  
		// Registering component with listener anonymously
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				textField.setText("Implemented form Anonymous Class!!!");
			}
		});
		// the windowClosing() method of WindowAdapter class  
        addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                dispose(); }    
        });
		setVisible(true);
	}
	public static void main(String[] args){
		new usingAnonymousClass();
	}
}// end of class

