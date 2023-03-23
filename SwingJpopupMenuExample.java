//SwingJpopupMenuExample.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class SwingJpopupMenuExample{
	private JFrame mainFrame;  	private JLabel headerLabel;
	private JLabel statusLabel; private JPanel controlPanel; 
	
	public SwingJpopupMenuExample(){
		mainFrame = new JFrame("Swing Popup menu Example");
		mainFrame.setSize(350,200);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	  
		mainFrame.setLayout(new GridLayout(3, 1));

		headerLabel = new JLabel("",JLabel.CENTER );
		statusLabel = new JLabel("",JLabel.CENTER);        
		statusLabel.setSize(350,100);
		controlPanel = new JPanel();
		controlPanel.setLayout(new FlowLayout());

		mainFrame.add(headerLabel); mainFrame.add(controlPanel);
		mainFrame.add(statusLabel); mainFrame.setVisible(true);  
	}
	public static void main(String[] args){
		SwingJpopupMenuExample  swingMenu = new SwingJpopupMenuExample();     
		swingMenu.showPopupMenu();
	}
    private void showPopupMenu(){
		final JPopupMenu editMenu = new JPopupMenu("Edit"); 
		JMenuItem cutMenuItem = new JMenuItem("Cut");
		cutMenuItem.setActionCommand("Cut");
		JMenuItem copyMenuItem = new JMenuItem("Copy");
		copyMenuItem.setActionCommand("Copy");
		JMenuItem pasteMenuItem = new JMenuItem("Paste");
		pasteMenuItem.setActionCommand("Paste");
		
		MenuItemListener menuItemListener = new MenuItemListener();
		
		cutMenuItem.addActionListener(menuItemListener);
		copyMenuItem.addActionListener(menuItemListener);
		pasteMenuItem.addActionListener(menuItemListener);
		editMenu.add(cutMenuItem); 	editMenu.add(copyMenuItem);
		editMenu.add(pasteMenuItem);   

		mainFrame.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {            
				editMenu.show(mainFrame, e.getX(), e.getY());
			}               
		});
		mainFrame.add(editMenu); 
		mainFrame.setVisible(true);
	}
	class MenuItemListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {            
			statusLabel.setText(e.getActionCommand() + " MenuItem clicked.");
		}    
	}   
}
