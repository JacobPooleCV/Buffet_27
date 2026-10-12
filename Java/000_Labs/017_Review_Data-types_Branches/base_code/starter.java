/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	
	String x = " Evil Jacko";
	
	String y = " Good Jacko";

	String z = " Medium Jacko";

	System.out.println("Which role would you like to become?");	
	System.out.println(x + y + z);
	Scanner sc2 = new Scanner(System.in);
	String choice2 = sc2.nextLine();


	Scanner sc = new Scanner(System.in);
	System.out.println(" Great Choice! NOW Choose your following traits. ");
	int totalPoints = 20;
	String a = " Strength(1-10)";
	String b = " Dexterity(1-10)";
	String c = " Intelligence(1-10)";
	String d = " Charisma-(1-10)";
	System.out.println(a + b + c + d);
	String choice = sc.nextLine();

	if(choice.equals("Dexterity")){
	System.out.println("Agile and moves quick");
	}
	else if(choice.equals("Strength")){
	System.out.println("Buff and able to carry larger items");
	}
	else if(choice.equals("Charisma")){
	System.out.println("How personable");
	}
	else if(choice.equals("Intelligence")){
	System.out.println("Better at magic spells");
	}
System.out.println("\n--- Character Summary ---");
System.out.println("Name:  + CharacterName");
System.out.println("Title:  + CharacterTitle");
System.out.println("Role:  + CharacterRole");
System.out.println("Strength:  + Strength");
System.out.println("Dexterity  + Dexterity");
System.out.println("Intelligence:  + Intelligence");
System.out.println("Charisma:  + Charisma");




	
	
	
	
	}
}
