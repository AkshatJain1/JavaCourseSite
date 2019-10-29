import java.util.Scanner;
public class PosOrNeg {
public static void main(String[] args) {
	Scanner keyBoard=new Scanner(System.in);
	int integer;
	System.out.println("Enter an integer.");
	integer=keyBoard.nextInt();
	if (integer > 0)
		System.out.println(integer + " is a positive number.");
	if (integer < 0)
		System.out.println(integer + " is a negative number.");
}
}