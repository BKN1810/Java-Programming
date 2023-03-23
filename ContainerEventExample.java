//ContainerEventExample.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ContainerEventExample {
    public ContainerEventExample() {
        Frame f = new Frame("Component Event Example!!!");
        f.setLayout(new GridLayout(2,1,15,15));
        Button b1 = new Button("Click Here");
        Button b2 = new Button("Again Click Here");
        f.setSize(350, 200);  f.add(b1);
		
		f.addContainerListener(new ContainerListener() {
			public void componentAdded(ContainerEvent e) {
                JOptionPane.showMessageDialog(null,"Button Component added.");
            }
           @Override
            public void componentRemoved(ContainerEvent e) {
                JOptionPane.showMessageDialog(null,"Buttin Component removed.");
            }
        });
		
		b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.add(b2); f.setVisible(true);}
        });
		
		b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.remove(b2);  f.setVisible(true);}
        });
		// the windowClosing() method of WindowAdapter class  
        f.addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                f.dispose(); }    
        });
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new ContainerEventExample();
    }// end of main function
}// end of class
