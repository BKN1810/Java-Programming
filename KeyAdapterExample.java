// KeyAdapterExample.java
import java.awt.*;  
import java.awt.event.*;  
public class KeyAdapterExample extends KeyAdapter{  
    Label label;  TextArea tarea;  Frame frame;  
    KeyAdapterExample(){  
        frame=new Frame("Key Adapter Example !!!");  
		frame.setSize(350,200);  
		frame.setLayout(new BorderLayout(25,25));
		label=new Label();  
		frame.add(label, BorderLayout.SOUTH);   
        tarea=new TextArea(6,30);  
		frame.add(tarea, BorderLayout.NORTH);   
        tarea.addKeyListener(this);  
        // the windowClosing() method of WindowAdapter class  
        frame.addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                frame.dispose(); }    
        });    
        frame.setVisible(true);  
    }// end of constructor 
    public void keyReleased(KeyEvent e) {  
        String text=tarea.getText();  
        String words[]=text.split("\s");  
        label.setText("Words: "+ words.length +" Characters: "+text.length());  
    }  
    public static void main(String[] args) {  
        new KeyAdapterExample();  
    }// end of main function
}// end of class
