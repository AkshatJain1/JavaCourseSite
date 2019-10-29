import java.util.Scanner;
public class AgeInfo {
public static void main(String []args) {
	Scanner keyBoard=new Scanner(System.in);


	int age, yearsSinceVoting, yearsToVoting, yearOfBirth, numOfElections;
	double numToCalc;
	System.out.println("What is your age?");
	age= keyBoard.nextInt();

	if (age >= 18) {
		System.out.println("\nNice, you can vote!");
		yearsSinceVoting = age - 18;
		System.out.println("\nYou've been able to vote for " + yearsSinceVoting + " years- that's so cool!");
		yearOfBirth = 2018 - age + 18;
		numOfElections = (int)Math.round((2018 - yearOfBirth) / 4.0);
		System.out.println("\nYou've participated in " + numOfElections + " elections!");
	} else {
		System.out.println("\nOh... you can't vote yet. But that's okay!");
		yearsToVoting = 18 - age;
		System.out.println("\nOnly " + yearsToVoting + " more years until you can vote!");
	}

	if ((age % 2) != 0) {
		System.out.println("\nHuh... that's odd. Next year your age will be an even number!");
	} else {
		System.out.println("\nHmmm... Next year your age will be odd.");
	}

}


}