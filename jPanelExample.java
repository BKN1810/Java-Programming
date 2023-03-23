//jPanelExample.java
import java.awt.*;
import javax.swing.*;
public class jPanelExample extends JFrame {
    private JLabel labelUsername = new JLabel("Enter username: ");
    private JLabel labelPassword = new JLabel("Enter password: ");
    private JTextField textUsername = new JTextField(10);
    private JPasswordField fieldPassword = new JPasswordField(10);
    private JButton buttonLogin = new JButton("Login");
     
    public jPanelExample() {
        super("JPanel Example");  setSize(350,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        JPanel newPanel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);
		
        constraints.gridx = 0;  constraints.gridy = 0;     
        newPanel.add(labelUsername, constraints);
        constraints.gridx = 1; 
        newPanel.add(textUsername, constraints);
        constraints.gridx = 0; constraints.gridy = 1;     
        newPanel.add(labelPassword, constraints);
        constraints.gridx = 1;
        newPanel.add(fieldPassword, constraints);
        constraints.gridx = 0; constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        newPanel.add(buttonLogin, constraints);
        // set border for the panel
        newPanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Login Panel"));
        add(newPanel); // add the panel to this frame
        setLocationRelativeTo(null);//setLocationRelativeTo(null) is used to center frame in the screen.
    }// end of constructor
	public static void main(String[] args) {
        new jPanelExample().setVisible(true);
    }// end of main functio
}// end of class
