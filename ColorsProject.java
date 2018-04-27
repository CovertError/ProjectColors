import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.lang.*;
import java.awt.event.*;
/**
 * GUI JFrame called MyEventA that contains labels, text fields and buttons
 * @authors: Sira, Omar, Baha
 * @version 1.0
 */
public class ColorsProject implements ActionListener{
   ArrayList<JButton> buttons= new ArrayList<JButton>();
   public JButton checkOrder = new JButton("Check Your Order");
   public JButton checkOrderButton = new JButton();
   public JButton firstButton = null;                                     //Creating Buttons
   public JButton secondButton = null;
   public JButton checkNamesButton= new JButton("Check Your Names");
   public JButton resetGame= new JButton("Rest The Game");

   public Color firstColor = null;
   public Color secondColor = null; // Creating colors for Checking ans switching
   public Color checkColor = null;
   public Color currnetColor = new Color(255,0,0);

   public JFrame frame = new JFrame();
   public JPanel panel = new JPanel();               //creating panels and a JFrame
   public JPanel mainPanel = new JPanel();
   public JPanel checkPanel = new JPanel(new GridLayout(16,1));

   public JLabel welcomeLable= new JLabel("Welcome to the Color Game");
   public JLabel playerOne= new JLabel("Please Enter the First Player Name");      //Creating JLables
   public JLabel playerTwo= new JLabel("Please Enter the Second Player Name");

   public JTextField playerOneName = new JTextField();
   public JTextField playerTwoName = new JTextField();//Creating JtextFields
   public JTextField currentPlayer = new JTextField();
   public JTextField timerTime = new JTextField();

   public StopWatch sW = new StopWatch();// creating an object of StopWatch Class

   public boolean colorCheckBool=true; //creating a boolean

   public String player1;
   public String player2; //creating empty strings for player1 and player2

   public int colorCheck=0;
   public int playerOneTimeSec=0;//creating 0 ints variables for later use
   public int playerTwoSec=0;

   class ResetGame implements ActionListener {
      public void actionPerformed(ActionEvent checkEvent) {
         /**
          * actionPerformed Method
          * @param CheckNames
          * Resetting the game by setting all the variables to their default values.
          */
         if(checkEvent.getSource()== resetGame){
            sW.stop();
            frame.setVisible(false);
            currentPlayer.setText("");
            timerTime.setText("");
            player1="";
            player2="";
            playerOneTimeSec=0;
            playerTwoSec=0;
            playerOneName.setText("");
            playerTwoName.setText("");
            Collections.shuffle(buttons);
            for (int i = 0; i < 64; ++i) {
               panel.remove(buttons.get(i)); //removing the buttons form the panel
            }
            for (int i = 0; i < 64; ++i) {
               panel.add(buttons.get(i));// reAdding the button to the panel to mix it up
            }
            frame.setVisible(true);

         }
      }
   }

