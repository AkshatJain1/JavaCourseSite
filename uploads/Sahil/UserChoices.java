import java.util.Scanner;
public class UserChoices {

public static void main(String[] args) {
	
Scanner keyBoard = new Scanner(System.in); 

System.out.println("You will be asked some questions. Do your best!");

//1st question:
System.out.println("\nDo you like using a mouse or a trackpad?");
String myChoice1 = keyBoard.nextLine();

//2nd question:
System.out.println("\nAre unicorns real? Please enter true or false.");
boolean myChoice2 = keyBoard.nextBoolean();

//3rd question:                               
System.out.println("\nIf you add 47237382173891273912378127398127 and 1 together, what is the number in the unit's digit?");
int myChoice3 = keyBoard.nextInt();

//4th question:
System.out.println("\nIf you square 4.5, what will you get?");
double myChoice4 = keyBoard.nextDouble();

//5th question:
System.out.println("\nWhat is your age?");
int myChoice5 = keyBoard.nextInt();

Scanner keyBoard1 = new Scanner(System.in); 

//6th question:
System.out.println("\nWhat would you do if you saw a bear in the forest?");
String myChoice6 = keyBoard1.nextLine();

//7th question:
System.out.println("\nCan a lion's roar be heard up to 5 miles away? Please answer as true or false.");
boolean myChoice7 = keyBoard.nextBoolean();

System.out.println("\nYour 1st answer was: " + myChoice1);
System.out.println("\nYour 2nd answer was: " + myChoice2 + ". If you answered false, you were correct!");
System.out.println("\nYour 3rd answer was: " + myChoice3 + ". If you answered 8, you were correct!");
System.out.println("\nYour 4th answer was: " + myChoice4 + ". If you answered 20.25, you were correct!");
System.out.println("\nYour 5th answer was: " + myChoice5);
System.out.println("\nYour 6th answer was: " + myChoice6 + ". If you answered 'slowly back away,' you survived! Don't run away if you see a bear, and definetly don't poke it with a stick.");
System.out.println("\nYour 7th answer was: " + myChoice7 + ". If you answered true, you were correct!");

}


}