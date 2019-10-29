import java.util.Scanner;

public class prob01
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is the lowest number to generate?: ");
		int a = keyboard.nextInt();
		
		System.out.println("What is the highest number to generate?: ");
		int b = keyboard.nextInt();
		
		int randomNum = randomNumber(a,b);
		
		System.out.print("Guess the number: ");
		int guessedNumber = keyboard.nextInt();
		
		if(randomNum == guessedNumber)
		{
			System.out.println("\n\nYou are right!");
		}
		else
		{
			System.out.println("\n\nYou are wrong. The number was actually "+randomNum+".");
			System.out.println("You were " + Math.abs(randomNum-guessedNumber)+" off.");
		}
		
		
	}

	public static int randomNumber(int lowestNumber, int highestNumber)
	{
		highestNumber+=1;
		return (int)(Math.random() * (highestNumber - lowestNumber)) + lowestNumber;
	}
}