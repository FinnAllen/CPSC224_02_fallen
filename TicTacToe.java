/*
 @author Finnian Allen & Graham Laird
*/


package tictactoe;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

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
   private JButton newGameButton;
   private JButton resetButton;
   private JButton exitButton;
   private JTextField player1;    // player 1 name
   private JTextField player2;    // player 1 name
   private JPanel panel;       // A panel to hold button components
   private JPanel playerPanel; // panel to hold player info
   private JPanel player1Panel; // panel to hold player info
   private JPanel player2Panel; // panel to hold player 2 info
   private JPanel bottomPanel;
   private JPanel buttonPanel;
   
   private JLabel statusLabel;
   private JLabel player1Losses;
   private JLabel player1Wins;
   private int player1WinCount = 0;
   private int player1LossCount = 0;
   

   private JLabel winsLabel1;
   private JLabel lossesLabel1;
   private JLabel winsLabel2;
   private JLabel lossesLabel2;
   private JLabel player2Losses;
   private JLabel player2Wins;
   private int player2WinCount = 0;
   private int player2LossCount = 0;
   
   private JLabel name;
   private JLabel name2;
   private final int WINDOW_WIDTH = 500; // Window width
   private final int WINDOW_HEIGHT = 500; // Window height
   private final int BUTTON_WIDTH = 150; // button width
   private final int BUTTON_HEIGHT = 100; // button height
   private String X = "X";
   private String O = "O";
   private String player1Name; // used for specifying turns
   private String player2Name; // used for specifying turns
   private Boolean checked1 = false;
   private Boolean checked2 = false;
   private Boolean checked3 = false;
   private Boolean checked4 = false;
   private Boolean checked5 = false;
   private Boolean checked6 = false;
   private Boolean checked7 = false;
   private Boolean checked8 = false;
   private Boolean checked9 = false;
   
   private Boolean button1Player1 = false;
   private Boolean button2Player1 = false;
   private Boolean button3Player1 = false;
   private Boolean button4Player1 = false;
   private Boolean button5Player1 = false;
   private Boolean button6Player1 = false;
   private Boolean button7Player1 = false;
   private Boolean button8Player1 = false;
   private Boolean button9Player1 = false;
   private Boolean button1Player2 = false;
   private Boolean button2Player2 = false;
   private Boolean button3Player2 = false;
   private Boolean button4Player2 = false;
   private Boolean button5Player2 = false;
   private Boolean button6Player2 = false;
   private Boolean button7Player2 = false;
   private Boolean button8Player2 = false;
   private Boolean button9Player2 = false;
   
   private Boolean inGame = false;
   
   
   private Boolean player1Turn = true; // this is used to determine whose turn it is based on button pushes
   
   public TicTacToe()
   {
      // Set the title bar text.
      setTitle("Tic-Tac-Toe");

      // Set the fonr
      //( ! ) NOT WORKING
      setFont(new Font("seriph", Font.BOLD, 24));
      //( ! ) NOT WORKING

      
      // Set the size of the window.
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

      // Specify what happens when the close button is clicked.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      // Create the three buttons.
      player1 = new JTextField(8);
      player2 = new JTextField(8);
      winsLabel1 = new JLabel("Wins:");
      lossesLabel1 = new JLabel("Losses:");
      winsLabel2 = new JLabel("Wins:");
      lossesLabel2 = new JLabel("Losses:");
      player1Wins = new JLabel("0");
      player2Wins = new JLabel("0");
      player1Losses = new JLabel("0");
      player2Losses = new JLabel("0");
      name = new JLabel("Name: ");
      name2 = new JLabel("Name: ");
      statusLabel = new JLabel("Welcome to Tic-Tac-Toe!");
      // Register an event listener with all 9 buttons.
      
      
      buildButtons();
      buildMiddlePanel();
     // player1.addActionListener(new Player1Listener());
      //player2.addActionListener(new Player2Listener());
      
      // Create a panel and add the buttons to it.
      
      
      buildPlayerPanel();
      buildBottomPanel();
      
      
      // Add the info to the window
      add(panel, BorderLayout.CENTER);
      add(playerPanel, BorderLayout.NORTH); // adds the two player panels
      add(bottomPanel, BorderLayout.SOUTH);
      
      
      // Display the window.
      setVisible(true);   
   }
   
   private void buildMiddlePanel()
   {
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
   }
   
   private void buildButtons(){
      button1 = new JButton();
      button2 = new JButton();
      button3 = new JButton();
      button4 = new JButton();
      button5 = new JButton();
      button6 = new JButton();
      button7 = new JButton();
      button8 = new JButton();
      button9 = new JButton(); 
   
      button1.addActionListener(new ButtonListener());
      button2.addActionListener(new ButtonListener());
      button3.addActionListener(new ButtonListener());
      button4.addActionListener(new ButtonListener());
      button5.addActionListener(new ButtonListener());
      button6.addActionListener(new ButtonListener());
      button7.addActionListener(new ButtonListener());
      button8.addActionListener(new ButtonListener());
      button9.addActionListener(new ButtonListener());
       
   }
   
   
   private void buildBottomPanel(){
       bottomPanel = new JPanel();
       bottomPanel.setLayout(new BorderLayout());
       
       buildButtonPanel();
       bottomPanel.add(buttonPanel);
       bottomPanel.add(statusLabel, BorderLayout.SOUTH);
       
   }
   
   private void buildButtonPanel(){
       buttonPanel = new JPanel();
       
       newGameButton = new JButton("New Game");
       resetButton = new JButton("Reset");
       exitButton = new JButton("Exit");
       newGameButton.addActionListener(new ButtonListener());
       resetButton.addActionListener(new ButtonListener());
       exitButton.addActionListener(new ButtonListener());
       
       buttonPanel.add(newGameButton);
       buttonPanel.add(resetButton);
       buttonPanel.add(exitButton);
   }
   
   private void resetGame(){
       resetBoard();
       
       statusLabel.setText("Welcome to Tic-Tac-Toe!");
       player1.setEditable(true);
       player2.setEditable(true);
       player1WinCount = 0;
       player2LossCount = 0;
       player1Wins.setText("" + player1WinCount);
       player2Losses.setText("" + player2LossCount);
       player2WinCount = 0;
       player1LossCount = 0;
       player2Wins.setText("" + player1WinCount);
       player1Losses.setText("" + player2LossCount);
       
       inGame = false;
   }
   
   private void resetBoard(){
       button1.setText("");
       button2.setText("");
       button3.setText("");
       button4.setText("");
       button5.setText("");
       button6.setText("");
       button7.setText("");
       button8.setText("");
       button9.setText("");
       
       button1Player1 = false;
       button2Player1 = false;
       button3Player1 = false;
       button4Player1 = false;
       button5Player1 = false;
       button6Player1 = false;
       button7Player1 = false;
       button8Player1 = false;
       button9Player1 = false;
       button1Player2 = false;
       button2Player2 = false;
       button3Player2 = false;
       button4Player2 = false;
       button5Player2 = false;
       button6Player2 = false;
       button7Player2 = false;
       button8Player2 = false;
       button9Player2 = false;
       
       checked1 = false;
       checked2 = false;
       checked3 = false;
       checked4 = false;
       checked5 = false;
       checked6 = false;
       checked7 = false;
       checked8 = false;
       checked9 = false;
       
       player1Turn = true;
       
       
   }
   
   private void buildPlayerPanel()
   {
        playerPanel = new JPanel();
        buildPlayerOne();
        buildPlayerTwo();
        playerPanel.add(player1Panel);
        playerPanel.add(player2Panel);
      
   }
   
   private void buildPlayerOne()
   {
        player1Panel = new JPanel();
        player1Panel.setBorder(BorderFactory.createTitledBorder("Player 1 (X)"));
        player1Panel.setLayout(new GridLayout(3, 2));
        player1Panel.add(name);
        player1Panel.add(player1);
        player1Panel.add(winsLabel1);
        player1Panel.add(player1Wins);
        player1Panel.add(lossesLabel1);
        player1Panel.add(player1Losses);    
   }
   
   private void buildPlayerTwo()
   {
        player2Panel = new JPanel();
        player2Panel.setBorder(BorderFactory.createTitledBorder("Player 2 (O)"));
        player2Panel.setLayout(new GridLayout(3, 2));
        player2Panel.add(name2);
        player2Panel.add(player2);
        player2Panel.add(winsLabel2);
        player2Panel.add(player2Wins);
        player2Panel.add(lossesLabel2);
        player2Panel.add(player2Losses);  
   
   }
   
   
   private class ButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
          String actionCommand = e.getActionCommand();
          switch (actionCommand) {
              case "New Game":
                  player1Name = player1.getText();
                  player2Name = player2.getText();
                  if(player1Name.equals("") || player2Name.equals("")){
                      JOptionPane.showMessageDialog(null, "Both names must be entered to start the game!", "ERROR", JOptionPane.ERROR_MESSAGE);
                  }
                  else{
                      player1.setEditable(false);
                      player2.setEditable(false);
                      inGame = true;
                      statusLabel.setText(player1Name + "'s turn");
                  }   break;
              case "Reset":
                  int confirm = JOptionPane.showConfirmDialog(null, "This will end the game and set the win/loss stats to 0. Are you sure?", "WARNING", JOptionPane.YES_NO_OPTION);
                  if(confirm == JOptionPane.YES_OPTION){
                      resetGame();
                  }   break;
              case "Exit":
                  System.exit(0);
              default:
                  if(player1Turn)
                  {
                      turn(e, X, player1Turn);
                      
                  }
                  else
                  {
                      turn(e, O, player1Turn);
                      
                  }     break;
          }
      }
   }
   
   private void winner(int player){
       if(player == 1){
          player1WinCount++;
          player2LossCount++;
          player1Wins.setText("" + player1WinCount);
          player2Losses.setText("" + player2LossCount);
          JOptionPane.showMessageDialog(null, player1Name + " has gotten 3 in a row!");
          resetBoard();
          
       }
       else if(player == 2){
           player2WinCount++;
           player1LossCount++;
           player2Wins.setText("" + player2WinCount);
           player1Losses.setText("" + player1LossCount); 
           JOptionPane.showMessageDialog(null, player2Name + " has gotten 3 in a row!");
           resetBoard();
           
       }
   }
   
   public void pressed()
   {
       if (checked1 && checked5 && checked9){ // diagnol from loc 1
           if(button1Player1 && button5Player1 && button9Player1){
                winner(1);
           } else if (button1Player2 && button5Player2 && button9Player2){
                winner(2);
           }     
       }
       if (checked3 && checked5 && checked7){ // diagnol from loc 3
           if(button3Player1 && button5Player1 && button7Player1){
                winner(1);
           } else if (button3Player2 && button5Player2 && button7Player2){
                winner(2);
           }
       }
       if (checked1 && checked4 && checked7){ // vertical from loc 1
           if(button1Player1 && button4Player1 && button7Player1){
                winner(1);
           } else if (button1Player2 && button4Player2 && button7Player2){
                winner(2);
           }
       }
       if (checked2 && checked5 && checked8){ // vertical from loc 2
            if(button2Player1 && button5Player1 && button8Player1){
                winner(1);
           } else if (button2Player2 && button5Player2 && button8Player2){
                winner(2);
           }
       }
       if (checked3 && checked6 && checked9){ // vertical from loc 3
           if(button3Player1 && button6Player1 && button9Player1){
                winner(1);
           } else if (button3Player2 && button6Player2 && button9Player2){
                winner(2);
           }
       }
       if(checked1 && checked2 && checked3) { // horizontal from 1
           //JOptionPane.showMessageDialog(null,"YEET");
           if(button1Player1 && button2Player1 && button3Player1){
                winner(1);      
           } else if(button1Player2 && button2Player2 && button3Player2){
                winner(2);
           }
       }
        if(checked4 && checked5 && checked6) { // horizontal from 2
           if(button4Player1 && button5Player1 && button6Player1){
                winner(1);
           } else if (button4Player2 && button5Player2 && button6Player2){
                winner(2);
           }
       }
       if(checked7 && checked8 && checked9) { // horizontal from 3
           if(button7Player1 && button8Player1 && button9Player1){
                winner(1);
           } else if (button7Player2 && button8Player2 && button9Player2){
                winner(2);
           }
       }
       if(checked1 && checked2 && checked3 && checked4 && checked5 && checked6 && checked7 && checked8 && checked9){
           JOptionPane.showMessageDialog(null, "The game has ended in a stalemate!");
           resetBoard();
           
       }
   }
   
   public void turn(ActionEvent e, String X, Boolean turn){
        if(inGame){ 
            ImageIcon puppyImage;
            puppyImage = new ImageIcon("puppy.jpg");
            ImageIcon kittensImage = new ImageIcon("kittens.jpg");
            
            if(turn){
                statusLabel.setText(player2Name + "'s turn");
            }
            else{
                statusLabel.setText(player1Name + "'s turn");
            }
            
            if(e.getSource() == button1)
            {
                
                if(!checked1){
                    
                 
                    checked1 = true;
                    
                    if(turn){
                        button1.setIcon(puppyImage);
                        pack();
                        button1Player1 = true;
                        player1Turn = false;
                        JOptionPane.showMessageDialog(null, "Button pressed " + checked1);
                    } else {
                        button1.setIcon(kittensImage);
                        pack();
                        button1Player2 = true;
                        player1Turn = true; 
                        JOptionPane.showMessageDialog(null, "Button pressed " + checked1);
                        
                    }
                    
                    pressed();
                }
            }
            else if(e.getSource() == button2)
            {
                if(!checked2){
                    
                    button2.setText(X);
                    checked2 = true;
                    
                    if(turn){
                        button2Player1 = true;
                        player1Turn = false;
                    } else {
                        button2Player2 = true;
                        player1Turn = true; 
                        
                    }
                    JOptionPane.showMessageDialog(null, "Button pressed " + checked2);
                    pressed();
                }
            }
            else if(e.getSource() == button3)
            {
                
                if(!checked3){
                    button3.setText(X);
                    checked3 = true;
                     
                    if(turn){
                        button3Player1 = true;
                        player1Turn = false;
                    } else {
                        button3Player2 = true;
                        player1Turn = true; 
                    }
                    JOptionPane.showMessageDialog(null, "Button pressed " + checked3);
                    pressed();
                }
            }
            else if(e.getSource() == button4)
            {
                if(!checked4){
                    button4.setText(X);
                    checked4 = true;
                    
                    if(turn){
                        button4Player1 = true;
                        player1Turn = false;
                    } else {
                        button4Player2 = true;
                        player1Turn = true; 
                    }
                    pressed();
                }
            }
            else if(e.getSource() == button5)
            {
                if(!checked5){
                    button5.setText(X);
                    checked5 = true;
  
                    if(turn){
                        button5Player1 = true;
                        player1Turn = false;
                    } else {
                        button5Player2 = true;
                        player1Turn = true; 
                    }
                    pressed();
                }
            }
            else if(e.getSource() == button6)
            {
                if(!checked6){
                    button6.setText(X);
                    checked6 = true;

                    if(turn){
                        button6Player1 = true;
                        player1Turn = false;
                    } else {
                        button6Player2 = true;
                        player1Turn = true; 
                    }
                    pressed();
                }
            }
            else if(e.getSource() == button7)
            {
                if(!checked7){
                    button7.setText(X);
                    checked7 = true;
                    

                    if(turn){
                        button7Player1 = true;
                        player1Turn = false;
                    } else {
                        button7Player2 = true;
                        player1Turn = true; 
                    }
                    pressed();
                }
            }
            else if(e.getSource() == button8)
            {
                if(!checked8){
                    button8.setText(X);
                    checked8 = true;
                    

                    if(turn){
                        button8Player1 = true;
                        player1Turn = false;
                    } else {
                        button8Player2 = true;
                        player1Turn = true; 
                    }
                    pressed();
                }
            }
            else if(e.getSource() == button9)
            {
                if(!checked9){
                    button9.setText(X);
                    checked9 = true;
                   
                    if(turn){
                        button9Player1 = true;
                        player1Turn = false;
                    } else {
                        button9Player2 = true;
                        player1Turn = true; 
                    }
                    pressed();
                }
            }
        }
   }
    
    public static void main(String[] args) {
        new TicTacToe();
    }
    
}
