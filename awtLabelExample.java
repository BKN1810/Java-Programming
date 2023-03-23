//awtLabelExample.java
import java.awt.*;   
import java.awt.event.*;    
class awtLabelExample extends Frame{    
	awtLabelExample(){
		setTitle("AWT Label Exampe");
		setLayout(new FlowLayout()); 
		setSize(300,100);
		// creating the labels   
		Label l1 = new Label ("First Label.",Label.LEFT);   
		Label l2 = new Label ("Second Label.",Label.RIGHT); 
		Label l3 = new Label ("Third Label.",Label.CENTER); 
		// adding labels to the frame    
		add(l1);   add(l2);   add(l3);  
		//to close the frame
		addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                dispose();   //System.exit()0;		
			}    
        }); 
		setVisible(true);
	}
	public static void main(String args[]){   
		new awtLabelExample(); }
} // end of class   
