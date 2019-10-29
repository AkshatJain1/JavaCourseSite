import java.util.Scanner;

public class SalaryComputing {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String employeeName;
		String rating;
		String deserve;
		double osalary, bonus, compsalary;
		System.out.println("What is the name of the employee: ");
		employeeName = keyboard.nextLine();
		System.out.println("Enter the letter grade rating you would give "+employeeName);
		rating = keyboard.nextLine();
		// System.out.println("Debug rating: "+rating);
		osalary = 0.0;
		if (rating.equals("A+") || rating.equals("a+"))
		
			osalary = 95000.0; 
		
		if (rating.equals("A") || rating.equals("a"))
		{
			osalary = 90000.0;
		}
		if (rating.equals("A-") || rating.equals("a-"))
		{
			osalary = 85000.0; 
		}
		if (rating.equals("B+") || rating.equals("b+"))
		{
			osalary = 80000.0; 
		}
		if (rating.equals("B") || rating.equals("b"))
		{
			osalary = 75000.0; 
		}
		if (rating.equals("B-") || rating.equals("b-"))
		{
			osalary = 70000.0; 
		}
		if (rating.equals("C+") || rating.equals("c+"))
		{
			osalary = 65000.0; 
		}
			if (rating.equals("C") || rating.equals("c"))
		{
			osalary = 60000.0; 
		}
			if (rating.equals("C-") || rating.equals("c-"))
		{
			osalary = 55000.0; 
		}
			if (rating.equals("D+") || rating.equals("d+"))
		{
			osalary = 50000.0; 
		}
			if (rating.equals("D") || rating.equals("d"))
		{
			osalary = 45000.0; 
		}
			if (rating.equals("D-") || rating.equals("d-"))
		{
			osalary = 40000.0; 
		}
			if (rating.equals("F") || rating.equals("f"))
		{
			osalary = 35000.0; 
		}	
		
		// System.out.println("Debug osalary: "+osalary);
			System.out.println("Does this employee deserve a bonus? ");
			deserve = keyboard.next();
				System.out.println("Does this person deserve a bonus " +deserve);
			if (deserve.equals("Yes") || deserve.equals("yes") || deserve.equals("YES"))
				{
					System.out.println("How much of a bonus (in thousands) ");
					bonus = keyboard.nextDouble();
					compsalary = osalary + bonus*1000.0;
					System.out.println(employeeName+ "'s salary is "+compsalary);
				}
			else
			{
				System.out.println(employeeName+ "'s salary is "+osalary);
			}
			
	}
		
		
		
	}
    
    
