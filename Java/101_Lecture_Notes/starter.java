import java.util.Scanner;

class starter{
    public static void main (String[] args){
    // Your Code Goes here!
    System.out.println("Welcome to Svar's resturant!");
    System.out.print("1. burger - ");
    double item1Price = 8.15;
    System.out.println(item1Price);

    System.out.println("2. hotdog - ");
    double item2Price = 6.10;
    System.out.println(item2Price);

    System.out.println("3. steak - ");
    double item3Price = 16.70;
    System.out.println(item3Price);

    Scanner sc = new Scanner(System.in);
    System.out.println("How many pieces of steak would you like?");
    int item3Quantity = sc.nextInt();
    System.out.println("Item 3 Total is: " + (item3Price * item3Quantity));

    System.out.println("How many pieces of hotdog would you like?");
    int item2Quantity = sc.nextInt();
    System.out.println("Item 2 Total is: " + (item2Price * item2Quantity));
    System.out.println("How many pieces of burger would you like?");
    int item1Quantity = sc.nextInt();
    
    
    System.out.println("Item 1 Total is: " + (item1Price * item1Quantity)); 
    System.out.println("Your total is: " + ((item1Price * item1Quantity) + (item2Price * item2Quantity) + (item3Price * item3Quantity))); 
    System.out.println("Please enter your payment amount: ");
    double payment = sc.nextDouble();
    double change = payment - ((item1Price * item1Quantity) + (item2Price * item2Quantity) + (item3Price * item3Quantity));
    System.out.println("Thank you for your order!");  
    System.out.println("Your change is: $ " + change);
    
    }
}