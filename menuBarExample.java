//menuBarExample.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class menuBarExample extends Frame implements ActionListener{
	MenuBar menuBar;    Menu menu1, menu2; 
	MenuItem mItem1, mItem2, mItem3, mItem4;
	MenuItem mItem5, mItem6, mItem7;
	FileDialog fg;          	Label label1;
	menuBarExample(){
		setTitle("MenuBar Example");
		//Creating a menu bar
		menuBar= new MenuBar();
		//Creating and adding menu item in file  menu
		menu1 = new Menu("File");
		menu1.add(mItem1=new MenuItem("New"));
		menu1.add(mItem2=new MenuItem("Open"));
		menu1.add(mItem3=new MenuItem("Exit"));
		mItem4=new MenuItem("-");        menu1.add(mItem4);
		//Creating a second sub-menu
		menu2 = new Menu("Save-as");
		menu2.add(mItem5=new MenuItem(".jpeg"));
		menu2.add(mItem6=new MenuItem("png"));
		menu2.add(mItem7=new MenuItem(".pdf"));
		//Adding the sub-menu to the first menu
		menu1.add(menu2);
		//Adding our menu  to the menu bar
		menuBar.add(menu1);
		//Adding listener to "Open" and "Exit" menu items
		mItem2.addActionListener(this); mItem1.addActionListener(this);
		mItem3.addActionListener(this);
		label1 = new Label("", Label.CENTER);
		//Adding my menu bar to the frame by calling setMenuBar() method
		setMenuBar(menuBar);
		add(label1,BorderLayout.CENTER);
		setSize(350,250);
		setVisible(true);
	}// end of constructor
	public void actionPerformed(ActionEvent ae){
		if(ae.getActionCommand().equals("Open")){
			//Creating an object of FileDialog
			fg = new FileDialog(this, "Open a file");
			fg.setVisible(true);
			String file = fg.getDirectory()+ fg.getFile();
			label1.setText("File to Open - " + file);
		}
		if(ae.getActionCommand().equals("Exit")){
		System.exit(0);}
		if(ae.getActionCommand().equals("New")){
		JOptionPane.showMessageDialog(this,"You Pressed menu item--New");}
	}// end of action performed function
	public static void main(String[] ar){
		new menuBarExample();}
}// end of class
