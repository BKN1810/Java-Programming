//DefaultListModelExample.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class DefaultListModelExample extends JFrame {
	String[] months= { "January", "February", "March", 
						"April", "May", "June", 
						"July", "August", "September"};
					
	JList<String> list;    DefaultListModel<String> dlmodel;
	JButton addButton;   JButton removeButton;  JTextField tfield;
    
	DefaultListModelExample() {
		setTitle("Default List Example");   
		setLayout(new FlowLayout());         
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	  
		setSize(350,400); 
		
		dlmodel = new DefaultListModel<String>();
		list = new JList<String>(dlmodel);
		JScrollPane pane = new JScrollPane(list);
		
		for (String  month: months)
			dlmodel.addElement(month);
		add(pane); //adding pane to frame
		
		tfield = new JTextField(30);   add(tfield); 
		addButton = new JButton("Add");  
		removeButton = new JButton("Remove");
		add(addButton);  add(removeButton);
	
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dlmodel.addElement(tfield.getText());    
			}
		});
	
		removeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (dlmodel.getSize() > 0){
					int idx=list.getSelectedIndex();
					dlmodel.removeElementAt(idx); }
			}
		});
		setVisible(true);  	 
	}
	public static void main(String s[]) {
		new DefaultListModelExample();
	}
}//end of class
           