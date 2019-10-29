import java.util.Scanner;

public class Greater {
	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
		double num1;
		double num2;
		double num3;
		System.out.println("Enter a number");
		num1 = keyboard.nextDouble();
		System.out.println("Enter a second number");
		num2 = keyboard.nextDouble();
		System.out.println("Enter a third number");
		num3 = keyboard.nextDouble();
		
		if (num1>num2)
		{
			if (num1>num3)
			{
			    System.out.println(num1+ " is the largest number you entered");	
		    }
		    else
		    {
		    	System.out.println(num3+ " is the largest number you entered");
		    }	
		}
		else
		{
		if (num2>num3)
			{
		     	System.out.println(num2+ " is the largest number you entered");	
		    }
		    else
		    {
		    	System.out.println(num3+ " is the largest number you entered");
		    }	
		}
	}


    
    
}