import java.util.Scanner;
public class SchoolRecordsMain
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		Student[] group = new Student[4];
		
		//get the info for the studnets
		for(int x =0;x<group.length;x++)
		{
			//ask user for information
			System.out.println("I want information for Student Number "+x);
			
			System.out.print("Tell me the name of the student: ");
			String name = keyboard.next();
		
			System.out.print("Tell me the grade of the student(9,10,11,12): ");
			int grade = keyboard.nextInt();
		
			
			System.out.print("Tell me the ID of the student: ");
			String id = keyboard.next();
		
			
			System.out.print("Tell me the GPA of the student: ");
			double gpa = keyboard.nextDouble();
			System.out.println();
			
			//creating the student with the info
			group[x] = new Student(gpa,name,grade,id);
		}
		
		
		//looping the menu
		do{
			//menu for user 
			System.out.print("--Menu--\n 1.Edit Student\n 2. View Information\n 3.Exit");
			int choice = keyboard.nextInt();
			
			//edit stident
			if(choice == 1)
			{
				int studentChoice;
				//makes sure it stays within array boundaries of group
				do
				{
					//asking what student they want to edit
					System.out.print("What student do you want to edit?: ");
					studentChoice = keyboard.nextInt();
				}while(studentChoice<=-1&&studentChoice>=4);
				
				//asking user what they want edit specifically
				System.out.print("What do you want to edit?\n1.GPA\n2.Name\n3.Grade\n4.ID");
				int editChoice = keyboard.nextInt();
				
			
				//editing according to their preference
				if(editChoice==1)
				{
					System.out.print("What do you want to change GPA to?");
					double gpa = keyboard.nextDouble();
					group[studentChoice].setGpa(gpa);
				}
				else if(editChoice==2)
				{
						System.out.print("What do you want to change name to?");
					String name = keyboard.nextLine();
					group[studentChoice].setName(name);
				}
				else if(editChoice==3)
				{
						System.out.print("What do you want to change grade to?");
					int grade = keyboard.nextInt();
					group[studentChoice].setGrade(grade);
				}
				else if(editChoice == 4)
				{
						System.out.print("What do you want to change ID to?");
						String id = keyboard.next();
						group[studentChoice].setId(id);
				}
			
			}
			//print out each students information
			else if(choice ==2)
			{
				//goes to each studnet in group
				for(int x=0;x<group.length;x++)
				{
					//call on toString for each student
					System.out.println(group[x].toString());
				}
				
			}
			else if(choice==3)
			{
				//confirmation
				System.out.println("Are you sure you want to exit? All your data will be lost.");
				String exit = keyboard.next();
				if(exit.equals("yes"))
				{
					//exits repeating do-while loop for menu
					break;
				}
				else if(exit.equals("no"))
				{
					//starts the loop again
					//pretends like nothing happened
					continue;
				}
			}
		
		}while(true);
		
			
	}
}