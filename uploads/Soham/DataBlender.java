/**
 * @(#)DataBlender.java
 *
 *
 * @author 
 * @version 1.00 2018/6/30
 */

import java.util.Scanner;
public class DataBlender {

    public static void main(String[] args) {
    
   Scanner keyboard= new Scanner(System.in);
   int numbOfHrsSpentPlayingVideoGames; 
   boolean yes=true;
   boolean no= false;
   char favoriteLetter;
   double yourFavoriteDecimalNumber;
   double sqrtOfyourgrade;
   
   
   
   System.out.println("Hello! My name is data blender. I'm going to mix and match what you enter.");
   System.out.println(" To start things off enter the number of hours you spend playing video games. Please round to the nearest whole number"); 
   numbOfHrsSpentPlayingVideoGames= keyboard.nextInt();
   System.out.println(" Now lets add that to the average amount of time a person spends sleeping in the US in a day. 6.8 ");
   System.out.print(" So you spend ");
   System.out.print(numbOfHrsSpentPlayingVideoGames+6.8);
   System.out.print(" hours sleeping and playing video games.") ;
   System.out.print (" So that's ");	
   System.out.print ( (numbOfHrsSpentPlayingVideoGames+6.8)/24);
   System.out.print("% of your day.");
   System.out.println();
   System.out.println("Enter your current grade in a decimal form. Ex: If your grade is 98 enter 98.0 ");
   yourFavoriteDecimalNumber= keyboard.nextDouble();
   System.out.println("Now let's calculate the sqaure root of your grade multiplied by 10");  
  sqrtOfyourgrade=Math.sqrt(yourFavoriteDecimalNumber);
    System.out.print(" The square root of your grade is ");
    System.out.print(sqrtOfyourgrade);
    System.out.print(". ");
    System.out.print("Now lets multiply that by 10.");
    System.out. print(" The final answer is ");
    System.out.print(sqrtOfyourgrade*10);
    
    
    
    
    
    
    }
    
    
}