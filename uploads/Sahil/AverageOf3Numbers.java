import java.util.Scanner;
public class AverageOf3Numbers {
public static void main(String[] args) {
	Scanner keyBoard = new Scanner(System.in);

	System.out.println("\nWelcome! Can you enter a number? If it is a integer, please add a '.0' afterwards.");
	double num1 = keyBoard.nextDouble();

	System.out.println("\nOk, good. Can you please enter another number? If it is a integer, please add a '.0' afterwards.");
	double num2 = keyBoard.nextDouble();

	System.out.println("\nCan you enter one last number? If it is a integer, please add a '.0' afterwards.");
	double num3 = keyBoard.nextDouble();

	System.out.println("\nThe average of your three numbers is: " + (num1 + num2 + num3)/ 3);
}
}