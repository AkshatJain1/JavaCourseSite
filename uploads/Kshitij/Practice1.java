import java.util.Random;
import java.util.Scanner;
/**
 * @(#)Practice1.java
 *
 *
 * @author 
 * @version 1.00 2018/6/24
 */


public class Practice1 {

    public static void main (String[] args) {
		
		System.out.println("Welcome to the Sitcom Character Quiz! Take this quiz and find out which type of sitcom character you really are!");
		sleep(5000);
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Question 1:");
		System.out.println("Would you rather- Join the Avengers or Join the Justice League?");
		System.out.print("Press 1 for option 1 or press 2 for option 2: ");
		int value = keyboard.nextInt();
		System.out.println("You chose " + value + "!");
		System.out.println("Question 2:");
		Scanner create = new Scanner(System.in);
		System.out.println("Is the following statement True or False according to you: 'The Earth is Flat'");
		System.out.print("Type either True or False: ");
		boolean answerTF = create.nextBoolean();
		System.out.println("You chose " + answerTF + "!");
		System.out.println("Question 3: ");
		Scanner something = new Scanner(System.in);
		System.out.println("How many digits of Pi can you list?");
		System.out.print("List the digits of Pi here: ");
		double Pi = something.nextDouble();
		System.out.println("You typed: " + Pi + "!");
		System.out.println("Question 4:");
		Scanner letter = new Scanner(System.in);
		System.out.print("What is your favorite letter? ");
		char favChar = letter.next().charAt(0);
		System.out.println("Your favorite character is: " + favChar + "!");
		System.out.println("Question 5:");
		System.out.println("Pick a word: Noodloo, Ferengoy, Classoflerp, Maurice");
		System.out.print("Type 1 for Noodloo, 2 for Ferengoy, 3 for Classoflerp, or 4 for Maurice: ");
		int gumballReference = keyboard.nextInt();
		System.out.println("You chose " + gumballReference + "!");
		System.out.println("Question 6:");
		System.out.println("If the dinosaurs could be brought back from extinction, do you think they should be?");
		System.out.print("Type y for yes and n for no: ");
		char dinosaurs = letter.next().charAt(0);
		System.out.println("You chose: " + dinosaurs);
		System.out.println("Question 7:");
		System.out.println("What is your favorite decimal number? ");
		System.out.print("Type out your favorite decimal number here: ");
		double favDec = letter.nextDouble();
		System.out.println("Your favorite decimal number is: ");
		System.out.println("Congratulations! You finished the quiz! Calculating results...");
		sleep(3000);
        System.out.println("");
        Random apple = new Random();
		int rng = apple.nextInt(101);
		if (rng < 100 && rng >= 80) {
			System.out.println("You are the Loser!");
		} else if (rng < 80 && rng >= 60) {
			System.out.println("You are the Nerd!");
		} else if (rng < 60 && rng >= 40) {
			System.out.println("You are the Jock!");
		} else if (rng < 40 && rng >= 20) {
			System.out.println("You are the Sidekick!");
		} else if (rng < 20) {
			System.out.println("You are the Conspiracy Theorist!");
		}
			
				
 	 }
	public static void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (Exception e) {}
	}     
}