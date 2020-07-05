// Code for Beginning Java's Cake & Cupcake Shop Tutorial

import java.util.Scanner;  // Needed for the Scanner class to read input

public class custom_order {

    // STEP 1 PRINTING HELLO WORLD TO CONSOLE
    public static void main(String[] args) {
        
      System.out.println("Hello World!"); // print Hello World to console
        
    // TEST CODE
    
    // STEP 2 CREATE A SCANNER OBEJCT, DECLARE VARAIBLES, & PRINT STATEMENTS
    Scanner keyboard = new Scanner (System.in);
    
    String FirstName;
    String ItemOrder;
    String FrostingType;
    String FillingType;
    String Toppings;
    String input;       
	 
    double cost = 15.00;
    final double Tax_Rate = 0.08;
    double tax;
    
    // Introduce shop and prompt user to input first name
      
    System.out.println("Welcome to Java's Cake & CupCake Shop");
    System.out.println("We make custom cakes with our secret cake batter!");	  
	  
    // TEST CODE
    
    // STEP 3 INPUT YOUR NAME AND PREPARE TO VIEW MENU
    System.out.println("What is your First Name?");
    FirstName = keyboard.nextLine();
    
    System.out.println(FirstName + ", please see our Menu below");
    System.out.println("\n");
      
    // TEST CODE     
    
    // STEP 4 DISPLAY MENU

    System.out.println("_______________________________________________");      
    System.out.println("        MENU         QUANTITY    BASE COST  ");
    System.out.println("_______________________________________________"); 
    System.out.println("        Cake                     1            $15     ");
    System.out.println("   Set of Cupcakes       6            $15     ");
    System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
    System.out.println("Frostings (vanilla, chocolate, strawberry, coco)");
    System.out.println("Fillings (mocha, mint, lemon, caramel, raspberry)");
    System.out.println("Toppings (sprinkles, cinnamon, cocoa, nuts)");
    System.out.println("_______________________________________________");
      

    // TEST CODE     
    
    // STEP 5 PROMPT USER TO ORDER

    System.out.println("Do you want CUPCAKES or a CAKE");
    ItemOrder = keyboard.nextLine();
    
    
	  
	  
	  
      
    // TEST CODE
      
    // STEP 6 PROMPT USER TO CHOOSE FROSTING

    System.out.println("What type of FROSTING do you want?");
    System.out.println("Vanilla, Chocolate, Strawberry or Coco");
    FrostingType = keyboard.nextLine();
    
	 
	 
      
    //TEST CODE
      
    // STEP 7 PROMPT USER TO CHOOSE FILLING

    System.out.println("What type of FILLING do you want?");
    System.out.println("Mocha, Mint, Lemon, Caramel OR Raspberry");
    FillingType = keyboard.nextLine(); 
	  
	  
      
    // TEST CODE
      
    // STEP 8 PROMPT USER TO CHOOSE TOPPINGS

    System.out.println("What type of TOPPING do you want?");
    System.out.println("Sprinkles, Cinnamon, Cocoa OR Nuts");
    Toppings = keyboard.nextLine();   
      
      
    // TEST CODE
      
    // STEP 9 DISPLAY ORDER CONFIRMATION

    System.out.println();
    System.out.println(FirstName + " , your order is as follows: ");
    System.out.println("_________________________________________");
    System.out.println("Item Ordered: " + ItemOrder);
    System.out.println("Frosting: " + FrostingType);
    System.out.println("Filling: " + FillingType);
    System.out.println("Toppings: " + Toppings);
    System.out.println("_________________________________________"); 
      
	  
	  
	  
    
    // TEST CODE
      
    // STEP 10 DISPLAY COST AND SALES TAX
    System.out.printf("The cost of your order is: $%.2f\n", cost);
    tax = cost * Tax_Rate;
    System.out.printf("The tax is: $%.2f\n", tax);
    System.out.printf("The total due is: $%.2f\n",(tax + cost));
    
    
    }   
}