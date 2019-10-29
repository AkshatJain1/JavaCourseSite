/**
 * @(#)mathCalculator.java
 *
 *
 * @author 
 * @version 1.00 2018/7/16
 */

import java.util.Scanner;
public class mathCalculator {

    public static void main (String[] args) {
    Scanner keyboard= new Scanner (System.in);
    int menuOption;
    
    System.out.println("Welcome to the math calculator.");
    System.out.println();
    System.out.println("What would you like to do?");
    System.out.println();
    System.out.println("What would you like to do?");
    System.out.println(" 1. Addition \n 2. Subtraction \n 3. Division \n 4. Multiplication \n 5. Modulus \n 6. Exponents \n 7. Absolute Value \n 8. Round up a decimal number \n 9. Round down a decimal number \n 10. Take max of two numbers \n 11. Take min of two numbers \n 12. Square root \n 13. Random Number ( from any range - ex: 0 to 100. This must be an integer) \n 14. Exit");
    System.out.println("Enter a menu option:");
    menuOption=keyboard.nextInt();
    
  
  if (menuOption == 1){
 double  numb1, numb2;
  System.out.println ("You have chosen addition.");
  System.out.println ("Enter your first number:");
  numb1= keyboard.nextDouble();
  System.out.println ("Enter your second number:"); 
  numb2= keyboard.nextDouble();
  double answer= addition (numb1,numb2);
  System.out.println("The answer is " +answer);
  
   }
  if (menuOption == 2){
  double minuend,subtrahend; 
  System.out.println("You have chosen subtraction.");
  System.out.println("Enter your minuend:");
  minuend = keyboard.nextDouble();
  System.out.println("Enter your subtrahend:");
  subtrahend= keyboard.nextDouble();
  double answer= subtraction(minuend,subtrahend);
  System.out.println("The answer is "+ answer);
  
  }
  if (menuOption==3){
  double dividend, divisor;
  System.out.println("You have chosen division");
  System.out.println("Enter your dividend:");
  dividend= keyboard.nextDouble();
  System.out.println("Enter your divisor:");
  divisor= keyboard.nextDouble();
  double answer= division(dividend, divisor);
  System.out.println(+dividend+" divided by "+ divisor+ " is " + answer);
  }
  
  if (menuOption==4){
  double numb1, numb2;
  System.out.println("You have chosen multiplication.");
  System.out.println("Enter your first number:");
  numb1= keyboard.nextDouble();
  System.out.println("Enter your second number:");
  numb2= keyboard.nextDouble();
  double answer= multiplication(numb1, numb2);
  System.out.println(+numb1+" times "+numb2+" is "+answer);
  }
  
  if (menuOption==5){
  	double numb1, numb2;
  	System.out.println("You have chosen modulus.");
  	System.out.println ("Enter your first number(this will be the dividend):");
  	numb1= keyboard.nextDouble();
  	System.out.println("Enter your second number (this will be the number you divide by to find the remainder):");
  	numb2=keyboard.nextDouble();
  	double answer= modulus(numb1,numb2);
  	System.out.println("The answer is "+ answer);
  	}
  
  if (menuOption==6){
  double numb1, numb2;
  System.out.println("Enter your base:");
  numb1=keyboard.nextDouble();
  System.out.println("Enter the number of the power:");
  numb2= keyboard.nextDouble();
 double  answer= Math.pow(numb1,numb2);
  System.out.println(numb1+" raised to the power of "+numb2+ " is "+ answer);
 
  }
  
  if (menuOption==7){
  double number;
  System.out.println("Enter the number of which you would like to find the absolute value:");
  number= keyboard.nextDouble();
  double answer= absoluteValue(number);
  System.out.println("The absolute value of "+number+" is "+answer);
  }
  
  
  
  
  
  }
    
  public static double addition (double x, double y) {
  
  double answer = x+y;
  return answer;
  
 
    
 }   
    
public static double subtraction (double x, double y){

double answer = x-y;
return answer;
}
public static double division (double x, double y){

double answer=  x/ y;
return answer;
}


public static double multiplication (double x, double y){

double answer = x*y;
return answer;
}

public static double modulus (double x, double y){

double answer = x%y;
return answer;

}
public static double absoluteValue (double x){

double answer;
if (x>=0){

answer=x;
}

else {
 
answer= x/x-(x+1);
}



return answer;

}













































}    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
