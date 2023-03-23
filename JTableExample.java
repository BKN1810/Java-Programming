//JTableExample.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.print.*;
class JTableExample {
	public static void main(String args[]) {
		//rows of the table
		Object r[][] = {
			{"Adam", "13" , "Doctor"},
			{"Anna", "21" ,"Engineer"},
			{"Annamu", "31" ,"Technician"},
			{"Norah", "11" , "Author"},
			{"Sam", "13" , "Engineer"},
			{"Kukku", "24" ,"Technician"},
			{"Remya", "31" ,"Engineer"},
			{"Radha", "42" ,"Lawyer"},
			{"Harini", "43", "Artist"},
			{"Vaibhav", "44" , "Engineer"},
		};
		Object h[] = {"Name", "Age" ,"Occupation"};
		JFrame fr = new JFrame(" Printing table");
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTable tb = new JTable(r, h);
		JScrollPane sp = new JScrollPane(tb);
		
		fr.add(sp , BorderLayout.CENTER);
		JButton button = new JButton("Print");
		ActionListener act = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					tb.print();
				} catch (PrinterException pe) {
					System.err.println("Error printing: " + pe.getMessage());
				}	
			}
		};
		button.addActionListener(act);
		fr.add(button, BorderLayout.SOUTH);
		fr.setSize(350,200);
		fr.setVisible(true);
	}// end of main function
}// end of class
