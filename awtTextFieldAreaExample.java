// awtTextFieldAreaExample.java
import javax.swing.*;
import java.awt.*;  
import java.awt.event.*;
class awtTextFieldAreaExample extends Frame implements ActionListener{  
	TextField tf;     TextArea ta1,ta2;   Button btn1,btn2;
	awtTextFieldAreaExample(){
		setTitle("Text Area Example");  	setLayout(new FlowLayout()); 
		setSize(450,300);   
		
		tf=new TextField("Welcome to Textfield1.",30);  add(tf);
		btn1=new Button("Show");      add(btn1);
		int scrollBoth = TextArea.SCROLLBARS_BOTH;
		ta1=new TextArea("Welcome to Text Area.",5,20,scrollBoth);     add(ta1);
		btn2=new Button("Copy");      add(btn2);
		ta2=new TextArea("Welcome to Text Area.",5,20,scrollBoth);     add(ta2);
		
		btn1.addActionListener(this);    
		btn2.addActionListener(this);		
		// the windowClosing() method of WindowAdapter class  
        addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                dispose();  }    
        }); 
		setVisible(true);
	}
	// Handling button action events
	public void actionPerformed(ActionEvent e) {
		String str=e.getActionCommand();
		if(str.equals("Show"))
			JOptionPane.showMessageDialog(this,"You pressed Show Button."); 
		if(str.equals("Copy")){
		   String copyStr=ta1.getText();
		   ta2.setText(copyStr);
		   ta1.setText(""); }
	}
	public static void main(String args[]){  
		new awtTextFieldAreaExample(); }
} // end of Class
