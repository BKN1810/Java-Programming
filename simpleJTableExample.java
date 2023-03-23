//simpleJTableExample.java
import javax.swing.*;
import java.awt.*;
public class simpleJTableExample extends JFrame {
	JTable table;
	simpleJTableExample(){
		setTitle("JTable Example");  setSize(350,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		String[] columnNames = { "Name", "CRN", "Department" };
		String[][] data = {
				{ "Ram Sharma", "131", "CSIT" },
				{ "Anand Sha", "114", "IT" },
				{ "Hari Karki", "135", "BEX" },
				{ "Kiran Thapa", "124", "BCT" }
		};
		table = new JTable(data, columnNames);
		JScrollPane scrol = new JScrollPane(table);
		add(scrol);
		setVisible(true);
	}
	public static void main(String[] args){
		new simpleJTableExample();
	}
}// end of class
