//swingMenuExample.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class swingMenuExample extends JFrame {
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel; 

    public swingMenuExample(){
		setTitle(" SWING Menu Example");
		setSize(400,200);  setLayout(new GridLayout(3, 1));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		headerLabel = new JLabel("",JLabel.CENTER );
		statusLabel = new JLabel("",JLabel.CENTER);        
		statusLabel.setSize(250,100);
   		controlPanel = new JPanel();
		controlPanel.setLayout(new FlowLayout());

		add(headerLabel); 	add(controlPanel);
		add(statusLabel);
		setVisible(true);  
    }
    public static void main(String[] args){
		swingMenuExample  menuExample = new swingMenuExample();     
		menuExample.showMenu();
    }
    private void showMenu(){
        final JMenuBar menuBar = new JMenuBar();
 		JMenu fileMenu = new JMenu("File");
		JMenu editMenu = new JMenu("Edit"); 
		final JMenu aboutMenu = new JMenu("About");
		final JMenu linkMenu = new JMenu("Links");
        JMenuItem newMenuItem = new JMenuItem("New");
		newMenuItem.setMnemonic(KeyEvent.VK_N);
		newMenuItem.setActionCommand("New");
		
		JMenuItem openMenuItem = new JMenuItem("Open");
		openMenuItem.setActionCommand("Open");
		JMenuItem saveMenuItem = new JMenuItem("Save");
		saveMenuItem.setActionCommand("Save");
		JMenuItem exitMenuItem = new JMenuItem("Exit");
		exitMenuItem.setActionCommand("Exit");
		JMenuItem cutMenuItem = new JMenuItem("Cut");
		cutMenuItem.setActionCommand("Cut");
		JMenuItem copyMenuItem = new JMenuItem("Copy");
		copyMenuItem.setActionCommand("Copy");
		JMenuItem pasteMenuItem = new JMenuItem("Paste");
		pasteMenuItem.setActionCommand("Paste");
	
		MenuItemListener menuItemListener = new MenuItemListener();

		newMenuItem.addActionListener(menuItemListener);
		openMenuItem.addActionListener(menuItemListener);
		saveMenuItem.addActionListener(menuItemListener);
		exitMenuItem.addActionListener(menuItemListener);
		cutMenuItem.addActionListener(menuItemListener);
		copyMenuItem.addActionListener(menuItemListener);
		pasteMenuItem.addActionListener(menuItemListener);

		final JCheckBoxMenuItem showWindowMenu = new JCheckBoxMenuItem(
													"Show About", true);
		showWindowMenu.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
                if(showWindowMenu.getState()){
					menuBar.add(aboutMenu);
				} else {
					menuBar.remove(aboutMenu);}
			}
		});
		final JRadioButtonMenuItem showLinksMenu = new JRadioButtonMenuItem(
														"Show Links", true);
      		showLinksMenu.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(menuBar.getMenu(3)!= null){
					menuBar.remove(linkMenu);
					//repaint();
				} else {                   
					menuBar.add(linkMenu);
					//repaint();  
					}
				}
			});
		//add menu items to menus
		fileMenu.add(newMenuItem);    fileMenu.add(openMenuItem);
		fileMenu.add(saveMenuItem);   fileMenu.addSeparator();
		fileMenu.add(showWindowMenu); fileMenu.addSeparator();
		fileMenu.add(showLinksMenu);  fileMenu.addSeparator();
		fileMenu.add(exitMenuItem);   editMenu.add(cutMenuItem);
		editMenu.add(copyMenuItem);   editMenu.add(pasteMenuItem);
		//add menu to menubar
		menuBar.add(fileMenu);        menuBar.add(editMenu);
		menuBar.add(aboutMenu);       menuBar.add(linkMenu);
        //add menubar to the frame
		setJMenuBar(menuBar);
		setVisible(true);     
	}
    class MenuItemListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {            
			statusLabel.setText(e.getActionCommand() + " JMenuItem clicked.");
		}    
	}
}
