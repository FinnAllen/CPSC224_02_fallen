/*
 @author Finnian Allen & Graham Laird
*/


package tictactoe;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TicTacToe extends JFrame {

   private JButton button1;    // Button 1
   private JButton button2;    // Button 2
   private JButton button3;    // Button 3
   private JButton button4;    // Button 4
   private JButton button5;    // Button 5
   private JButton button6;    // Button 6
   private JButton button7;    // Button 7
   private JButton button8;    // Button 8
   private JButton button9;    // Button 9
   private JPanel panel;       // A panel to hold components
   private JLabel english;
   private final int WINDOW_WIDTH = 500; // Window width
   private final int WINDOW_HEIGHT = 500; // Window height
   private final int BUTTON_WIDTH = 150; // button width
   private final int BUTTON_HEIGHT = 100; // button height
   private String X = "X";
   
   public TicTacToe()
   {
      // Set the title bar text.
      setTitle("Tic Tac Toe");

      // Set the fonr
      //( ! ) NOT WORKING
      setFont(new Font("seriph", Font.BOLD, 24));
      //( ! ) NOT WORKING

      
      // Set the size of the window.
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

      // Specify what happens when the close button is clicked.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      // Create the three buttons.
      button1 = new JButton();
      button2 = new JButton();
      button3 = new JButton();
      button4 = new JButton();
      button5 = new JButton();
      button6 = new JButton();
      button7 = new JButton();
      button8 = new JButton();
      button9 = new JButton();
      english = new JLabel();

      // Register an event listener with all 3 buttons.
      button1.addActionListener(new ButtonListener());
      button2.addActionListener(new ButtonListener());
      button3.addActionListener(new ButtonListener());
      button4.addActionListener(new ButtonListener());
      button5.addActionListener(new ButtonListener());
      button6.addActionListener(new ButtonListener());
      button7.addActionListener(new ButtonListener());
      button8.addActionListener(new ButtonListener());
      button9.addActionListener(new ButtonListener());
      
      //create our group TODO
      //ButtonGroup group = new ButtonGroup();
      //group.add(button1);
      
      // Create a panel and add the buttons to it.
      panel = new JPanel();
      panel.add(button1);
      panel.add(button2);
      panel.add(button3);
      panel.add(button4);
      panel.add(button5);
      panel.add(button6);
      panel.add(button7);
      panel.add(button8);
      panel.add(button9);
      
      button1.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
      button2.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
      button3.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
      button4.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
      button5.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
      button6.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
      button7.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
      button8.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
      button9.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
      
      
      
      

      
      
      
      

      // Add the panel to the content pane.
      add(panel);

      // Display the window.
      setVisible(true);   
   }
   
   private class ButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
          if(e.getSource() == button1)
             button1.setText(X);
          else if(e.getSource() == button2)
              button2.setText(X);
          else if(e.getSource() == button3)
              button3.setText(X);
          else if(e.getSource() == button4)
             button4.setText(X);
          else if(e.getSource() == button5)
              button5.setText(X);
          else if(e.getSource() == button6)
              button6.setText(X);
          else if(e.getSource() == button7)
             button7.setText(X);
          else if(e.getSource() == button8)
              button8.setText(X);
          else if(e.getSource() == button9)
              button9.setText(X);
      }
   }
    
    public static void main(String[] args) {
        new TicTacToe();
    }
    
}
