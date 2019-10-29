import java.util.Scanner;
public  class loopshomework1 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String userInputName = takeStringFromUser(keyboard);
		for (int x = 1; x < 11; x++) {
			System.out.println(userInputName);
		}
		System.out.println();
		int number = 0;
		do {
			number = takeNumberFromUserGreaterThan5(keyboard);
		} while (number <= 5);
		System.out.println("You entered " + number + "!");
		System.out.println();
		int num1 = 1;
		System.out.println("This the multiplication table of 4!");
		while (num1 < 11) {
			System.out.println("4 x " + num1 + " = " + (num1 * 4));
			num1++;
		}
		int num2 = 0;
		do {
			num2 = takePasscodeFromUser(keyboard);
			if (num2 == 1234) {
				System.out.println("You may enter!");
			} else {
				System.out.println("Try again:");
			} 
		} while (num2 != 1234);
		
	}
	public static String takeStringFromUser(Scanner keyboard) {
		System.out.print("Enter a name: ");
		String userInputWord = keyboard.nextLine();
		return userInputWord;
	}
	public static int takeNumberFromUserGreaterThan5(Scanner keyboard) {
		System.out.print("Enter a number greater than 5: ");
		int num = keyboard.nextInt();
		return num;
	}
	public static int takePasscodeFromUser (Scanner keyboard) {
		System.out.print("Enter the passcode (in numbers): ");
		int num = keyboard.nextInt();
		return num;
	}
}
