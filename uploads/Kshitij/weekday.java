import java.util.Scanner;

public class weekday {
	
	public static void main(String[] args) {
		
		Scanner dayWeek = new Scanner(System.in);
		System.out.print("Enter a whole number between 1 and 7: ");
		int day = dayWeek.nextInt();
		if (day == 1) {
			System.out.println("The " + day + " weekday is Monday");
		} else if (day == 2) {
			System.out.println("The " + day + " weekday is Tuesday");
		} else if (day == 3) {
			System.out.println("The " + day + " weekday is Wednesday");
		} else if (day == 4) {
			System.out.println("The " + day + " weekday is Thursday");
		} else if (day == 5) {
			System.out.println("The " + day + " weekday is Friday");
		} else if (day == 6) {
			System.out.println("The " + day + " weekday is Saturday");
		} else if (day == 7) {
			System.out.println("The " + day + " weekday is Sunday");
		} else {
			System.out.println("This isnt a day of the week!");
		}
	}
}	