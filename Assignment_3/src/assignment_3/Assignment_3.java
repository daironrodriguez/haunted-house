//********************************************************************************
// Spring 2019
// DATE: 04/16/2019
// I hereby swear and affirm that this work is solely my own, and not the work 
// or the derivative of the work of someone else, except as outlined in the 
// assignment instructions.
//********************************************************************************
package assignment_3;

import java.awt.Component;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 * <h1>Main</h1>
 * This is the main class of the program it ask the user to enter his/her name 
 * and then welcome the user to the game showing  the rules of the house.
 * <p>
 * @author daironrodriguez
 * @throws java.io.IOException
 * @since   2019-04-16
 */
public class Assignment_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Component frame = null;

        String userName = (String) JOptionPane.showInputDialog( //intdroduce the name 
                frame,
                "Enter your name",
                "User name",
                JOptionPane.PLAIN_MESSAGE);

        //welcome 
        JOptionPane.showMessageDialog(frame, "Welcome to the Haunted House! "
                + userName + "\nYou can travel through the house using the "
                + "on screan comands.\n"
                + "There is also a backpack were you can store item.\n"
                + "You can store the same item in the backpack more than once\n"
                + "You have to find a key!\n"
                + "Be carefull with the ghosts that can scare you to death\n"
                + "Enjoy");

        System.out.println("Welcome to the Haunted House!\n" + userName);

        House myhouse = new House();

        //house 
        myhouse.huntedHouse(userName);

    }

}
