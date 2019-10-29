/**
 * @(#)threeNumberAverage.java
 *
 *
 * @author
 * 
 *@version 1.00 2018/6/30
 */
 
  import java.util.Scanner;


public class threeNumberAverage {
	
public static void main(String[] args) 
{	

	Scanner keyboard = new Scanner(System.in);
	double numb1, numb2, numb3;
	
	System.out.print("Enter your first double" );
    numb1= keyboard.nextDouble();
    
    System.out.print("Enter your second double");
    numb2= keyboard.nextDouble();
    
    System.out.print("Enter your third double");
    numb3= keyboard.nextDouble();
    
   System.out.print((numb1+numb2+numb3)/3);
   
}


}    
    
