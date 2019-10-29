/**
 * @(#)voteEligibilaty.java
 *
 *
 * @author 
 * @version 1.00 2018/7/7
 */

import java.util.Scanner;
public class voteEligibilaty {

    public static void main(String[] args) {
    
    Scanner age = new Scanner (System.in);
    
    int userAge;
    
    System.out.println("Enter your age: ");
    
    userAge= age.nextInt();
    
    if (userAge >= 18 && userAge%2==0 ){
    System.out.print("Hey that's cool you've been voting for ");	
    System.out.print(userAge-18 );	
    System.out.print(" years! ");	
    System.out.println(" Next year your age will be odd. Isn't that fascinating?");	
    System.out.print(" So far you have voted in ");	
    System.out.print ((userAge-18)%4 );	
    System.out.print (" elections.");
    
    
    
    
    	}
    
    else if (userAge >= 18) {
    System.out.print("Hey that's cool you've been voting for ");	
    System.out.print(userAge-18 );	
    System.out.print(" years! ");	
    System.out.println(" Next year your age will be even. Isn't that fascinating?");	
    System.out.print(" So far you have voted in ");	
    System.out.print ((userAge-18)%4 );	
    System.out.print (" elections.");	
    	}
    
    if (userAge < 18 && userAge%2==0){
    	
    	System.out.println("Whoops! You are still uneligible to vote!");
    	System.out.print("You still have ");
    	System.out.print(18-userAge);
    	System.out.print(" years until you can vote.");
    	System.out.println(" Next year your age will be an odd number. Isn't that nice to know?");
    	}
   
   
   else if (userAge < 18){
   	
   	
   	    System.out.println("Whoops! You are still uneligible to vote!");
    	System.out.print("You still have ");
    	System.out.print(18-userAge);
    	System.out.print(" until you can vote.");
    	System.out.println(" Next year your age will be an even number. Isn't that nice to know?");
   	
   	
   	
   	
   	
   	
   	
   	
   	}
   
   
   
    }
    
    }
    
    
