import java.util.Scanner;

public class votingAge {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int age;
		int votingYears, votingYears2;
		int yearInc;
		int numElections;
		System.out.println("Enter your age");
		age = keyboard.nextInt();
		if (age>=18)
		{
			votingYears = age-18;
			if(age==18)
			{
				System.out.println("Congrats! You are 18, you have just started voting");
			}
			else
			{
			    System.out.println("You have been voting for "+votingYears+" year(s). Good for you!");
			}
			if (votingYears%4==0 || votingYears%4==1)
			{
				yearInc=0;
			}
			else
			{
				yearInc=1;
			}
			numElections=votingYears/4+yearInc;
			System.out.println("You have voted in "+numElections+" Presidential Election(s), lucky, I'm still underage.");
		}
		else
		{
			votingYears2 = 18 - age;
			System.out.println("You haven't started voting yet, but you will in "+votingYears2+" year(s). You're too young, just like me!");
		}
		
	    if((age+1)%2==0)
	    {
	        System.out.println("Next year your age will be an even number, even numbers are my favorite!");
	    }
        else
        {   
            System.out.println("Next year your age will be an odd number, odd numbers are pretty fascinating");
        }
    
}
}