//MenuEventExample.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MenuEventExample extends Frame {
	public MenuBar menubar; 
	public Menu menu1;
	public MenuItem mItem1, mItem2, mItem3, mItem4;
	public FileDialog fg;     public Label label1;
	
	public MenuEventExample() {
		super("Menu Event Example");
		setSize(400, 200);
		//Creating a menu bar
		menubar = new MenuBar();
		//Creating and adding menu item in file  menu
		menu1 = new Menu("File");
		menu1.add(mItem1=new MenuItem("New"));
		menu1.add(mItem2=new MenuItem("Open"));
		menu1.add(mItem3=new MenuItem("Exit"));
		mItem4=new MenuItem("-");     menu1.add(mItem4);
				
		myMenuHandler menuHandler = new myMenuHandler(this);
		//Adding listener to "Open" and "Exit" menu items
		mItem1.addActionListener(menuHandler); mItem2.addActionListener(menuHandler);
		mItem3.addActionListener(menuHandler);
    
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0); }
		});
		label1 = new Label("", Label.CENTER);
		//Adding my menu bar to the frame by calling setMenuBar() method
		setMenuBar(menuBar);
		add(label1,BorderLayout.CENTER);
		setVisible(true);
	}
	public static void main(String args[]) {
		new MenuEventExample();  }
}// end of class

class myMenuHandler implements ActionListener {
	public MenuEventExample menuEvent;
	public myMenuHandler(MenuEventExample menuEvent) {
			this.menuEvent = menuEvent; }
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getActionCommand().equals("Open")){
			//Creating an object of FileDialog
			menuEvent.fg = new FileDialog(menuEvent, "Open a file");
			menuEvent.fg.setVisible(true);
			String file = menuEvent.fg.getDirectory()+ menuEvent.fg.getFile();
			menuEvent.label1.setText("File to Open - " + file);
		}
		if(ae.getActionCommand().equals("Exit")){
		System.exit(0);}
		if(ae.getActionCommand().equals("New")){
		JOptionPane.showMessageDialog(menuEvent,"You Pressed menu item--New");}
	}// end of action performed function
}