import java.util.Scanner;
public class GreatestNumber
{
	public static void main(String[] args)
	{
		Scanner yo= new Scanner(System.in);
		System.out.println("Enter a variable: ");
		int num1 = yo.nextInt();
		System.out.println("Enter a second variable variable: ");
		int num2 = yo.nextInt();
		System.out.println("Enter a third variable: ");
		int num3 = yo.nextInt();
	
		if(num1 > num2 && num1 > num3)
			System.out.println("the greatest number is: " +num1);	
		else if(num2 > num1 && num2 > num3)
			System.out.println("the greatest number is: " +num2);
		else 
			System.out.println("the greatest number is: " +num3);	
				
	}
		
}