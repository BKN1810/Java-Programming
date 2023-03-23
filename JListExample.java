//JListExample.java
import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
import javax.swing.event.*;
public class JListExample extends JFrame implements ListSelectionListener{  
    String days[] ={"Sunday", "Monday", "Tuesday","Wednesday",
									"Thursday",	"Friday","Saturday"};
	JList<String> jlist;             JLabel label;
	
	JListExample(){  
		setTitle("List Example");   setLayout(new FlowLayout());         
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	  setSize(300,200); 		
        // create checkbox
        jlist = new JList<String>(days);
		jlist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		JScrollPane jsp=new JScrollPane(jlist); //add the list to the scroll pane
		jsp.setPreferredSize(new Dimension(120,80));// set size of scroll pane
		jsp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jsp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		label = new JLabel("Display Day");   label.setForeground(Color.blue);
		jlist.addListSelectionListener(this); //add listerner to the list
		
		add(jsp);              add(label);    
       	setVisible(true);  	
    }  // end of constructor
    
	public void valueChanged(ListSelectionEvent e){
		int idx=jlist.getSelectedIndex();
			if(idx!=-1)
				label.setText("Today is "+ days[idx]);  }   // end of actioner listerner class
	public static void main(String[] args) {  
        new JListExample();  } // end of main function
}  // end of class
