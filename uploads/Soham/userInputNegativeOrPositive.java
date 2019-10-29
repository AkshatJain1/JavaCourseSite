/**
 * @(#)userInputNegativeOrPositive.java
 *
 *
 * @author 
 * @version 1.00 2018/7/2
 */

import java.util.Scanner;
public class userInputNegativeOrPositive {

     public static void main(String[] args) {
    Scanner keyboard= new Scanner(System.in);
    int randomNumber;
    
   
    System.out.println("Enter a integer:");
    randomNumber= keyboard.nextInt();
    
    if (randomNumber > 0){
    	
    System.out.print( randomNumber );	
    System.out.print( " is a positive number." );		
    	}
    
    
     if (randomNumber < 0){
    	
    System.out.print( randomNumber );	
    System.out.print( " is a negative number." );		
    	}
    
    
    
    
    
    
    
    
    
    
    }
    
    
}