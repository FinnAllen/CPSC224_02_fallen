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
        menu();
    }
    
    public static void menu()
    {
        int meters = getMeters();
        int selection = 0;
        
        while(selection != 4) {
            String userInput = JOptionPane.showInputDialog("Kilometers 1, Inches 2, Feet 3, Exit 4");
            selection = Integer.parseInt(userInput);
            if(selection == 1)
                showKilometers(meters);
            else if(selection == 2)
                showInches(meters);
            else if(selection == 3)
                showFeet(meters);
            else if(selection == 4)
            {
                JOptionPane.showMessageDialog(null, "Goodbye!");
                return;
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Invalid response");
            }
        }
        
    }
    
    public static int getMeters()
    {
        String userInput;  
        userInput = JOptionPane.showInputDialog("Enter an amount of meters to convert:");
        int meters = Integer.parseInt(userInput);
        
        if(meters < 0)
        {
            JOptionPane.showMessageDialog(null, "Invalid value");
            return getMeters();
        } else {
            return meters;
        }
    }
    
    public static void showKilometers(int meters)
    {
        JOptionPane.showMessageDialog(null, meters + " meters is " + (meters * 0.001) + " kilometer(s)");
    }
    
    public static void showInches(int meters)
    {
        JOptionPane.showMessageDialog(null, meters + " meters is " + (meters * 39.37) + " inch(es)");
    }
    
    public static void showFeet(int meters)
    {
        JOptionPane.showMessageDialog(null,  meters + " meters is " + (meters * 3.281) + " feet");
    } 
}
