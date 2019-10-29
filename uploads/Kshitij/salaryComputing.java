import java.util.Scanner;
public class salaryComputing {
	public static void main(String[] args) {
		Scanner salary = new Scanner(System.in);
		System.out.print("What is the name of the employee? ");
		String name = salary.next();
		System.out.print("What rating would you give " + name + "? ");
		String grade = salary.next();
		int money = 0;
		if (grade.equals("A+")) {
			money = 95000;
		} else if (grade.equals("A")) {
			money = 90000;
		} else if (grade.equals("A-")) {
			money = 85000;
		} else if (grade.equals("B+")) {
			money = 80000;
		} else if (grade.equals("B")) {
			money = 75000;
		} else if (grade.equals("B-")) {
			money = 70000;
		} else if (grade.equals("C+")) {
			money = 65000;
		} else if (grade.equals("C")) {
			money = 60000;
		} else if (grade.equals("C-")) {
			money = 55000;
		} else if (grade.equals("D+")) {
			money = 50000;
		} else if (grade.equals("D")) {
			money = 45000;
		} else if (grade.equals("D-")) {
			money = 40000;
		} else if (grade.equals("F")) {
			money = 35000;
		} else {
			System.out.println("That's not a valid grade");
			System.exit(0);
		}
		System.out.print("Should " + name + " receive a bonus? ");
		String yesNo = salary.next();
		if (yesNo.equals("Yes") || yesNo.equals("yes")) {
			System.out.print("How much (in thousands)? ");
			int bonus = salary.nextInt();
			bonus = bonus * 1000;
			System.out.println(name + "'s salary is " + (bonus + money) + ".");
		} else {
			System.out.println(name + "'s salary is " + money + ".");
		}
	}
}