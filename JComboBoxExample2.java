//JComboBoxExample2.java
import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
class JComboBoxExample2 extends JFrame implements ItemListener, ActionListener {  
    String names[] ={"Ram Sharma", "Hari Thapa", "Dinesh Karki"};
	
	JComboBox<String> jcb;           JLabel label;          JTextField tfield;
	JButton btnadd;                       JButton btnremove;
	
	JComboBoxExample2(){  
		setTitle("Combo Box Example");              setLayout(new FlowLayout());         
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	     setSize(700,250); 		
        // create checkbox
        jcb = new JComboBox<String>(names);             add(jcb); 
		jcb.addItemListener(this);	// add ItemListener	

		label = new JLabel("Display Name");   label.setForeground(Color.blue);
		add(label);    
		// create textfield
		tfield = new JTextField(30);   add(tfield);  
		
		btnadd = new JButton("ADD");  btnremove = new JButton("REMOVE");
		add(btnadd);                add(btnremove); 
		// add action listener
		btnadd.addActionListener(this); btnremove.addActionListener(this);
       	setVisible(true);  	
    }  // end of constructor
	
    public void actionPerformed(ActionEvent e) {  
        String str = e.getActionCommand();
		if (str.equals("ADD")) {
				jcb.addItem(tfield.getText());	}
		else {
			jcb.removeItem(tfield.getText()); } 
	}   // end of actioner listerner class
	
	public void itemStateChanged(ItemEvent e){
		if (e.getSource() == jcb) { // if the state combobox is changed
			label.setText(jcb.getSelectedItem() + " selected");	}
	}
    public static void main(String[] args) {  
        new JComboBoxExample2();  
	} // end of main function
}  // end of class
