import java.util.Scanner;
public class PosOrNeg {
	
	public static void main(String[] args) {
		
		Scanner negPos = new Scanner(System.in);
		System.out.println("Welcome to the Positive or Negative calculator!");
		System.out.print("Enter any number to find out if it is positive or negative: ");
		double posNeg = negPos.nextDouble();
		
		if (posNeg < 0) {
			System.out.println(posNeg + " is a negative number!");
		} else if (posNeg > 0) {
			System.out.println(posNeg + " is a positive number!");
		} else {
			System.out.println(posNeg + " isn't a positive or negative number.");
		}
	}

}