import java.util.Scanner;

public class Average {
public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	double num1, num2, num3;
	double avge;
	num1 = keyboard.nextDouble();
	System.out.println("What is your first number? "+num1);
	num2 = keyboard.nextDouble();
	System.out.println("What is your second number? "+num2);
	num3 = keyboard.nextDouble();
	System.out.println("What is your third number? "+num3);
	avge = (num1 + num2 + num3)/3.0;
	System.out.println(num1+ " + "+num2+ " + " +num3+ " /3.0 is... " +avge);
}

    }
    
    
