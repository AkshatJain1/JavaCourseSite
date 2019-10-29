import java.util.Scanner;

public class MathMethods
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Hey user give me a number to multiply: ");
		double num1 = keyboard.nextDouble();
		
		double r = multiply2(num1);
		
		System.out.println("We got "+r);
		
	}
	
	public static double multiply2(double a)
	{
		double result = a * 2;
		return result;
	}
	
}