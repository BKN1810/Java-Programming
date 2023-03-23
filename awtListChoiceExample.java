//awtListChoiceExample.java
import java.awt.*;  
import java.awt.event.*;
public class awtListChoiceExample {  
  awtListChoiceExample() {  
		Frame fm= new Frame("List and Choice example");  
		Label lab1 = new Label("List Example");
		
		lab1.setBounds(80,40, 100,20);   fm.add(lab1); 
		List ls=new List(5);   ls.setBounds(80,80, 100,100); 
		
		ls.add("Red");    ls.add("Blue");   ls.add("Black");  
		ls.add("White");  ls.add("Green");  
		fm.add(ls);  // adding list to the frame
		
		Label lab2 = new Label("Choice Example");
		lab2.setBounds(280,40, 100,20);  
		fm.add(lab2); 
	    // creating a choice 
		Choice choice=new Choice();   
		choice.setBounds(280,80, 100,100);  
		choice.add("Red");      choice.add("Blue");  
		choice.add("Black");    choice.add("Pink");  
		choice.add("White");    choice.add("Green"); 
		//adding choice to the frame
		fm.add(choice); 
		// the windowClosing() method of WindowAdapter class  
        fm.addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                fm.dispose();    
            }    
        }); 
		fm.setSize(450,250);   	fm.setLayout(null);   
		fm.setVisible(true);  
    }  
	public static void main(String args[]){  
		new awtListChoiceExample();  }  
} // end of class
  