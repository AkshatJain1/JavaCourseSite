import java.util.Scanner;
public class Voting
{
	public static void main( String[] args)
	{
	   Scanner yo= new Scanner (System.in);
	   System.out.println(" How old are you? ");
	   int age= yo.nextInt();
	   
	   int yr;
	   int yr2;
	   int elec;
	   if(age>= 18)
	   {
	   		yr = age-18;
	   		System.out.println("You are eligible to vote, you have been eligible for "+yr+" years.");
	   		elec = yr/4;
	   		System.out.println("You have participated in "+elec+" elections."); 		
	   }	
		else if(age<18)
		{
			yr2 = 18-age;
			System.out.println("Sorry, but you can only vote in "+yr2+" years");
		}
		int div = age%2;
		if(div==0)
		{
			System.out.println("Next year your age will be an odd number.");
		}
		else
		{
			System.out.println("Next year your age will be an even number.");
		}	
			
	}
	
}

