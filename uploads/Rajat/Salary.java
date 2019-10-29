import java.util.Scanner;

public class Salary{
	public static void main(String[] args){
				String rating = "Yes";
				do{	
						Scanner kb=new Scanner(System.in);		
				System.out.println("Enter the employee's rating.");
				rating=kb.nextLine();
			
				if(rating.equals("A+")){
				Scanner kb1=new Scanner(System.in);
				System.out.println("Should they get a bonus? Enter Yes or No");
				String bonus=kb1.nextLine();
					
					if(bonus.equals("Yes")){
					
						Scanner kb2=new Scanner(System.in);
						System.out.println("How much of a bonus?");
						int salary=kb2.nextInt();
						System.out.println("Their salary is now $"+(salary+95000)); 
					}
					else if (bonus.equals("No")){
						System.out.println("They will not get a bonus and their salaries will stay $95,000.");
					}
					
					else{
						System.out.println("I don't understand.");
					}
						
						
									}
				if(rating.equals("A")){
			
				Scanner kb1=new Scanner(System.in);
				System.out.println("Should they get a bonus? Enter Yes or No.");
				String bonus=kb1.nextLine();
					
					if(bonus.equals("Yes")){
					
						Scanner kb2=new Scanner(System.in);
						System.out.println("How much of a bonus?");
						 int salary=kb2.nextInt();
						 System.out.println("Their salary is now $"+(salary+90000)); 
						 }
					else if (bonus.equals("No")){
						System.out.println("They will not get a bonus and their salaries will  remain $90,000.");
					}
					else{
						System.out.println("I don't understand.");
					}
						
						
									}
				if(rating.equals("A-")){
			
				Scanner kb1=new Scanner(System.in);
				System.out.println("Should they get a bonus? Enter Yes or No. ");
				String bonus=kb1.nextLine();
					
						Scanner kb2=new Scanner(System.in); 
					if(bonus.equals("Yes")){
						System.out.println("How much of a bonus?");
						 int salary=kb2.nextInt();
						 System.out.println("Their salary is now $"+(salary+85000)); 
					}
					else if (bonus.equals("No")){
						Scanner kb3=new Scanner(System.in);
						System.out.println("They will not get a bonus and their salaries will stay $85,000.");
					}
					else{
						System.out.println("I don't understand.");
					}
				
						
			}
			
			
				if(rating.equals("B+")){
				Scanner kb1=new Scanner(System.in);
				System.out.println("Should they get a bonus? Enter Yes or No");
				String bonus=kb1.nextLine();
					
					if(bonus.equals("Yes")){
					
						Scanner kb2=new Scanner(System.in);
						System.out.println("How much of a bonus?");
						int salary=kb2.nextInt();
						System.out.println("Their salary is now $"+(salary+80000)); 
					}
					else if (bonus.equals("No")){
						System.out.println("They will not get a bonus and their salaries will stay $80000.");
					}
					
					else{
						System.out.println("I don't understand.");
					}
					}
					if(rating.equals("B")){
				Scanner kb1=new Scanner(System.in);
				System.out.println("Should they get a bonus? Enter Yes or No");
				String bonus=kb1.nextLine();
					
					if(bonus.equals("Yes")){
					
						Scanner kb2=new Scanner(System.in);
						System.out.println("How much of a bonus?");
						int salary=kb2.nextInt();
						System.out.println("Their salary is now $"+(salary+75000)); 
					}
					else if (bonus.equals("No")){
						System.out.println("They will not get a bonus and their salaries will stay $75000.");
					}
					
					else{
						System.out.println("I don't understand.");
					}
					}
					if(rating.equals("B-")){
				Scanner kb1=new Scanner(System.in);
				System.out.println("Should they get a bonus? Enter Yes or No");
				String bonus=kb1.nextLine();
					
					if(bonus.equals("Yes")){
					
						Scanner kb2=new Scanner(System.in);
						System.out.println("How much of a bonus?");
						int salary=kb2.nextInt();
						System.out.println("Their salary is now $"+(salary+70000)); 
					}
					else if (bonus.equals("No")){
						System.out.println("They will not get a bonus and their salaries will stay $70000.");
					}
					
					else{
						System.out.println("I don't understand.");
					}
					}
					if(rating.equals("C+")){
				Scanner kb1=new Scanner(System.in);
				System.out.println("Should they get a bonus? Enter Yes or No");
				String bonus=kb1.nextLine();
					
					if(bonus.equals("Yes")){
					
						Scanner kb2=new Scanner(System.in);
						System.out.println("How much of a bonus?");
						int salary=kb2.nextInt();
						System.out.println("Their salary is now $"+(salary+65000)); 
					}
					else if (bonus.equals("No")){
						System.out.println("They will not get a bonus and their salaries will stay $65000.");
					}
					
					else{
						System.out.println("I don't understand.");
					}
					}
					if(rating.equals("C")){
				Scanner kb1=new Scanner(System.in);
				System.out.println("Should they get a bonus? Enter Yes or No");
				String bonus=kb1.nextLine();
					
					if(bonus.equals("Yes")){
					
						Scanner kb2=new Scanner(System.in);
						System.out.println("How much of a bonus?");
						int salary=kb2.nextInt();
						System.out.println("Their salary is now $"+(salary+60000)); 
					}
					else if (bonus.equals("No")){
						System.out.println("They will not get a bonus and their salaries will stay $60000.");
					}
					
					else{
						System.out.println("I don't understand.");
					}
					}
					if(rating.equals("C-")){
				Scanner kb1=new Scanner(System.in);
				System.out.println("Should they get a bonus? Enter Yes or No");
				String bonus=kb1.nextLine();
					
					if(bonus.equals("Yes")){
					
						Scanner kb2=new Scanner(System.in);
						System.out.println("How much of a bonus?");
						int salary=kb2.nextInt();
						System.out.println("Their salary is now $"+(salary+55000)); 
					}
					else if (bonus.equals("No")){
						System.out.println("They will not get a bonus and their salaries will stay $55000.");
					}
					
					else{
						System.out.println("I don't understand.");
					}
					}
					if(rating.equals("D+")){
				Scanner kb1=new Scanner(System.in);
				System.out.println("Should they get a bonus? Enter Yes or No");
				String bonus=kb1.nextLine();
					
					if(bonus.equals("Yes")){
					
						Scanner kb2=new Scanner(System.in);
						System.out.println("How much of a bonus?");
						int salary=kb2.nextInt();
						System.out.println("Their salary is now $"+(salary+50000)); 
					}
					else if (bonus.equals("No")){
						System.out.println("They will not get a bonus and their salaries will stay $50000.");
					}
					
					else{
						System.out.println("I don't understand.");
					}
					}
					if(rating.equals("D")){
				Scanner kb1=new Scanner(System.in);
				System.out.println("Should they get a bonus? Enter Yes or No");
				String bonus=kb1.nextLine();
					
					if(bonus.equals("Yes")){
					
						Scanner kb2=new Scanner(System.in);
						System.out.println("How much of a bonus?");
						int salary=kb2.nextInt();
						System.out.println("Their salary is now $"+(salary+45000)); 
					}
					else if (bonus.equals("No")){
						System.out.println("They will not get a bonus and their salaries will stay $45000.");
					}
					
					else{
						System.out.println("I don't understand.");
					}
					}
					if(rating.equals("D-")){
				Scanner kb1=new Scanner(System.in);
				System.out.println("Should they get a bonus? Enter Yes or No");
				String bonus=kb1.nextLine();
					
					if(bonus.equals("Yes")){
					
						Scanner kb2=new Scanner(System.in);
						System.out.println("How much of a bonus?");
						int salary=kb2.nextInt();
						System.out.println("Their salary is now $"+(salary+40000)); 
					}
					else if (bonus.equals("No")){
						System.out.println("They will not get a bonus and their salaries will stay $40000.");
					}
					
					else{
						System.out.println("I don't understand.");
					}
					}
					if(rating.equals("F")){
				Scanner kb1=new Scanner(System.in);
				System.out.println("Should they get a bonus(Probably Not... They're about to get fired...)? Enter Yes or No");
				String bonus=kb1.nextLine();
					
					if(bonus.equals("Yes")){
					
						Scanner kb2=new Scanner(System.in);
						System.out.println("How much of a bonus?");
						int salary=kb2.nextInt();
						System.out.println("Their salary is now $"+(salary+35000)); 
					}
					else if (bonus.equals("No")){
						System.out.println("They will not get a bonus and their salaries will stay $35000.");
					}
					
					else{
						System.out.println("I don't understand.");
					}
					}
									
									
				
				
			
		} while (!rating.equals("-X-"));	
	
	}
}