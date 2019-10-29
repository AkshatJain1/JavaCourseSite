import java.util.Scanner;

public class practiceAGAIN{
	public static void main(String[] args)
	{
		System.out.println("Hello. My Name is S.A.I, which stands for SURVEYING, ARTIFICIAL, INTELLIGIENCE. Today I have survey for you. Please answer the following questions.");
		Scanner kb = new Scanner(System.in);
		String school;
		int age;
		String name;
		double noice;
		int yeet;
		double mega;
		int rate;
			System.out.println("How old are you? ");
			age = kb.nextInt();
			
			Scanner kb1 = new Scanner(System.in);
			System.out.println("What is your name? ");
			name=kb1.nextLine();
		
			Scanner kb2 = new Scanner(System.in);
			System.out.println("What is your favorite show? ");
			school = kb2.nextLine();
			
			Scanner kb3 = new Scanner(System.in);
			System.out.println("What is your height in feet to the nearest half foot?(answer in decimals)");
			noice = kb3.nextDouble();
			
			Scanner kb4 = new Scanner(System.in);
			System.out.println("How many siblings do you have?");
			yeet = kb4.nextInt();
			
			Scanner kb5 = new Scanner(System.in);
			System.out.println("How much money do you usually carry around?(Answer in decimals)");
			mega = kb5.nextDouble();
			
			
			
			
			
			System.out.println("So in conclusion, you are "+age+" years old. Your name is " +name+". Your favorite show is "+school+".You are approximately "+noice+" ft tall.You have "+yeet+" sibling(s). You probably have $"+mega+" with you right now. Thank you for your time with S.A.I. Please rate us." );
			
			
			Scanner kb6 = new Scanner(System.in);
			System.out.println("How many, out of ten stars, would you rate S.A.I?");
			rate = kb6.nextInt();
			
			System.out.println("Thank you for rating S.A.I "+rate+" stars. We hope that next time, S.A.I will meet you expectations.");
	}		
}