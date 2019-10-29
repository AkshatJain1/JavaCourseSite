/*  1.	we are going to ask for the boundaries of int random numbers
	
	2. 	create a method that creates a int random number 
			by taking the boundaries as parameters
	
	3. ask the user to guess the number.(integer)
	
	4. tell them how off they were if they were wrong and tell them they
		were right if the guessed number matched the random num.
		
		Math.random()*numOfValues+lowestNum*/
		
import java.util.Scanner;
public class GuessGame2
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		//asks for boundaries
		System.out.println("Enter the lowest boundary: ");
		int lowB = keyboard.nextInt();
		
		System.out.println("Enter the highest boundary: ");
		int highB = keyboard.nextInt();
		
		//creates random num
		int randNum = randomNum(lowB,highB);
		
		System.out.println("The random number is "+randNum);
		
	}
	public static int randomNum(int lowb, int highB)
	{
		return (int)(Math.random()*(++highB-lowb))+lowb;
	}
}