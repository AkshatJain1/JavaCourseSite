import java.util.Scanner;
public class Variables
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("I am going to multiply a number. Give me a number to multiply: ");
		double num1 = keyboard.nextDouble();
		
		System.out.println("Give me another number to multiply the first one with: ");
		double num2 = keyboard.nextDouble();
		
		
		//option 1
		System.out.println("The product of your two numbers are " + (num1*num2) );
		
		//option 2
		double result = num1 * num2;
		System.out.println("The product of your two numbers are " + result);
		
		result = Math.abs(result);
		System.out.println("The absolute value of your product is " + result);
		
		
		
		
		
		
		
	}
}