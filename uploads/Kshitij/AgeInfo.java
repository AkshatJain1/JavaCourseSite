import java.util.Scanner;
public class AgeInfo {
	public static void main(String[] args) {
		Scanner ageScan = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = ageScan.nextInt();
		if (age < 18) {
			int calculate1 = 18 - age;
			System.out.println("Sorry, you are " + calculate1 + " years short of being able to vote.");
			if (age % 2 == 0) {
				System.out.println("Next year, your age will be an odd number. Cool, right?");
			} else {
				System.out.println("Next year, your age will be an even number. Cool, right?");
			}
		} else {
			int calculate2 = age - 18;
			System.out.println("Amazing! You have been voting for " + calculate2 + " years!");
			if (age % 2 == 0) {
				System.out.println("Next year, your age will be an odd number. Wonderful!");
			} else {
				System.out.println("Next year, your age will be an even number. Wonderful!");
			}
			int calculate3 = calculate2 / 4;
			System.out.println("To this day, you have participated in " + calculate3 + " elections! That's " + calculate3 + " more than me!");
		}
	}
}