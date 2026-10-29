/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the game guess a number.");
        System.out.println("Please guess a number");
        int guess = sc.nextInt();
        int number = (int)(Math.random() * 1000) + 1; 
        while (guess != number) {
            if (guess < number) {
                System.out.println("The number is higher.");
            } else {
                System.out.println("The number is lower.");
            }
            guess = sc.nextInt();
            if (guess == number){
				break;
			}
		}
		System.out.println("You guessed the number!");




	}
}
                
			
        
	