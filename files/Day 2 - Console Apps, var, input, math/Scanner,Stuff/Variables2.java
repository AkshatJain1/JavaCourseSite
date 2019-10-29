import java.util.Scanner;

public class Variables2
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Hey user, enter any numbber. I am going to multiply it: ");
		double num1 = keyboard.nextDouble();
		
		num1 = Math.abs(num1);
		
		num1 = Math.sqrt(num1);
		
		//System.out.print("Hey user, enter another number to multiply the first one with: ");
		//double num2 = keyboard.nextDouble();
		
		double randomNum = Math.random();
		
		
		
		System.out.println("\nThe product of " + num1 + " and random generated number, " + randomNum + " is " + (num1*randomNum)  );
		
	}
}