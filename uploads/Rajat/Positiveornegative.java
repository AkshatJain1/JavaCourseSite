
//Minor - Take in a number from the user and output if it is positive or negative.
import java.util.Scanner;

public class Positiveornegative{
	public static void main(String[]args){
		
		double nit;
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a rational number.");
		nit=kb.nextDouble();
			
			if (nit>0)	{
				System.out.println(nit+" is a positive number");
				
			}
			else if (nit<0)		{
				System.out.println(nit+" is a negative number");
				
			}
			else	{
				System.out.println("Your number is equal to zero and is neither positive or negative.");
			}
		
	}
	
}