//databaseFrame.java
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class databaseFrame extends JFrame{
	JButton submitBtn,clearBtn;
	TextArea ta;  JTable resultTable;
	JPanel panel1,panel2,panel3;
	
	databaseFrame(){
		setTitle("Database CRUD Operations!!!");
		setSize(800,600);
		setLayout(new BorderLayout(15,15));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		resultTable=new JTable(5,20);
		JScrollPane sp = new JScrollPane(resultTable);
		panel1=new JPanel();  panel1.add(sp);
		add(panel1,BorderLayout.NORTH);// adding panel-1 to the frame at top
		
		ta=new TextArea(10,60);
		panel2=new JPanel();  panel2.add(ta);
		add(panel2,BorderLayout.CENTER);// adding panel-2 to the frame at center
		
		submitBtn=new JButton("Submit");
		clearBtn=new JButton("Clear");
		panel3=new JPanel(new FlowLayout());  
		panel3.add(submitBtn); panel3.add(clearBtn);
		add(panel3,BorderLayout.SOUTH);// adding panel-3 to the frame at button
		//pack();
		setVisible(true);		
	}
	public static void main(String argvs[]){    
			new databaseFrame(); }    
}