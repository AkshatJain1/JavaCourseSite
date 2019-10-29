//This progam chooses the greatest number between 3 numbers inputted by the user.
import java.util.Scanner;
public class Greatest {
	
  public static void main(String[] args) {
  	try{
  	String message = " is the greatest number";
  	
  	
  	System.out.print("Enter the first number: ");
       Scanner scanInt = new Scanner(System.in);
       int firstNum = scanInt.nextInt();
    		
   System.out.print("Enter the second number: ");
       scanInt = new Scanner(System.in);
       int secondNum = scanInt.nextInt();
       
       
      System.out.print("Enter the third number: ");
      
       scanInt = new Scanner(System.in);
       int thirdNum = scanInt.nextInt();
       
       if(firstNum > secondNum && firstNum > thirdNum) {
       	System.out.println("");
       	System.out.println( firstNum + message);
       }
       if(secondNum > firstNum && secondNum > thirdNum) {
       	System.out.println("");
       	System.out.println( secondNum + message);
       }
       if(thirdNum > secondNum && thirdNum > firstNum) {
       	System.out.println("");
       	System.out.println( thirdNum + message);
       }
    		
    		
  	}
  	catch(Exception ex)
    		{
    			System.out.println("Invalid data entered. Please enter the valid age. ");
    			
    		}
    			  
    }
    
}
