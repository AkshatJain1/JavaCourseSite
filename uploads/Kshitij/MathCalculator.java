import java.util.Scanner;
import java.util.Random;
public class MathCalculator {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int x;
		int y;
		System.out.println("What would you like to do?");
		System.out.println("");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Division");
		System.out.println("4. Multiplication");
		System.out.println("5. Modulus");
		System.out.println("6. Exponents");
		System.out.println("7. Absolute Value");
		System.out.println("8. Round up a decimal number");
		System.out.println("9. Round down a decimal number");
		System.out.println("10. Take max of two numbers");
		System.out.println("11. Take min of two numbers");
		System.out.println("12. Square root");
	 	System.out.println("13. Random Number ( from any range - ex: 0 to 100. This must be an integer)");
		System.out.println("14. Exit");
		
		int choice = takeNumberFromUser(keyboard);
		if (choice == 1) {
			System.out.println("You chose " + choice + "! Enter two numbers and I will add them");
			int num1 = takeNumberFromUser(keyboard);
			int num2 = takeNumberFromUser(keyboard);
			int add = add(num1,num2);
		} else if (choice == 2) {
			System.out.println("You chose " + choice + "! Enter two numbers and I will find the difference");
			int num3 = takeNumberFromUser(keyboard);
			int num4 = takeNumberFromUser(keyboard);
			int subtract = subtract(num3, num4);
		} else if (choice == 3) {
			System.out.println("You chose " + choice + "! Enter a number you want me to divide by another number");
			int num5 = takeNumberFromUser(keyboard);
			int num6 = takeNumberFromUser(keyboard);
			int divide = divide(num5, num6);
		} else if (choice == 4) {
			System.out.println("You chose " + choice + "! Enter two numbers and I will multiply them");
			int num7 = takeNumberFromUser(keyboard);
			int num8 = takeNumberFromUser(keyboard);
			int multiply = multiply(num7, num8);
		} else if (choice == 5) {
			System.out.println("You chose " + choice + "! Enter two numbers you want to divide to find the remainder");
			int num9 = takeNumberFromUser(keyboard);
			int num10 = takeNumberFromUser(keyboard);
			int multiply = multiply(num9, num10);
		} else if (choice == 6) {
			System.out.println("You chose " + choice + "! Exponent");
			System.out.print("Enter a base: ");
			double num11 = keyboard.nextDouble();
			System.out.print("Enter a power: ");
			double num12 = keyboard.nextDouble();
			double exponent = exponent(num11, num12);
		} else if (choice == 7) {
			System.out.println("You chose " + choice + "! Enter a number and I will find its absolute value");
			int num13 = takeNumberFromUser(keyboard);
			int absoluteValue = absoluteValue(num13);
		} else if (choice == 8) {
			System.out.println("You chose " + choice + "! Enter a number and I will round it up");
			System.out.print("Enter a decimal you would like to round up: ");
			double num14 = keyboard.nextDouble();
			num14 = num14 + 0.5;
			double roundUp = roundUp(num14);
		} else if (choice == 9) {
			System.out.println("You chose " + choice + "! Enter a number and I will round it down");
			System.out.print("Enter a decimal you would like to round down: ");
			double num15 = keyboard.nextDouble();
			num15 = num15 - 0.5;
			double roundDown = roundDown(num15);
		} else if (choice == 10) {
			System.out.println("You chose " + choice + "! Enter two numbers and I will find which one is greater");
			int num16 = takeNumberFromUser(keyboard);
			int num17 = takeNumberFromUser(keyboard);
			int max = max(num16, num17);
		} else if (choice == 11) {
			System.out.println("You chose " + choice + "! Enter two numbers and I will find which one is the least");
			int num18 = takeNumberFromUser(keyboard);
			int num19 = takeNumberFromUser(keyboard);
			int min = min(num18, num19);
		} else if (choice == 12) {
			System.out.println("You chose " + choice + "! Square root");
			System.out.print("Enter a number you want to know the square root of: ");
			double num20 = keyboard.nextDouble();
			double sqrt = sqroot(num20);
		} else if (choice == 13) {
			System.out.println("You chose " + choice + "! I will give you a random number between 1 and 100 now");
			int num21 = 0;
			int random = random(num21); 
		} else if (choice == 14) {
			System.out.println("You chose " + choice + "! Exiting the program now");
			System.exit(0);
		} else {
			System.out.println("That's not a valid choice!");
			System.out.println("Restart the program");
		}
	}
	
	public static int takeNumberFromUser(Scanner keyboard) {
		System.out.print("Enter a number: ");
		int num = keyboard.nextInt();
		return num;
	}
	public static int add(int x , int y) {
		int answer = x + y;
		System.out.println("The sum is " + answer + "!");
		return answer;
	}
	public static int subtract(int x, int y) {
		int answer2 = x - y;
		System.out.println("The difference is " + answer2 + "!");
		return answer2;
	}
	public static int divide(int x, int y) {
		int answer3 = x / y;
		System.out.println("The quotient is " + answer3 + "!");
		return answer3;
	}
	public static int multiply(int x, int y) {
		int answer4 = x * y;
		System.out.println("The product is " + answer4 + "!");
		return answer4;
	}
	public static int modulus(int x, int y) {
		int answer5 = x % y;
		System.out.println("The remainder is " + answer5 + "!");
		return answer5;
	}
	public static double exponent(double x, double y) {
		double answer6 = Math.pow(x, y);
		System.out.println("The answer is " + answer6 + "!");
		return answer6;
	}
	public static int absoluteValue(int x) {
		int answer7 = java.lang.Math.abs(x);
		System.out.println("The answer is " + answer7 + "!");
		return answer7;
	}
	public static double roundUp(double x) {
		double answer8 = Math.round(x);
		System.out.println("The answer is " + answer8 + "!");
		return answer8; 
	}
	public static double roundDown(double x) {
		double answer9 = Math.round(x);
		System.out.println("The answer is " + answer9 + "!");
		return answer9;
	}
	public static int max(int x, int y) {
		 if (x > y) {
		 	int answer10 = x;
		 	System.out.println("The maximum is " + answer10 + "!");
			return answer10;
		 } else if (x < y) {
		 	int answer10 = y;
		 	System.out.println("The maximum is " + answer10 + "!");
			return answer10;
		 } else {
		 	System.out.println("They're the same number!");
		 	return 0;
		 }
	}
	public static int min(int x, int y) {
		if (x < y) {
		 	int answer11 = x;
		 	System.out.println("The minimum is " + answer11 + "!");
			return answer11;
		 } else if (x > y) {
		 	int answer11 = y;
		 	System.out.println("The minimum is " + answer11 + "!");
			return answer11;
		 } else {
		 	System.out.println("They're the same number!");
		 	return 0;
		 }
	}
	public static double sqroot(double x) {
		double answer12 = Math.sqrt(x);
		System.out.println("The square root is " + answer12 + "!");
		return answer12;
	}
	public static int random(int x) {
		Random apple = new Random();
		int answer13 = apple.nextInt(101);
		System.out.println("Your random number is " + answer13 + "!");
		return answer13;
	}
}