import java.util.Scanner;

public class Repitition {
public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	int num, i, pword;
	String userName;
	boolean goodPassword;
	System.out.println("Enter your name");
	userName = keyboard.next();
	for (i=1;i<10;i++)
	{
		System.out.println(userName);
	}
	System.out.println("Enter a number");
	num = keyboard.nextInt();
	do
	{
		System.out.println("Enter a number");
		num = keyboard.nextInt();
	}	
	while (num<=5);		
	multiTable();	
		do
 	{
 		System.out.println("Enter a numeric password");
 		pword = keyboard.nextInt();
 		goodPassword = password(pword);
 		if(goodPassword)
 		{
 			System.out.println("Access Granted");
 		}
 		else
 		{
 			System.out.println("Access Denied");
 		}
 	}
 				while (!goodPassword);	
	
}
 public static void multiTable () {
 int mult, i;	
 for(i=1;i<=10;i++)
 {
 	mult = i * 4;
 	System.out.println("4 times "+i+" = "+mult);
 }	
 }   
 public static boolean password (int pword) {
 				if(pword==2448)
 		{
 			return true;
 		}
 			else
 			{
 				return false;
 			}
 	
 	
 
}
 }