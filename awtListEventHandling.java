//awtListEventHandling.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class awtListEventHandling extends Frame implements ItemListener {
    List ls;
    awtListEventHandling()  {
        setTitle("List Event Handling");
        setLayout(null);   setSize(300,200);
        Label lab1=new Label("Label Example");
		lab1.setBounds(80,40,100,20);    add(lab1);
        
		ls=new List(5);
        ls.setBounds(80,80,100,100);
        ls.add("Red");  ls.add("Yellow");    ls.add("Blue");
        ls.add("Green");   ls.add("Black");    add(ls);
        
		ls.addItemListener(this);
        addWindowListener (new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				dispose();
		}});
        setVisible(true);
    }
	public void itemStateChanged(ItemEvent e){
		String msg;
		if(ls.getSelectedItem()=="Red")
			msg="The selected color is Red.";
        else if(ls.getSelectedItem()=="Yellow")
            msg="The selected color is Yellow.";
        else if(ls.getSelectedItem()=="Blue")
            msg="The selected color is Blue.";
        else if(ls.getSelectedItem()=="Green")
            msg="The selected color is Green.";
        else 
			msg="The selected color is Black.";
		
		JOptionPane.showMessageDialog(this, msg);
    }
    public static void main(String args[]){
        new awtListEventHandling();
    }
} // end of class


