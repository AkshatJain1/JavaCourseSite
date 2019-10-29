import java.util.Scanner;
public class majorGrade {
	public static void main(String[] args) {
		Scanner magic = new Scanner(System.in);
		System.out.println("Welcome to the Java Magic Show! Watch in awe as I combine two COMPLETELY different data types!");
		sleep(1000);
		System.out.print("First, give me an Integer: ");
		int card = magic.nextInt();
		sleep(1000);
		System.out.print("Now give me a letter: ");
		char cardMultiply = magic.next().charAt(0);
		System.out.println("Now watch as I magically combine the integer and the letter!");
		sleep(3000);
		//I multiplied the char and int with a *
		System.out.println((card * cardMultiply) + " is what we get! Amazing right?");
		sleep(3000);
		System.out.println("For my next trick, I will combine a Word with a *gasp* decimal number!");
		sleep(1000);
		System.out.print("Enter a word you would like me to use: ");
		String trick2a = magic.next();
		sleep(1000);
		System.out.println("You entered " + trick2a);
		sleep(1500);
		System.out.print("Now, Enter a decimal number you would like me to use: ");
		double decNum = magic.nextDouble();
		System.out.print("You get ");
		//I added the double value and the String value
		System.out.println(trick2a + decNum + "!");
		System.out.println("Now, my next trick may be a little wild. I am going to attempt to multiply a DOUBLE value with a CHAR data type.");
		System.out.print("Please enter a decimal value: ");
		double trick3 = magic.nextDouble();
		System.out.print("Ok, now enter a character...enter any single key: ");
		char tricka3 = magic.next().charAt(0);
		sleep(1500);
		System.out.println("And now, time for me to combine what you entered... here I go!");
		sleep(3000);
		//I multiplied a Char value with a double value using *
		System.out.println(trick3 * tricka3);
		sleep(3000);
		System.out.println("And now, as the last trick of the night, I am going to try something... dangerous. Something unexpected. I'm going to combine not one...not two... but THREEE different data types.");
		sleep(3000);
		System.out.print("First, enter a word you would like combined: ");
		String finalTrick1 = magic.next();
		sleep(1500);
		System.out.print("Next, enter a WHOLE number: ");
		int finalTrick2 = magic.nextInt();
		System.out.print("Finally, enter a DECIMAL number: ");
		double finalTrick3 = magic.nextDouble();
		//I multiplied the double and int with *, and then used + to combine the string with the result of the multiplication of double and int.
		System.out.println(finalTrick1 + finalTrick2 * finalTrick3);
		System.out.println("Thank you for coming to the show. Hope to see you again in my next show!");
		
	}
	public static void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (Exception e) {}
	}
}