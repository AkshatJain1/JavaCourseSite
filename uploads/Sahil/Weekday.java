import java.util.Scanner;
public class Weekday {
public static void main(String[] args) {
	Scanner keyBoard=new Scanner(System.in);
	int number;
	System.out.println("Enter a whole number.");
	number=keyBoard.nextInt();
	if (number == 1)
		System.out.println("The 1st weekday is Monday.");
	else if (number == 2)
		System.out.println("The 2nd weekday is Tuesday.");
	else if (number == 3)
		System.out.println("The 3rd weekday is Wednesday.");
	else if (number == 4)
		System.out.println("The 4th weekday is Thursday.");
	else if (number == 5)
		System.out.println("The 5th weekday is Friday.");
	else
		System.out.println(number + " does not have a corresponding weekday.");

}


}