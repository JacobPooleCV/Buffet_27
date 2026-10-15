/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
 Scanner input = new Scanner(System.in);

        int number = (int)(Math.random() * 1000) + 1;

        System.out.println("Guess a number between 1 and 1000:");
        int guess = input.nextInt();

        if (guess == number)
        {
            System.out.println("You got it right!");
        }
        else if (guess > number)
        {
            System.out.println("Your guess was higher than the number.");
        }
        else
        {
            System.out.println("Your guess was lower than the number.");
        }

        System.out.println("The number was " + number);
    }
}
