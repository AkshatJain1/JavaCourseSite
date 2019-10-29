import java.util.Scanner;

public class PosNeg {
    public static void main(String[] args) {
    	try{
    
    
    	System.out.print(" Enter a number: ");
    	Scanner scanInt = new Scanner(System.in);
       int number = scanInt.nextInt();
       
       if ( number > 0) {
       	System.out.println("This is a positive number.");
       }
    	else if (number < 0){
    		System.out.print("This is a negative number.");
    	}
    	else {
    		System.out.println("This is a neutral number.");
    	}
    	}catch(Exception ex)
    		{
    			System.out.println("You have entered an invalid number.");
    		}
    	
    	
        
    }
}
