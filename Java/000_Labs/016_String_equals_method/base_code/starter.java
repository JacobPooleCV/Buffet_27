/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	System.out.println("Which role would you like to become?");	
		String x = " Wizard";
		
		String y = " Warrior";
		
		String z = " Rogue";

		
	
	System.out.println(x + y + z);
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter your character choice ");
	String choice = sc.nextLine();
	
	System.out.println("x equals choice : " + x.equals(choice));
	
	
	}
}
