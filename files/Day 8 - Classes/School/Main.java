import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		ArrayList<Student> students = new ArrayList<Student>();
		
		while(true)
		{
		
			int choice;
			do
			{
				System.out.println("1.Add Student\n2.Remove Student\n3.View Student\n4.Exit");
				choice = keyboard.nextInt();
				
			}while(choice < 1 || choice > 5);
		
			//add student
			if (choice == 1)
			{
				System.out.println("What is the name of the Student");
				String name = keyboard.next();
			
				System.out.println("What is the gpa of the Student");
				double gpa = keyboard.nextDouble();
			
				System.out.println("What is the ID of the Student");
				String id = keyboard.next();
			
				System.out.println("What is the age of the Student");
				int age = keyboard.nextInt();
			
				
				Student s = new Student(gpa,name,age,id);
				
				
				students.add(s);
			}
			if(choice==2&&students.isEmpty()==false)
			{
				System.out.println(students);
				int x;
				do
				{
					System.out.println("What student do you want to remove");
					x = keyboard.nextInt();
				}while(x>=students.size());
				
				students.remove(x);
			}
			if(choice==3)
			{
				System.out.println(students);
					int x;
				do
				{
					System.out.println("What student do you want to view");
					x = keyboard.nextInt();
				}while(x>=students.size());
				
				System.out.println(students.get(x).info());
				
			}
			else if(choice==4)
			{
				break;
			}
		
		}
		
		
		
	}
}