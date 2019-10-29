import java.util.Scanner;
public class Password{
	public static void main(String[] args)
	{
		Scanner yo= new Scanner(System.in);
		int mult = 1;
		
		System.out.print("Enter your name: ");
		String name = yo.nextLine();
		for(int x=1;x<11;x++)
		{
			String namep = NAME(name);
			System.out.println(namep);
		}
		
		System.out.println(" Input a number: ");
		int num = yo.nextInt();
		
		while(num < 6)
		{
			System.out.println("Input a different value: ");
			num = yo.nextInt();
		}
		
		System.out.println("Here is the multiplication table for 4");
		
		for(int x = 1; x < 11;x++)
		{	
			int ans = x*4;
			System.out.println("4 x "+x+" = " +ans);
		}
		
		int password = 123;
		System.out.println("Input a 3 digit number to guess the password: ");
		int pass = yo.nextInt();
		do 
		{
			System.out.println("Incorrect password try again: ");
			pass = yo.nextInt();
		}while (pass != password);
		if (pass == password)
			System.out.println("Correct");
		
		
	}
	
	public static String NAME(String name)
	{
		String NAM = ""+name;
		return NAM;
	}
	
	public static int Pass(int pass,123)
		
		
		
	
}