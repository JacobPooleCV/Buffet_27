/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("Welcome to the slot Machine, here are the rules:");
		System.out.println("Every player starts with 100 dollars");
		System.out.println("Put in a cost that is less than the amount of money that you have");
		System.out.println("The slot machine will rol 3 dices");
		System.out.println("If two dices match it will double your money");
		System.out.println("If none of the dices match you lose half of your money");
		
		
		
		
		
		int y = 0;
		int Y = 0;
		int yes = 0;
		int Yes = 0;
		Scanner sc = new Scanner(System.in);
		int money = 100;
		System.out.println("Would you like to play the slots? (Yes/yes/Y/y) : y ");
		String text = sc.nextLine();
		System.out.println("You have 100$. How much would you like to wager?");
		int wager = sc.nextInt();
		int a = (int)(Math.random() * 10) + 1;
		int b = (int)(Math.random() * 10) + 1;
		int c = (int)(Math.random() * 10) + 1;
		System.out.println("")
	
	
	}
}
