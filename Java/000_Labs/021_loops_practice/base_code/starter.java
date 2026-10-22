/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		int randomnum = (int)(Math.random()*999)+1;
		System.out.println("Guess a number between 1 and 1000: ");
		int guess = sc.nextInt();
		while (guess != randomnum){
			if(guess > randomnum)
			System.out.println(x: " Its too high, try again!");
			guess sc.nextInt();
		}
		if(guess < randomnum){
			System.out.println(x: " Its too low, try again");
			guess sc.nextInt();
		}
		
	}
}
