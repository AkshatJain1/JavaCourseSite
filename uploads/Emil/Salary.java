import java.util.Scanner;
public class Salary
{
	public static void main(String[] args)
	{
		Scanner yo= new Scanner(System.in);
		System.out.println("What is the name of the employee: ");
		String name= yo.nextLine();
		System.out.println("What is a rating in terms of a letter(plus or minus)would you give "+name+": ");
		String rating= yo.nextLine();
		int Salary = 0;
		if(rating.equals("A+")== true)
			Salary= 95000;
		else if(rating.equals("A")== true)
			Salary= 90000;
		else if(rating.equals("A-")== true)
			Salary= 85000;
		else if(rating.equals("B+")== true)
			Salary= 80000;
		else if(rating.equals("B")== true)
			Salary= 75000;
		else if(rating.equals("B-")== true)
			Salary= 75000;
		else if(rating.equals("C+")== true)
			Salary= 70000;
		else if(rating.equals("C")== true)
			Salary= 65000;
    	else if(rating.equals("C-")== true)
			Salary= 60000;
		else if(rating.equals("D+")== true)
			Salary= 55000;
		else if(rating.equals("D")== true)
			Salary= 50000;
		else if(rating.equals("D-")== true)
			Salary= 45000;
		else if(rating.equals("E+")== true)
			Salary= 40000;
		else if(rating.equals("E")== true)
			Salary= 35000;
		else if(rating.equals("E-")== true)
			Salary= 30000;
		else if(rating.equals("F+")== true)
			Salary= 25000;
		else if(rating.equals("F")== true)
			Salary= 20000;
		else if(rating.equals("F-")== true)
			Salary= 15000;
		else if(rating.equals("G+")== true)
			Salary= 10000;
		else if(rating.equals("G")== true)
			Salary= 5000;
		else if(rating.equals("G-")== true)
			Salary= 0;
		
		System.out.println("Should he or she recieve a bonus: ");
		String bonus= yo.nextLine();
	
		if(bonus.equals("yes")== true || bonus.equals("Yes")==true)
		{
			System.out.println(" How much in terms of thousands: ");
			int terms= yo.nextInt();
			int money= terms*1000;
			System.out.println("The employee's salary is: "+(Salary+money));
		}
		else
			System.out.println("The employees salary is: "+Salary);
		
	}
	
}
	