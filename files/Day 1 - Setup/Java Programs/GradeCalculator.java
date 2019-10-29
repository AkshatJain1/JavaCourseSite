import java.util.Scanner;

public class GradeCalculator
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		//homeowork
		System.out.print("Enter your homework grade average: ");
		double hmkAvg = keyboard.nextDouble();
		
		System.out.print("Enter the percentage weight of your homework: ");
		double weightOfHmwk = keyboard.nextDouble();
		System.out.println();
		
		
		//quizzes
		System.out.print("Enter your quiz grade average: ");
		double quizAvg = keyboard.nextDouble();
		
		System.out.print("Enter the percentage weight of your quiz: ");
		double weightOfQuiz = keyboard.nextDouble();
		System.out.println();
		
		//test
		System.out.print("Enter your test grade average: ");
		double testAvg = keyboard.nextDouble();
		
		System.out.print("Enter the percentage weight of your test: ");
		double weightOfTest = keyboard.nextDouble();
		System.out.println();
		
		//grade calculation
		double grade = (hmkAvg*(weightOfHmwk/100))+(quizAvg*(weightOfQuiz/100))+(testAvg*(weightOfTest/100));
		
		//prints grade
		System.out.print("Your grade in the class is "+grade);
	}
}