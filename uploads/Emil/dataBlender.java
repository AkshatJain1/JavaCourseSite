import java.util.Scanner;
public class dataBlender
{
	public static void main (String[] args)
	{
		Scanner yo = new Scanner(System.in);
			
			System.out.println("Hello user. I am going to collect data and blend it together to create more random data. All I need is a few pieces of data to get started: ");
			System.out.println(" First off I need a random integer: ");
			int data1= yo.nextInt();
			System.out.println(" In addition I need a decimal value: ");
			double data2= yo.nextDouble();
			System.out.println("Next I need another decimal value: ");
			double data3= yo.nextDouble();
			System.out.println("Finally I need one last integer: ");
			int data4= yo.nextInt();
			System.out.println("I will now multiply, divide, add, and subtract these values to create a completley random number:) ");
			System.out.println(" your lucky number is:"+ (data1+data4)*data2/data4%data1+(int)data3);			
		
	}
}