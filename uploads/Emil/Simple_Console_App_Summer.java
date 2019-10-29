import java.util.Scanner;
public class Simple_Console_App_Summer
{
	public static void main (String[] args)
	{
		Scanner aye = new Scanner(System.in);
		System.out.print("What is your favorite food: "); //1
		String food = aye.nextLine();
		System.out.print("\nHow many hours of sleep do you prefer per night: "); //2
		double sleep = aye.nextDouble();
		System.out.print("\nWhat is your favorite number: "); //3
		int number = aye.nextInt();
		System.out.print("\nWhat is your favorite letter: "); //4
		char letter = aye.next().charAt(0);
		System.out.print("\nHow many kids do you prefer: "); //5
		int kids = aye.nextInt();
		System.out.print("\nHow many hours do you prefer to workout: "); //6
		double workout = aye.nextDouble();
		System.out.print("\nWhat is your least favorite letter: "); //7
		char lletter = aye.next().charAt(0);
		
		System.out.print("\n\n\n---Summary---\n");
		System.out.println("Favorite food: "+food);
		System.out.println("Prefered hours of Sleep: "+sleep);
		System.out.println("Favorite number: "+number);
		System.out.println("Favorite letter: "+letter);
		System.out.println("Prefered number of kids: "+kids);
		System.out.println("Prefered hours to workout: "+workout);
		System.out.println("Least favorite letter: "+lletter);
	}
}