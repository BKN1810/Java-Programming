//approachesOtherClass.java
import java.awt.*;
import java.awt.event.*;
class approachesOtherClass extends Frame {
	public TextField textField;
	approachesOtherClass() 	{
		textField = new TextField(30);
		setTitle(" Example for approaches Other Class");
		setSize(450,100);   setLayout(new FlowLayout());
		
		textField = new TextField(30);
		Button button = new Button("Click");
		add(textField); add(button);  
		EventHandler eventhandler = new EventHandler(this);
		button.addActionListener(eventhandler);
		
		// the windowClosing() method of WindowAdapter class  
        addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                dispose(); }    
        });
		setVisible(true);
	}
	public static void main(String[] args)	{
		new approachesOtherClass();
	}
}// end of approachesOtherClass
// implementing  the listener interface
class EventHandler implements ActionListener {
	approachesOtherClass obj;
	EventHandler(approachesOtherClass obj){
		this.obj=obj;
	}
	public void actionPerformed(ActionEvent e){
		obj.textField.setText("Aapproaches from Other Class!!!");
	}
}//end of class

