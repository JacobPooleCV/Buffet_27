/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	System.out.println("Welcome to the ASCII Museum!");
	System.out.println("Please choose an exhibit:");
	System.out.println("1. Food");
	System.out.println("2. Sports");
	System.out.println("3. Space");


	Scanner sc = new Scanner(System.in);
	String exhibit = sc.nextLine();

	if(exhibit.equals("food")){
		System.out.println("__ __ __ __ __");
		System.out.println("/__/__/__/__/__/|");
		System.out.println("/__/__/__/__/__/|/");
		System.out.println("|__'__'__'__'__|/");

	}
	else if(exhibit.equals("Sports")){
		System.out.println("_");
		System.out.println(",|||.");
		System.out.println("|||||");
		System.out.println("|||||/)");
		System.out.println("/,,, /");
		System.out.println("|__|");
	}
	else if(exhibit.equals("Space")){
		System.out.println("|^|");
		System.out.println("|#|");
	    System.out.println("|===|");
		System.out.println("|0|");
		System.out.println("| |");
		System.out.println("=====");
		System.out.println("_||_||_");
	}
	else{

	}
	
	
	
	
	
	
	
	
	
	}
}
