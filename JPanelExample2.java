//JPanelExample2.java
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class JPanelExample2 extends JFrame{
    JPanel panel1,panel2 ;  JTextField tf;
    JButton[] btnData = new JButton[12];
    JPanelExample2() {
		setTitle("JPanel Java Example");  
		setSize(400,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
		panel1=new JPanel();
        tf = new JTextField(15);
        panel1.add(tf);     add(panel1,"North");
        panel2=new JPanel(new GridLayout(3,4));
        for(int i=0;i<=9;i++){
            btnData[i]=new JButton(""+i);
            panel2.add(btnData[i]);
        }
        add(panel2,"Center");
		setVisible(true);
     }// end of constructor

    public static void main(String[]  args) {
        JPanelExample2 frame = new JPanelExample2();
    }// end of main function
 }// end of class
 