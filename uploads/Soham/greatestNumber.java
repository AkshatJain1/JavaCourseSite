/**
 * @(#)greatestNumber.java
 *
 *
 * @author 
 * @version 1.00 2018/7/2
 */

import java.util.Scanner;
public class greatestNumber {
	public static void main(String[] args) {
    
    
    
    Scanner keyboard= new Scanner(System.in);
int numberOne,numberTwo,numberThree;
 	   
    
    System.out.println("Enter your first number:");
    numberOne= keyboard.nextInt();
    System.out.println("Enter your second number:");
    numberTwo=keyboard.nextInt();
    System.out.println("Enter your third number:");	
    numberThree=keyboard.nextInt ();
    
   if (numberOne > numberTwo && numberOne > numberThree)
   	{ 
   		System.out.print(numberOne);
   	System.out.print(" is the greatest number your entered.");
   	
  } 
    
    
     
   if (numberTwo > numberOne && numberTwo > numberThree)
   	{ 
   		System.out.print(numberTwo);
   	System.out.print(" is the greatest number your entered.");
   	
  } 
    
    
    
     if (numberThree > numberOne && numberThree > numberTwo)
   	{ 
   		System.out.print(numberTwo);
   	System.out.print(" is the greatest number your entered.");
   	
  } 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
    
}