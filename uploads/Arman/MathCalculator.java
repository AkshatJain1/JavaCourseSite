import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class MathCalculator {
public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	int option;
	double add1;
	double add2;
	double sum;
	System.out.println("Welcome to Math Calculator");
	System.out.println("What would you like to do?");
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
	System.out.println("12. Square Root");
	System.out.println("13. Random Number - from 0-1000");
	System.out.println("14. Exit");
	System.out.print("Enter a menu option: ");
	option = keyboard.nextInt();
	while(option!=14)
		{
		if (option==1)
		{
			option1();
		}
		if (option == 2)
		{
			option2();
		}
		if (option==3)
		{
			option3();
		}
		if (option==4)
		{
			option4();	
		}
		if (option==5)
		{
			option5();
		}
		if (option==6)
		{
			option6();
		}
		if (option==7)
		{
			option7();
		}
		if (option==8)
		{
			option8();
		}
		if (option==9)
		{
			option9();
		}
		if (option==10)
		{
			option10();
		}
		if (option==11)
		{
			option11();
		}
		if (option==12)
		{
			option12();
		}
		if (option==13)
		{
			option13();
		}
		option = keyboard.nextInt();
		}

}
public static void printMenu() {
			System.out.println("What do you want to do next");
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
	    	System.out.println("12. Square Root");
	    	System.out.println("13. Random Number - from 0-1000");
	    	System.out.println("14. Exit");
	    	System.out.print("Enter a menu option: ");
}
	public static void option1() {
			Scanner keyboard = new Scanner(System.in);
			double add1, add2, sum;
			System.out.println("You have chosen addition");
			System.out.println("Enter a number");
			add1=keyboard.nextDouble();
			System.out.println("Enter a second number");
			add2 = keyboard.nextDouble();
			sum = add1+add2;
			System.out.println("The sum of the numbers you entered is "+sum);
			printMenu();
}
    public static void option2() {
    		Scanner keyboard = new Scanner(System.in);
    		double add1, add2, sum;
    		System.out.println("You have chosen subtraction");
			System.out.println("Enter a number");
			add1=keyboard.nextDouble();
			System.out.println("Enter a second number");
			add2=keyboard.nextDouble();
			sum = add1-add2;
			System.out.println("The difference of the numbers you have entered is "+sum);
			printMenu();
		
    }
    public static void option3() {
    		Scanner keyboard = new Scanner(System.in);
    		double add1, add2, sum;
    		System.out.println("You have entered division");
			System.out.println("Enter a number");
			add1=keyboard.nextDouble();
			System.out.println("Enter a second number");
			add2=keyboard.nextDouble();
			sum = add1/add2;
			System.out.println("The quotient of the numbers you have entered is "+sum);
			printMenu();
    }
    public static void option4() {
    		Scanner keyboard = new Scanner(System.in);
    		double add1, add2, sum;
    		System.out.println("You have entered multiplication");
			System.out.println("Enter a number");
			add1=keyboard.nextDouble();
			System.out.println("Enter a second number");
			add2=keyboard.nextDouble();
			sum = add1 * add2;
			System.out.println("The product of the numbers you entered is "+sum);
			printMenu();
    		
    }
    public static void option5() {
    		Scanner keyboard = new Scanner(System.in);
    		double add1, add2, sum;
    		System.out.println("You have chosen modulus");
    		System.out.println("Enter a number");
    		add1=keyboard.nextDouble();
    		System.out.println("Enter a second number");
    		add2=keyboard.nextDouble();
    		sum = add1%add2;
    		System.out.println("The answer is "+sum);
    		printMenu();	
    }
    public static void option6() {
    		Scanner keyboard = new Scanner(System.in);
    		double add1, add2, sum;
    		System.out.println("You have chosen exponents");
    		System.out.println("Enter a number");
    		add1=keyboard.nextDouble();
    		System.out.println("Enter a second number");
    		add2=keyboard.nextDouble();
    		sum = Math.pow(add1,add2);
    		System.out.println("The answer is "+sum);
    		printMenu();
    }
    public static void option7() {
    		Scanner keyboard = new Scanner(System.in);
    		double add1;
    		System.out.println("You have chosen absolute value");
    		System.out.println("Enter a number");
    		add1 = keyboard.nextDouble();
    		System.out.print("Your answer is: ");
    		System.out.println(Math.abs(add1));
    		printMenu();	
    }
    public static void option8() {
    		Scanner keyboard = new Scanner(System.in);
    		double add1;
    		System.out.println("You have chosen round up a decimal number");
    		System.out.println("Enter a decimal number");
    		add1 = keyboard.nextDouble();
    		System.out.print("Your answer is ");
    		System.out.println(Math.ceil(add1));
    		printMenu();
    }
    public static void option9() {
    		Scanner keyboard = new Scanner(System.in);
    		double add1;
    		System.out.println("You have chosen to round down a decimal number");
    		System.out.println("Enter a decimal number");
    		add1 = keyboard.nextDouble();
    		System.out.print("Your answer is: ");
    		System.out.println(Math.floor(add1));
    		printMenu();
    }
    public static void option10() {
    		Scanner keyboard = new Scanner(System.in);
    		double add1, add2;
    		System.out.println("You chose take max of two numbers");
    		System.out.println("Enter a number");
    		add1=keyboard.nextDouble();
    		System.out.println("Enter a second number");
    		add2=keyboard.nextDouble();
    		if (add1>add2)
    		{
    			System.out.println("Your answer is: "+add1);
    		}
    		else
    		{
    			System.out.println("Your answer is: "+add2);
    		}
    		printMenu();
    }
    public static void option11() {
    		Scanner keyboard = new Scanner(System.in);
    		double add1, add2;
    		System.out.println("You chose take min of two numbers");
    		System.out.println("Enter a number");
    		add1= keyboard.nextDouble();
    		System.out.println("Enter a second number");
    		add2 = keyboard.nextDouble();
    		if (add1<add2)
    		{
    			System.out.println("Your answer is: "+add1);
    		}
    		else
    		{
    			System.out.println("Your answer is: "+add2);
    		}
    		printMenu();
    }
    public static void option12() {
    		Scanner keyboard = new Scanner(System.in);
    		double add1;
    		System.out.println("You chose square root");
    		System.out.println("Enter a number");
    		add1=keyboard.nextDouble();
    		System.out.print("Your answer is: ");
    		System.out.println(Math.sqrt(add1));
    		printMenu();
    }
    public static void option13() {
    		Random rand = new Random();
    		rand.nextInt(1000);
    		printMenu();
    		
    }
    
    
}