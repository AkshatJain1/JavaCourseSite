// John the manager of a company called "Dart Frog" is trying to give a salary raise to his team based on individual performance.
import java.util.Scanner;
public class Datablender {
    public static void main(String[] args) {
    	System.out.println("***********************DATA BLENDER APPLICATION*********************************");  
    		try{
    			double newSalary=0;
    			boolean IsDegree = false;
    			System.out.print("Hello Krishna, Welcome to the Dart Frog application interview!");
    			System.out.println("We will  ask you a few questions to determine if you are qualified for this position.");
    			System.out.println("");
    		
    			System.out.print("How many years of experience have you had in this field? ");
    			Scanner scanInt = new Scanner(System.in);
       			int experience  = scanInt.nextInt();
    			System.out.println("");
    			
    			System.out.print("Do you have a degree in biochemistry or herpetology?"); 
    			Scanner scanStringdeg = new Scanner(System.in);
    			String degree = scanStringdeg.nextLine();
    			if(degree.equalsIgnoreCase("y")||degree.equalsIgnoreCase("yes"))
    			{
    				IsDegree = true;
    			}else if (degree.equalsIgnoreCase("n")||degree.equalsIgnoreCase("no"))
    			{
    				IsDegree = false;
    			}else
    			{
    				IsDegree = false;
    			}
    			
    			
    			
    			
    			System.out.print("Please state the company name in which you currently working for.: ");
    			Scanner scanString = new Scanner(System.in);
                String company = scanString.nextLine();
    			System.out.println("");
    			
    			System.out.print("are you currently living in the Greater Houston Area? State Y for yes or N for no.: ");
    			Scanner scanChar = new Scanner(System.in);
                char Islocal= scanChar.next().charAt(0);
    		    System.out.println("");
    		
    		    System.out.print("What is your current salary?: ");
    		    Scanner scanDouble = new Scanner(System.in);
                double salary = scanDouble.nextDouble();
    		    System.out.println("");
    		    
    		    
    		    
    		    if (experience >= 10)
    		    {
    		    	newSalary= salary*(0.08);//8% raise
    		    	salary=salary+newSalary;
    		    }
    		    else {
    		    	newSalary= salary*(0.04);//4% raise
    		    	salary=salary+newSalary;
    		    	
    		    }
    		    System.out.println("If you are selected for this position, your new salary will be $" + salary);
    		    int bonus=0;
    		    if (IsDegree==true)	{
    		    	bonus=5000;//give an additional 5000 dollars as a bonus if he has one of the degrees listed.
    		    	System.out.println("You're also qualified for the bonus of $" +bonus);
    		    	
    		    }
    				
    		     
    			
    			
    			
    		}catch(Exception ex)
    		{
    			System.out.println("Invalid data entered. Enter the proper value. ");
    		}
    	
	
    }
}
