/**
 * Homework: ICA1
 * Due: 1/25/19 @11:59 PM
 * @author Finnian Allen
 */
package ica1;

import javax.swing.JOptionPane;

public class ICA1 {

    public static void main(String[] args) 
    {
        menu(); // call to the menu function
    }
    
    public static void menu()
    {
        int meters = getMeters(); // assigns the meters value to the function getMeters()
        int selection = 0; // initializes the selection to 0 to enter the while loop initialy
        
        while(selection != 4) 
        {
            String userInput = JOptionPane.showInputDialog("1)Kilometers 2)Inches 3)Feet 4)Exit");
            selection = Integer.parseInt(userInput); // cast the user choice from a string to an int for the if statement later
            
            if(selection == 1) // if the user wants to convert tokilometers
                showKilometers(meters);
            else if(selection == 2) // if the user wants to convert to inches
                showInches(meters);
            else if(selection == 3) // if the user wants to convert to feet
                showFeet(meters);
            else if(selection == 4) // if the user selected to excit the program
            {
                JOptionPane.showMessageDialog(null, "Goodbye!"); // display the goodbye message
            }
            else // if the response is not an option listed
            {
                JOptionPane.showMessageDialog(null, "Invalid response"); //display the invalid input message
            }
        } 
    }
    
    public static int getMeters()
    {
        String userInput;
        userInput = JOptionPane.showInputDialog("Enter an amount of meters to convert:"); // gets the user input through a dialogue box
        int meters = Integer.parseInt(userInput); // convert the string to meters
        
        if(meters < 0) // checks to see if the users input is negative
        {
            JOptionPane.showMessageDialog(null, "Invalid value"); // display the invalid value message
            return getMeters(); // return the function to get new input, I am returning here as a normal call causes issues
        } else {
            return meters; // if the input is valid return meters
        }
    }
    
    public static void showKilometers(int meters) // convert and display the conversion given meters
    {
        JOptionPane.showMessageDialog(null, meters + " meters is " + (meters * 0.001) + " kilometer(s)");
    }
    
    public static void showInches(int meters) // convert and display the conversion given meters
    {
        JOptionPane.showMessageDialog(null, meters + " meters is " + (meters * 39.37) + " inch(es)");
    }
    
    public static void showFeet(int meters) // convert and display the conversion given meters
    {
        JOptionPane.showMessageDialog(null,  meters + " meters is " + (meters * 3.281) + " feet");
    } 
}
