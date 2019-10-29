import java.util.Scanner;

public class posOrNeg {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double  num;
		System.out.println("Enter an integer");
		num = keyboard.nextInt();
		System.out.println("The integer you chose was "+num);
		
		if(num>0)
		{
			System.out.println(num+ " is a positive number");
		}
		else
		{
			System.out.println(num+ " is a negative number");
		}
		
	}
    
    
}