   class CheckButtons implements ActionListener {
      public void actionPerformed(ActionEvent checkEvent) {
         /**
          * actionPerformed Method
          * @param CheckNames
          * checking if the button is in the right order by taking a button from the row and comparing it with the rest of
          * the buttons of the row if they all match then stopping the timer and showing a popup message.
          */
         if (checkEvent.getSource() == checkOrder ){
            for (int i = 0; i < 64; i++) {
               System.out.println(buttons.get(i).getBackground());
               if(colorCheck<=7) {
                  colorCheck++;
                  checkOrderButton = buttons.get(7);// taking a button as a reference point
                  checkColor = checkOrderButton.getBackground(); //taking the button's color as a reference point
                  if (buttons.get(i).getBackground().equals(checkColor)) {
                     colorCheckBool = true; //if the button if the same as the rest of the buttons on the row
                  } else {
                     colorCheckBool = false;//if the buttons is the not in the right order
                     colorCheck=0;
                     break;
                  }
               }
               else if(colorCheck<=15) {
                  colorCheck++;
                  checkOrderButton = buttons.get(15);// taking a button as a reference point
                  checkColor = checkOrderButton.getBackground(); //taking the button's color as a reference point
                  if (buttons.get(i).getBackground().equals(checkColor)) {
                     colorCheckBool = true;//if the button if the same as the rest of the buttons on the row
                  } else {
                     colorCheckBool = false;//if the buttons is the not in the right order
                     colorCheck=0;
                     break;
                  }
               }
               else if(colorCheck<=23) {
                  colorCheck++;
                  checkOrderButton = buttons.get(23);// taking a button as a reference point
                  checkColor = checkOrderButton.getBackground();//taking the button's color as a reference point
                  if (buttons.get(i).getBackground().equals(checkColor)) {
                     colorCheckBool = true;//if the button if the same as the rest of the buttons on the row
                  } else {
                     colorCheckBool = false;//if the buttons is the not in the right order
                     colorCheck=0;
                     break;
                  }
               }
               else if(colorCheck<=31) {
                  colorCheck++;
                  checkOrderButton = buttons.get(31);// taking a button as a reference point
                  checkColor = checkOrderButton.getBackground();//taking the button's color as a reference point
                  if (buttons.get(i).getBackground().equals(checkColor)) {
                     colorCheckBool = true;//if the button if the same as the rest of the buttons on the row
                  } else {
                     colorCheckBool = false;//if the buttons is the not in the right order
                     colorCheck=0;
                     break;
                  }
               }
               else if(colorCheck<=39) {
                  colorCheck++;
                  checkOrderButton = buttons.get(39);// taking a button as a reference point
                  checkColor = checkOrderButton.getBackground();//taking the button's color as a reference point
                  if (buttons.get(i).getBackground().equals(checkColor)) {
                     colorCheckBool = true;//taking the button's color as a reference point
                  } else {
                     colorCheckBool = false;//if the buttons is the not in the right order
                     colorCheck=0;
                     break;
                  }
               }
               else if(colorCheck<=47) {
                  colorCheck++;
                  checkOrderButton = buttons.get(47);// taking a button as a reference point
                  checkColor = checkOrderButton.getBackground();//taking the button's color as a reference point
                  if (buttons.get(i).getBackground().equals(checkColor)) {
                     colorCheckBool = true;//taking the button's color as a reference point
                  } else {
                     colorCheckBool = false;//if the buttons is the not in the right order
                     colorCheck=0;
                     break;
                  }
               }
               else if(colorCheck<=55) {
                  colorCheck++;
                  checkOrderButton = buttons.get(55);
                  checkColor = checkOrderButton.getBackground();//taking the button's color as a reference point
                  if (buttons.get(i).getBackground().equals(checkColor)) {
                     colorCheckBool = true;//taking the button's color as a reference point
                  } else {
                     colorCheckBool = false;//if the buttons is the not in the right order
                     colorCheck=0;
                     break;
                  }
               }
               else if(colorCheck<=63) {
                  colorCheck++;
                  checkOrderButton = buttons.get(63);// taking a button as a reference point
                  checkColor = checkOrderButton.getBackground();//taking the button's color as a reference point
                  if (buttons.get(i).getBackground().equals(checkColor)) {
                     colorCheckBool = true;//taking the button's color as a reference point
                  } else {
                     colorCheckBool = false;//if the buttons is the not in the right order
                     colorCheck=0;
                     break;
                  }
                  if (colorCheck == 64) {
                     colorCheck = 0;

                  }
               }

            }

            if(colorCheckBool){
               JOptionPane.showMessageDialog(null,"Congrats Right Order","Congrats",JOptionPane.INFORMATION_MESSAGE);

               if (playerOneTimeSec ==0){
                  sW.stop();//stopping the timer
                  playerOneTimeSec= sW.getElapsedTime();//getting the time
                  String textTime=""+ playerOneTimeSec;
                  timerTime.setText(textTime);//setting the time
                  frame.setVisible(false);//setting the frame visibility to false to reshuffle the buttons
                  Collections.shuffle(buttons);//changing the buttons order
                  for (int i = 0; i < 64; ++i) {
                     panel.remove(buttons.get(i));//to remove the buttons from the panel
                  }
                  for (int i = 0; i < 64; ++i) {
                     panel.add(buttons.get(i));//to add the buttons to the panel
                  }
                  frame.setVisible(true);//shows the frame again
                  JOptionPane.showMessageDialog(null,"Player Two Start","Start",JOptionPane.INFORMATION_MESSAGE);
                  currentPlayer.setText(player2);//setting the current player
                  currentPlayer.setForeground(currnetColor);//setting the color of the text
                  sW.start();//starting the time again for the next play
               }
               else{
                  sW.stop();
                  playerTwoSec=sW.getElapsedTime();
                  if(playerOneTimeSec<playerTwoSec){
                     timerTime.setText("The Winner Player One "+player1+" "+playerOneTimeSec);
                     JOptionPane.showMessageDialog(null,"The Winner is "+player1,"Player One Congrats",JOptionPane.INFORMATION_MESSAGE);
                  }
                  else{
                     timerTime.setText("The Winner is Player Two "+player2+" "+playerTwoSec);
                     JOptionPane.showMessageDialog(null,"The Winner is"+player2,"Player Two Congrats",JOptionPane.INFORMATION_MESSAGE);
                  }

               }
            }
            else {
               JOptionPane.showMessageDialog(null,"Wrong Order","ERROR",JOptionPane.INFORMATION_MESSAGE);

            }
         }
      }
   }
   class CheckNames implements ActionListener {
      public void actionPerformed(ActionEvent checkNames){
         /**
          * actionPerformed Method with
          * @param CheckNames
          * checking if the names inputted by the user are not empty strings.
          * if they not it starts the timer and if it is then shows a popup error to the user.
          */
         if(checkNames.getSource()==checkNamesButton) {
            player1 = playerOneName.getText();
            player2 = playerTwoName.getText();
            if (player1.equals("")||player2.equals("")) {//checking if the entered names are not empty
               JOptionPane.showMessageDialog(null, "Enter A name In Player One Or Player Two", "ERROR", JOptionPane.INFORMATION_MESSAGE);
            } else {//checking if the entered names are not empty
               currentPlayer.setText(player1);
               currentPlayer.setForeground(currnetColor);
               JOptionPane.showMessageDialog(null, "Player One when your ready hit OK", "Attention", JOptionPane.INFORMATION_MESSAGE);
               sW.start();


            }
         }
      }
   }
   public void actionPerformed(ActionEvent event) {
      /**
       * actionPerformed Method with
       * @param event
       * this method is to switch the button location according to the user's request.
       */
      for (int row = 0; row < 64; row++) {//this is used for changing the position of the button
         if (event.getSource() == buttons.get(row)) {
            if (firstButton == null) {// checking if a button was selected

               firstButton = buttons.get(row);
               firstColor = firstButton.getBackground();
            }

            else if (secondButton == null) {//checking if the second button was selected
               secondButton = buttons.get(row);
               secondColor = secondButton.getBackground();
               firstButton.setBackground(secondColor);
               secondButton.setBackground(firstColor);
               firstButton = null;
               secondButton = null;
            }

         }

      }
   }

