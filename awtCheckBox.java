//awtCheckBox.java
import java.awt.*; 
import java.awt.event.*; 
public class awtCheckBox {  
	awtCheckBox(){
		Frame fm= new Frame("AWT Checkbox Example");  
		Checkbox ckbox1 = new Checkbox("Best", true);  
		ckbox1.setBounds(100,100, 60,60);  
		Checkbox ckbox2 = new Checkbox("Good");  
		ckbox2.setBounds(100,180, 60,60);  
		Checkbox ckbox3 = new Checkbox("Bad");  
		ckbox3.setBounds(100,260, 60,60); 
		fm.add(ckbox1);   fm.add(ckbox2);  	fm.add(ckbox3);
		fm.setSize(400,400);   fm.setLayout(null);   
		// the windowClosing() method of WindowAdapter class  
        fm.addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                fm.dispose(); }    
        });
		fm.setVisible(true); 
	}  
  public static void main(String args[])  {  
    new awtCheckBox();  }  
} // end of class  
  