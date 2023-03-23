//imageIconExample.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Image;

class imageIconExample extends JFrame{
	imageIconExample(){
		setTitle("Image Icon Example");   
		setLayout(new FlowLayout());         
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	  
		setSize(300,300); 
		// Create an Icon
		ImageIcon image=new ImageIcon("C:/Users/balkr/Documents/Java/imgs/java.png");
		int width = image.getIconWidth();
        int height = image.getIconHeight();
		//Create a Labe
		JLabel label=new JLabel("Image",image, JLabel.CENTER);
		add(label);
		JLabel label2=new JLabel(" Height: "+ height+ " Width: " + width );
		add(label2);
		
		Image scaled = scaleImage(image.getImage(), width*2, height*2);
		ImageIcon scaledIcon = new ImageIcon(scaled);
        JLabel scaleLabel = new JLabel("Scaled Image",scaledIcon,JLabel.CENTER);
		add(scaleLabel);

		setVisible(true);	
	}
	public Image scaleImage(Image image, int w, int h) {
        Image scaled = image.getScaledInstance(w, h, Image.SCALE_SMOOTH);
        return scaled;
    }
	public static void main(String args[]){
		new imageIconExample();
	}
}// end of class
