import java.util.Scanner;

public class Weekday {
public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	int d;
	String userInput;
	System.out.println("Enter either 1,2,3,4,5,6,7");
	userInput = keyboard.next();
	
	try
	{
		d=Integer.parseInt(userInput);
		switch(d)
		{
			
			case 1:
				System.out.println("The 1 weekday is Monday");
				break;
			case 2:
				System.out.println("The 2 weekday is Tuesday");
				break;
			case 3:
				System.out.println("The 3 weekday is Wednesday");
				break;
			case 4:
				System.out.println("The 4 weekday is Thursday");
				break;
			case 5:
				System.out.println("The 5 weekday is Friday");
				break;
			case 6:
				System.out.println("The 6 weekday is Saturday");
				break;
			case 7:
				System.out.println("The 7 weekday is Sunday");
				break;
				default:
			System.out.println("Invalid choice");
		}								
		}
		catch (NumberFormatException nfe)
		{
			System.out.println("Invalid Entry");
		}
	}
	
}

    
    
