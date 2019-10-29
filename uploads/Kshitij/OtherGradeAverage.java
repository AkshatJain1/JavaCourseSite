import java.util.Scanner;
public class OtherGradeAverage {
	
	public static void main (String[] args) {
		
		Scanner average = new Scanner(System.in);
		System.out.println("This program takes 3 numbers and calculates the average for you!");
		System.out.print("Enter your first number here: ");
		double num1 = average.nextDouble();
		System.out.println("The first number is " + num1);
	 	System.out.print("Enter your second number here: ");
	 	double  num2 = average.nextDouble();
	 	System.out.println("The second number is " + num2); 
	 	System.out.print("Enter your third number here: ");
	 	double num3 = average.nextDouble();
	 	System.out.println("The third number is " + num3); 
	 	System.out.println("Calculating result....");
	 	sleep(3000);
	 	double averageTotal = num1 + num2 + num3;
	 	double averageNum = averageTotal / 3.0;
	 	System.out.println("The average of the three numbers is " + averageNum + "!");
	 	
			
	}
	public static void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (Exception e) {}
	}     
}