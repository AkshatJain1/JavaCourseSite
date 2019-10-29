import java.util.Scanner;
public class WeekDay {
    public static void main(String[] args) {
    
    try{
    	
    	
    	System.out.print("Please enter day of the week number: ");
    	Scanner scanInt = new Scanner(System.in);
       			int day = scanInt.nextInt();
       			String message = "The " + day + " weekday is ";
       			
       			if (day >= 1 && day <= 5)
       			{
       				if (day == 1)
       				{
       					System.out.println(message + "Monday");
       				}
       				if (day == 2) {
       					System.out.println(message + "Tuesday");
       				}
       				if (day == 3)
       				{
       					System.out.println(message + "Wednesday");
       				}
       				if (day == 4)
       				{
       					System.out.println(message + "Thursday");
       				}
       				if (day == 5)
       				{
       					System.out.println(message + "Friday");
       				}
       			}else if (day >= 6 && day <=7) 
       			{
       				System.out.println("The number entered is not a weekday");
       			}else{
       				System.out.println("Invalid number entered");
       				}
   			System.out.println("");
    			
    } catch (Exception ex) {
      	System.out.println("The number you have entered does not correspond to a day of the week.");
    }
    
   	
   	
    	
    	
    
       
    }
}
