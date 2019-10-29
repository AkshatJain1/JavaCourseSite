/**
 * @(#)userNAme.java
 *
 *
 * @author 
 * @version 1.00 2018/7/18
 */

import java.util.Scanner;
public class userNAme {

    public static void main(String[] args) {
    Scanner keyboard= new Scanner (System.in);
    int x=1;
    
    int number;
    System.out.println("Enter your name:");
   String name=keyboard.next();
    
    while (x<10){
    System.out.println(name);	
    x=x+1;	
    	}
    
   System.out.println("Enter a number:");
   number= keyboard.nextInt();
   
  while (number<= 5){
  System.out.println("Enter a number:");
   number= keyboard.nextInt();
   }
   
   double numb1, numb2;
   numb2=1;
   System.out.println("Enter a number(I will print out the first ten multiples):");
   numb1= keyboard.nextDouble();
  while (numb2<=10){
  
 double answer= table(numb1, numb2);
  System.out.println(numb1+" x "+numb2+" = "+answer);
 numb2=numb2+1;
  } 
   
   
   System.out.println("What's the password?(6 digits)");
   int passwd= keyboard.nextInt();
   int truePassword=145623;
  
   if (passwd==truePassword) { System.out.println("Access Granted!");}
  
  
  else {
  
  do {
  System.out.println("Access Denied! Try again:");
  passwd= keyboard.nextInt();
  }
  while (passwd != truePassword);
   

   
   
   
  }
   
   
   }
   public static double table(double x,double y) {
   
   double answer = x*y;
   return answer;
   
   }
    



}