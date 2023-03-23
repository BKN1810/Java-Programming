//simpleTabbedPane.java
import javax.swing.*; 
import java.awt.*; 
public class simpleTabbedPane extends JFrame{  
	simpleTabbedPane(){  
		setTitle("Simple Tabbed PaneExample");
		setSize(350,150);   setLayout(new BorderLayout(15,25));  
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	  
		
		JTextArea ta=new JTextArea(50,100);  
		JPanel p1=new JPanel();    p1.add(ta);
		JPanel p2=new JPanel();    JPanel p3=new JPanel();  
		//JTabbedPane tp=new JTabbedPane(JTabbedPane.TOP);  
		//JTabbedPane tp=new JTabbedPane(JTabbedPane.BOTTOM);  
		JTabbedPane tp=new JTabbedPane(JTabbedPane.LEFT);  

		tp.add("Main",p1);    tp.add("Other",p2);  
		tp.add("Help",p3);   add(tp);  
		setVisible(true);  
	}  
	public static void main(String[] args) {  
		new simpleTabbedPane();  
	}// end of main function
}// end of class
