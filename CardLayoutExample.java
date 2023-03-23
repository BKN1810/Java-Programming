//CardLayoutExample.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
public class CardLayoutExample extends JFrame implements ActionListener {
	private CardLayout dealer;    private JPanel deckPanel;
 	public CardLayoutExample() {
         setSize(350,150);
         setTitle("CardLayout Demonstration");
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         Container contentPane = getContentPane( );
         contentPane.setLayout(new BorderLayout( ));
  
         deckPanel = new JPanel( );
         dealer = new CardLayout( );
         deckPanel.setLayout(dealer);
  
         JPanel startCardPanel = new JPanel( );
         startCardPanel.setLayout(new FlowLayout( ));
         startCardPanel.setBackground(Color.LIGHT_GRAY);
         JLabel startLabel = new JLabel("Hello");
         startCardPanel.add(startLabel);
         deckPanel.add("start", startCardPanel);
  
          JPanel greenCardPanel = new JPanel( );
          greenCardPanel.setLayout(new FlowLayout( ));
          greenCardPanel.setBackground(Color.GREEN);
          JLabel goLabel = new JLabel("Go");
          greenCardPanel.add(goLabel);
          deckPanel.add("green", greenCardPanel);
  
          JPanel redCardPanel = new JPanel( );
          redCardPanel.setLayout(new FlowLayout( ));
          redCardPanel.setBackground(Color.RED);
          JLabel stopLabel = new JLabel("Stop");
          redCardPanel.add(stopLabel);
          deckPanel.add("red", redCardPanel);
  
          contentPane.add(deckPanel, BorderLayout.CENTER);
  
          JPanel buttonPanel = new JPanel( );
          buttonPanel.setBackground(Color.WHITE);
          buttonPanel.setLayout(new FlowLayout( ));
          JButton stopButton = new JButton("Red");
          stopButton.addActionListener(this);
          buttonPanel.add(stopButton);
		  
          JButton goButton = new JButton("Green");
          goButton.addActionListener(this);
          buttonPanel.add(goButton);
		  
          JButton resetButton = new JButton("Reset");
          resetButton.addActionListener(this);
          buttonPanel.add(resetButton);
          contentPane.add(buttonPanel, BorderLayout.SOUTH);
          dealer.first(deckPanel);//Optional
		  setVisible(true);
     }// end of constructor
    public void actionPerformed(ActionEvent e){
         String actionCommand = e.getActionCommand( );
  
         if (actionCommand.equals("Red"))
             dealer.show(deckPanel, "red");
         else if (actionCommand.equals("Green"))
             dealer.show(deckPanel, "green");
         else if (actionCommand.equals("Reset"))
            dealer.show(deckPanel, "start");
         else
             System.out.println("Error in CardLayout Demo.");
      }
    public static void main(String[] args) {
           new CardLayoutExample(); } // end of main function
 }// end of class
  
 