   public void Buttons(){
     /**
      * Buttons Method to place the buttons into their location.
      * And creates the buttons and sets their background color.
      * And adding an action listener to each button
      */
      int colorOp= 64;
      int m=0;

      mainPanel.setLayout(new BorderLayout());
      panel.setLayout(new GridLayout(8,8));//setting the gridlayout
      welcomeLable.setPreferredSize(new Dimension(175, 10));//setting the dimensions of the button
      checkOrder.setPreferredSize(new Dimension(175, 10));//setting the dimensions of the button
      currentPlayer.setEditable(false);
      timerTime.setEditable(false);
      checkPanel.add(welcomeLable);
      checkPanel.add(timerTime);
      checkPanel.add(playerOne);
      checkPanel.add(playerOneName);
      checkPanel.add(playerTwo);                   //adding the buttons in the right place
      checkPanel.add(playerTwoName);
      checkPanel.add(checkNamesButton);
      checkPanel.add(currentPlayer);
      checkPanel.add(checkOrder);
      checkPanel.add(resetGame);
      mainPanel.add(checkPanel,BorderLayout.WEST);
      Color [] randomColor = new Color[1];
      for (int i = 0; i < 64; ++i) {//creating the buttons and setting the colors of the buttons
            if(colorOp>=57){
              colorOp--;
              buttons.add(new JButton());//adding the buttons to the buttons ArrayList
              randomColor[m] = new Color(255, 255, 255);
              buttons.get(i).setBackground(randomColor[m]);//setting the color of the button
              buttons.get(i).addActionListener(this);//adding an actionListeners
              //System.out.println(randomColor[m]);
            }
            else if(colorOp>=49){
               colorOp--;
               buttons.add(new JButton());//adding the buttons to the buttons ArrayList
               randomColor[m] = new Color(255, 0, 255);
               buttons.get(i).setBackground(randomColor[m]);//setting the color of the button
               buttons.get(i).addActionListener(this);//adding an actionListeners
               //System.out.println(randomColor[m]);
            }
            else if(colorOp>=41){
               colorOp--;
               buttons.add(new JButton());//adding the buttons to the buttons ArrayList
               randomColor[m] = new Color(0, 255, 0);
               buttons.get(i).setBackground(randomColor[m]);//setting the color of the button
               buttons.get(i).addActionListener(this);//adding an actionListeners
               //System.out.println(randomColor[m]);
            }
            else if(colorOp>=33){
               colorOp--;
               buttons.add(new JButton());//adding the buttons to the buttons ArrayList
               randomColor[m] = new Color(0, 0, 255);
               buttons.get(i).setBackground(randomColor[m]);//setting the color of the button
               buttons.get(i).addActionListener(this);//adding an actionListeners
               //System.out.println(randomColor[m]);
            }
            else if(colorOp>=25){
               colorOp--;
               buttons.add(new JButton());//adding the buttons to the buttons ArrayList
               randomColor[m] = new Color(255, 0, 0);
               buttons.get(i).setBackground(randomColor[m]);//setting the color of the button
               buttons.get(i).addActionListener(this);//adding an actionListeners
               //System.out.println(randomColor[m]);   
            }
            else if(colorOp>=17){
               colorOp--;
               buttons.add(new JButton());//adding the buttons to the buttons ArrayList
               randomColor[m] = new Color(255, 255, 0);
               buttons.get(i).setBackground(randomColor[m]);//setting the color of the button
               buttons.get(i).addActionListener(this);//adding an actionListeners
               //System.out.println(randomColor[m]);
            }
            else if(colorOp>=9){
               colorOp--;
               buttons.add(new JButton());//adding the buttons to the buttons ArrayList
               randomColor[m] = new Color(255, 128, 0);
               buttons.get(i).setBackground(randomColor[m]);//setting the color of the button
               buttons.get(i).addActionListener(this);//adding an actionListeners
               //System.out.println(randomColor[m]);
            }
            else if(colorOp>=1){
               colorOp--;
               buttons.add(new JButton());//adding the buttons to the buttons ArrayList
               randomColor[m] = new Color(128, 0, 255);
               buttons.get(i).setBackground(randomColor[m]);//setting the color of the button
               buttons.get(i).addActionListener(this);//adding an actionListeners
               //System.out.println(randomColor[m]);
            }

      }
      CheckButtons CB = new CheckButtons();
      checkOrder.addActionListener(CB);//creating objects for the ActionListener Inner class
      CheckNames CN = new CheckNames();//creating objects for the ActionListener Inner class
      checkNamesButton.addActionListener(CN);
      ResetGame RG = new ResetGame();//creating objects for the ActionListener Inner class
      resetGame.addActionListener(RG);

      Collections.shuffle(buttons);
      for (int i = 0; i < 64; ++i) {//placing the buttons randomly
         panel.add(buttons.get(i));
         //System.out.println(buttons.get(i).getBackground());
      }
   }
   public static void main(String [] args){
      /**
       * Main method to call the buttons method and create an object of the class.
       * and setting the size of the frame and the close operation
       * and to set the application to visible
       */
      ColorsProject color = new ColorsProject();
      try{
         UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
      }
      catch (Exception e){
         e.printStackTrace();
      }
      color.Buttons();
      color.mainPanel.add(color.panel, BorderLayout.CENTER);
      color.frame.add(color.mainPanel);//adding the main panel to the frame
      color.frame.setExtendedState(JFrame.MAXIMIZED_BOTH);//expanding the frame
      color.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//the close operation
      color.frame.setVisible(true);//setting the frame visible
      JOptionPane.showMessageDialog(null, "Welcome To The Game. Please Enter Player One and Player Two Names." +
              "Start rearranging the buttons, make sure each row has only one color. When done,click on the Check Your Order button.", "Welcome To The Game", JOptionPane.INFORMATION_MESSAGE);

   }
}