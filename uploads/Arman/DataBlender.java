import java.util.Scanner;

public class DataBlender {
public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	int num1;
	int num2;
	boolean color;
	double numb;
	String fname;
	char letter;
	int c;
	int start;
	double end;
	char letter2;
	double afterletter;
	System.out.println("Hello, users I am here to help guide you through this program.");
	System.out.println("The first thing I am going to ask you to do is to type a few things in.");
	System.out.println("Enter a letter and I will display the letter you chose.");
	letter = keyboard.next().charAt(0);
	System.out.println("The letter you chose was " +letter);
	System.out.println("Now, I am going to ask you to give me a number");
	System.out.println("Please enter a one-digit whole number and I will display that number");
	num1 = keyboard.nextInt();
	System.out.println("The number you chose was " +num1);
	System.out.println("Now, I am going to use the information you gave me to create something new");
	System.out.println("I am going to use the information to copy the letter the amount of times as the number");
	for(c=1;c<=num1;c++)
	{
		System.out.println(letter);
	}
	System.out.println("Wasn't that cool? Now, I am going to ask you a few other questions");
	System.out.println("Please enter a number less than 1, but greater than 0");
	numb = keyboard.nextDouble();
	System.out.println("The number you chose was " +numb);
	System.out.println("Now, I am going to ask you a true or false question");
	System.out.println("Your favorite color is blue? Enter True or False");
	color = keyboard.nextBoolean();
	System.out.println("Your favorite color is blue? " +color);
	System.out.println("Now I am going to combine your answer on the true or false question and your decimal answer");
	System.out.println(color+""+numb);
	System.out.println("Once again, I will ask you a few questions and create an output based on your answers");
	System.out.println("First, I will ask you your first name");
	System.out.println("Please enter your first name, which I will display");
	fname = keyboard.next();
	System.out.println("Your first name is " +fname);
	System.out.println("Now, I will ask you for your favorite whole number");
	System.out.println("Please enter your favorite whole number");
	num2 = keyboard.nextInt();
	System.out.println("The number you chose was " +num2);
	System.out.println("Now, I will combine your name and the number you chose");
	System.out.println(fname+"'s favorite number is "+num2);
	System.out.println("Now, I will create a number using a whole number and a decimal number");
	System.out.println("Enter a whole number");
	start = keyboard.nextInt();
	System.out.println("The number you chose was "+start);
	System.out.println("Please enter a number with decimal places");
	end = keyboard.nextDouble();
	System.out.println("The number you chose was "+end);
	System.out.println("Now, I will create a number with those numbers you chose");
	System.out.println(start+""+end);
	System.out.println("This will be the last part of the program");
	System.out.println("Please enter a letter");
	letter2 = keyboard.next().charAt(0);
	System.out.println("The letter you chose was "+letter2);
	System.out.println("Please choose another number with decimal places");
	afterletter = keyboard.nextDouble();
	System.out.println("You chose the number "+afterletter);
	System.out.println("Now, I am going to combine the letter and the number");
	System.out.println(letter2+""+afterletter);
	System.out.println("Well, that's my program! I hope you enjoyed it.");
	
                                      }

                 }