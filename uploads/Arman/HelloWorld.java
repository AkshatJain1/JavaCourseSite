import java.util.Scanner;

public class HelloWorld{
public static void main(String[] args){
	Scanner keyboard = new Scanner(System.in);
	int num;
	char letter;
	double decimal;
	boolean country;
	System.out.println("Enter your favorite number");
	num = keyboard.nextInt();
	System.out.println("Your favorite number is "+num);
		boolean col; 
			System.out.println("Enter True or False: Your favorite color is blue");
			col = keyboard.nextBoolean();
			System.out.println("Your favorite color is blue? " +col);
			int overhundred;
			System.out.println("Enter your favorite number over 100");
			overhundred = keyboard.nextInt();
			System.out.println("Your favorite number over 100 is "+overhundred);
			char capital;
			System.out.println("Enter your favorite capital letter");
			capital = keyboard.next().charAt(0);
			System.out.println("Your favorite capital letter is "+capital);
				System.out.println("Enter your favorite letter");
				letter = keyboard.next().charAt(0);
			System.out.println("Your favorite letter is "+letter);
			System.out.println("Enter your favorite decimal number");
				decimal = keyboard.nextDouble();
			System.out.println("Your favorite decimal number is "+decimal);
			System.out.println("Enter True or False: USA is your favorite country");	
				country = keyboard.nextBoolean();
			System.out.println("USA is your favorite country? "+country);
			
			// Now we write the summary of the user preferences
					
			System.out.println("Summary:");
			System.out.println("Your favorite number is "+num);	
			System.out.println("Your favorite color is blue? " +col);
			System.out.println("Your favorite number over 100 is "+overhundred);
			System.out.println("Your favorite capital letter is "+capital);
			System.out.println("Your favorite letter is "+letter);
			System.out.println("Your favorite decimal number is "+decimal);
			System.out.println("USA is your favorite country? "+country);
									
}
}



