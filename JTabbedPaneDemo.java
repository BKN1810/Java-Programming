//JTabbedPaneDemo.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JTabbedPaneDemo extends JFrame {
    JTabbedPane t1;
    JPanel p1,p2,p3;   Container c;
    JLabel l1,l2,l3;
    JTextField text1,text2,text3;
    JRadioButton r21,r22,r23;
    JCheckBox ch1,ch2,ch3;
    public JTabbedPaneDemo(){
		super("Tabbed Pane Example");  setSize(500,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		t1=new JTabbedPane(JTabbedPane.LEFT);
        p1=new JPanel(); p2=new JPanel();  p3=new JPanel();
		p1.setLayout(new GridLayout(3,2));
		p2.setLayout(new GridLayout(3,1));

        l1=new JLabel("Name");  
		l2=new JLabel("Date of Birth (dd.mm.yyyy)");
        l3=new JLabel("Identification Number");
        text1=new JTextField(10);  text2=new JTextField(10);
        text3=new JTextField(10);

        p1.add(l1);  p1.add(text1);   p1.add(l2);
        p1.add(text2);  p1.add(l3);   p1.add(text3);
        
        r21=new JRadioButton("Graduate");
        r22=new JRadioButton("Post Graduate");
        r23=new JRadioButton("Ph.D");
        p2.add(r21);   p2.add(r22);   p2.add(r23);

        ch1=new JCheckBox("Computers");
        ch2=new JCheckBox("Electronics");
        ch3=new JCheckBox("Marketing");
        p3.add(ch1);   p3.add(ch2);  p3.add(ch3);

        c=getContentPane();
        c.setLayout(new GridLayout(2,2));

        t1.addTab("Personal Information",p1);
        t1.addTab("Educational Qualification",p2);
        t1.addTab("Areas of Interest",p3);
        c.add(t1);
		setVisible(true);  
        }
    public static void main(String args[]){
        new JTabbedPaneDemo();
    }// end of main function
}//end of class
