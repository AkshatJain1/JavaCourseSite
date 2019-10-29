import java.util.Scanner;
public class SalaryComputing {
public static void main(String[] args) {
	Scanner keyBoard=new Scanner(System.in);
	Scanner keyBoard1=new Scanner(System.in);
	Scanner keyBoard2=new Scanner(System.in);
	Scanner keyBoard3=new Scanner(System.in);
	String name;
	String rating;
	int salary = 0;
	String bonusDecision;
	int bonusAmount;

	System.out.println("What is the name of the employee?");
	name=keyBoard.next();

	System.out.println("What rating would you give " + name + "?");
	rating=keyBoard1.next();

	if (rating.equals("A+"))
		salary = 95000;
	else if (rating.equals("A"))
		salary = 90000;
	else if (rating.equals("A-"))
		salary = 85000;
	else if (rating.equals("B+"))
		salary = 80000;
	else if (rating.equals("B"))
		salary = 75000;
	else if (rating.equals("B-"))
		salary = 70000;
	else if (rating.equals("C+"))
		salary = 65000;
	else if (rating.equals("C"))
		salary = 60000;
	else if (rating.equals("C-"))
		salary = 55000;
	else if (rating.equals("D+"))
		salary = 50000;
	else if (rating.equals("D"))
		salary = 45000;
	else if (rating.equals("D-"))
		salary = 40000;
	else if (rating.equals("F"))
		salary = 35000;

	System.out.println("Should " + name + " receive a bonus?");
	bonusDecision=keyBoard2.next();
	if (bonusDecision.equals("Yes")) {
		System.out.println("How much of a bonus should " + name + " receive, in thousands?");
		bonusAmount=keyBoard3.nextInt();
	}
	else if (bonusDecision.equals("yes")) {
		System.out.println("How much of a bonus should " + name + " receive, in thousands?");
		bonusAmount=keyBoard3.nextInt();
	}
	else
		bonusAmount = 0;

	System.out.println(name + "'s salary is " + (bonusAmount * 1000 + salary) + ".");


}
}
