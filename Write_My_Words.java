
/**
 * Write a program to test the input scanner
 *
 * @author (Ms. Schulze)
 * @version (1.0)
 */

import java.util.Scanner;

public class Write_My_Words
{
    public static void main(String[] args)
    {
        String playAgain = "yes";
        
        while (playAgain.equals("yes"))
        {
            System.out.print('\u000C');
            
            //Initialize an input scanner
            Scanner user_input = new Scanner(System.in);
            
            //Define a String and input that information by user.
            String myWords;
            String mySecondWord;
            System.out.print("What do you want to say?  ");
            myWords = user_input.next();
            System.out.print("What else do you want to say?   ");
            mySecondWord = user_input.next();
            
            //Print out user's information
            System.out.println(myWords + " " + mySecondWord);
            
            int newInt;
            int newIntSquared;
            System.out.print("Give me an integer.  ");
            newInt = user_input.nextInt();
            
            newIntSquared = newInt * newInt;
            System.out.println("That number squared is:  " + newIntSquared);
        }
    }
}
