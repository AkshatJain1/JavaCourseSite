import java.util.Scanner;
public class Weekday
{
	public static void main(String [] args)
	{
		Scanner yo= new Scanner (System.in);
		System.out.println("Input a whole number between 1 and 7: ");
		int num= yo.nextInt();
		
		String day = "";
		if(num==1)
			day = "Sunday";
		else if(num==2)
			day = "Monday";
		else if(num==3)
			day = "Tuesday";
		else if(num==4)
			day = "Wednesday";
		else if(num==5)
			day = "Thursday";
		else if(num==6)
			day = "Friday";
		else if(num==7)
			day = "Saturday";
		
		System.out.println("\nYour number correlates to the day: "+day);
	
			
		
		
	}	
}