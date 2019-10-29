import java.util.Scanner;       
public class VoterAge {
      public static void main(String[] args) {
      		try{
      	int ageLimit = 18;
      	
      	System.out.println("Welcome to the presidential voting system!");
      	System.out.println("");
        System.out.print("Please enter your age to determine if you are eligible to vote: ");
    	Scanner scanInt = new Scanner(System.in);
    		int votersAge = scanInt.nextInt();
    		if(votersAge < ageLimit){
    			votersAge = ageLimit - votersAge;
    			System.out.println("Sorry, you are ineligible to vote.");
    			System.out.println("You need to wait for " + votersAge +" year(s).");
    		} else{
    			votersAge = votersAge - ageLimit;
    			System.out.println("You have been eligible to vote for the past " + votersAge +" year(s).");
    			
    		}
    			
    			
        //System.out.print(" ");
    	//Scanner scanInt = new Scanner(System.in);
       	//int experience  = scanInt.nextInt();
    	System.out.println("");
    	
    	}catch(Exception ex)
    		{
    			System.out.println("Invalid data entered. Please enter the valid age. ");
    			
    		}
    			
        
    }
}
       