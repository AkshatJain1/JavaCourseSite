import java.util.Scanner;
public class AverageCalculator{
	public static void main(String[] args)
	{
		Scanner aye= new Scanner(System.in);
		System.out.println("This is an average calculator. All you have to do is input 3 decimal values and the computer will give you your average: ");
		System.out.println("Input a decimal value: ");
		Double numA = aye.nextDouble();
		System.out.println("Input a second decimal value: ");
		Double numB = aye.nextDouble();
		System.out.println("Input a third decimal value: ");
		Double numC = aye.nextDouble();
		Double avg = (numA+numB+numC)/3;
		System.out.println("The average is: "+avg);
		
		
		
		
	}
}
	