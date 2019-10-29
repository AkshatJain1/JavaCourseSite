import java.util.Scanner;

public class BaseConverter {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int option;
		System.out.println("Welcome to Base Converter");
		System.out.println("What would you like to do?");
		System.out.println("1. Binary to Decimal");
		System.out.println("2. Decimal to Hexadecimal");
		System.out.println("3. Hexadecimal to Decimal");
		System.out.println("4. Exit");
		System.out.println("Enter a menu option");
		option = keyboard.nextInt();
		while(option!=4)
		{
			if (option==1)
			{
				option1();
			}
			if (option==2)
			{
				option2();
			}
			if (option==3)
			{
				option3();
			}
			option = keyboard.nextInt();
		}
	}
	public static void printMenu () {
		System.out.println("What do you want to do next?");
		System.out.println("1. Binary to Decimal");
		System.out.println("2. Decimal to Hexadecimal");
		System.out.println("3. Hexadecimal to Decimal");
		System.out.println("4. Exit");
		System.out.println("Enter a menu option");
	}
	public static void option1 () {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("You have chosen Binary to decimal");
		System.out.println("Enter a number in binary");
		String numBin = keyboard.nextLine();
		System.out.print("Your answer is: ");
		System.out.println(Integer.parseInt(numBin,2));
		printMenu();
	}
	public static void option2 () {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("You have chosen Decimal to Hexadecimal");
		System.out.println("Enter a number in decimal");
		int numDeci = keyboard.nextInt();
		String deci = Integer.toHexString(numDeci);
		System.out.println("Your answer is: "+deci);
		printMenu();
	}
    public static void option3 () {
    	Scanner keyboard = new Scanner(System.in);
    	System.out.println("You have chosen Hexadecimal to Decimal");
    	System.out.println("Enter a number in hexadecimal");
    	String hex = keyboard.nextLine();
    	System.out.print("Your answer is: ");
    	System.out.println(Integer.parseInt(hex, 16));
    	printMenu();
    }
    
}