import java.util.Scanner;
public class PositiveOrNegative
{
	public static void main(String[] args)
	{
		Scanner yo= new Scanner(System.in);
		System.out.println("Input a positive or negative integer: ");
		int num= yo.nextInt();
		
		String type = "";
		if (num>0)
			type = "Positive";
		else if (num<0) 
			type = "Negative";
		System.out.println("Your number is: "+type);
		
	}

}