import java.util.Scanner;
public class greatest {
	public static void main(String[] args) {
		Scanner enterNum = new Scanner(System.in);
		System.out.println("This program will help you find out which of three numbers is the greatest!");
		System.out.print("Enter your first number: ");
		double num1 = enterNum.nextDouble();
		System.out.print("Enter your second number: ");
		double num2 = enterNum.nextDouble();
		System.out.print("Enter your third number: ");
		double num3 = enterNum.nextDouble();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " is the greatest number you entered");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println(num2 + " is the greatest number you entered");
		} else if (num3 > num1 && num3 > num2) {
			System.out.println(num3 + " is the greatest number you entered");
		} else {
			System.out.println("Two or more of these numbers are equal! Restart the program!");
		}
	}
}