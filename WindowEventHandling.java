//WindowEventHandling.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class WindowEventHandling {
	private Frame mainFrame,nextFrame;
    private Label mainLabel, nextFrameLabel;
    private Panel panel;
	
    public WindowEventHandling() {
        mainFrame = new Frame("Java Window Event handling!!!");
        mainFrame.setSize(400, 150);
        mainFrame.setLayout(new GridLayout(3, 1));
		
		mainLabel = new Label();     nextFrameLabel = new Label();
		mainLabel.setAlignment(Label.CENTER);
        nextFrameLabel.setAlignment(Label.CENTER);
        nextFrameLabel.setSize(100, 100);

        panel = new Panel();
        panel.setLayout(new FlowLayout());

        mainFrame.add(mainLabel);
        mainFrame.add(panel);
        mainFrame.add(nextFrameLabel);
        mainFrame.setVisible(true);
		
        mainLabel.setText("Click here to open Next Window!!!");
        nextFrame = new Frame("Next Window Listener Demo");
        nextFrame.setSize(400, 150);;
		
        nextFrame.addWindowListener(new CustomWindowListener());

        Label msgLabel = new Label("Welcome to Java Class.");
        msgLabel.setAlignment(Label.CENTER);
        msgLabel.setSize(100, 100);
        nextFrame.add(msgLabel);
		// the windowClosing() method of WindowAdapter class  
        mainFrame.addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e){                    
				mainFrame.dispose();  }    
        });  
        mainLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				nextFrame.setVisible(true);}
		});
		
    }
	class CustomWindowListener implements WindowListener {
        public void windowOpened(WindowEvent e) {
            nextFrameLabel.setText("Next Window Opened.");
			}
        public void windowClosing(WindowEvent e) {
					nextFrame.dispose();
			}
        public void windowClosed(WindowEvent e) {
            nextFrameLabel.setText("###### Next Window closed######.");
			}
		public void windowIconified(WindowEvent e) {
             JOptionPane.showMessageDialog(null,"Next Window Iconified.");
			}
        public void windowDeiconified(WindowEvent e) {
            JOptionPane.showMessageDialog(null,"Next Window Deiconified.");
			}
        public void windowActivated(WindowEvent e) {
            nextFrameLabel.setText("###### Next Window activated######.");
			}
        public void windowDeactivated(WindowEvent e) {
            nextFrameLabel.setText("######Next Window deactivated######.");
            }
    }// end of CustomWindowListener class
	public static void main(String[] args) {
        new WindowEventHandling();
    }// end of main
}// end of WindowEventHandling class


