/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers to create a range for your random number");
		System.out.println("Please enter a integer");
		int small = sc.nextInt();
		System.out.println("Please enter another integer (bigger than the first):");
		int large = sc.nextInt();

		System.out.println("Your range is " + small + "to " + large);
		int num1 = Math.random()*(large-small+small);
		int num2 = Math.random()*(large-small+small);
		int num3 = Math.random()*(large-small+small);
		int num4 = Math.random()*(large-small+small);
		int num5 = Math.random()*(large-small+small);
		System.out.println(num1 + ", " + num2 + ", " + num3 + ", " + num4 +", " + num5);
	
	}
}
