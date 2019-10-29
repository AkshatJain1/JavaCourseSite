import java.util.Scanner;

public class major_grade{
	public static void main(String[] args){
		String name;
		String name1;
		String noun;
		String animal;
		String adjective;
		int number;
		int int1;
		char char1;
		String tv;
		int noice;
			
			System.out.println("Hello, My name is DataBlender.Nice to meet you!");
			Scanner kb = new Scanner(System.in);
			System.out.println("What is your name? ");
			name=kb.nextLine();
			System.out.println("Hello "+name+"!");
			System.out.println("Let me tell you about myself!");
			System.out.println("You can enter information in me and I can turn it into...uhhhh... A story! So lets begin!");
			
			Scanner kb1 = new Scanner(System.in);
			System.out.println("Please enter a name.");
			name1=kb1.nextLine();
			
			Scanner kb2 = new Scanner(System.in);
			System.out.println("Please enter a place.");
			noun=kb2.nextLine();
			
			Scanner kb3 = new Scanner(System.in);
			System.out.println("Please enter an animal.");
			animal=kb3.nextLine();
			
			Scanner kb4 = new Scanner(System.in);
			System.out.println("Please enter an adjective.");
			adjective=kb4.nextLine();
			
			Scanner kb5 = new Scanner(System.in);
			System.out.println("Please enter an integer.");
			number=kb5.nextInt();
			
			Scanner kb6 = new Scanner(System.in);
			System.out.println("Please enter an integer.");
			int1=kb6.nextInt();
			
			Scanner kb7= new Scanner(System.in);
			System.out.println("Please enter a letter between b-z.");
			char1 = kb7.next().charAt(0);
			
			Scanner kb8 = new Scanner(System.in);
			System.out.println("Please enter a noun");
			tv=kb8.nextLine();
			
			Scanner kb9 = new Scanner(System.in);
			System.out.println("Please enter a six digit decimal.");
			Double weit=kb9.nextDouble();
			
			
			
			System.out.println("Generating Results...");
			System.out.println("There once was a boy named "+name1+".He lived in "+noun+". He had a pet "+animal+"."+name1+" was also known to be very "+adjective+".");
			System.out.println("Just like every doomed teenager, "+name1+" was forced to go through school.His first class of the day was Math. He was trash at math...");
			System.out.println("Today the teacher asked him 'Give me 20 decimal numbers of pi.'"+name1+ " answered "+number+". His teacher kicked him out of class. Later, he had english.");
			System.out.println("His teacher there asked him,'What is the first letter of the alphabet?'"+name1+" answered "+char1+". He got kicked out of that class too.");
			System.out.println("His school day ended after some time. Tired, "+name1+" went to go watch some tv. But the tv wouldn't work. He ent to check why." );
			System.out.println("No wonder it didn't work! there was a "+tv+" in  the tv. Now he would have to buy a new one. He thought to himself that he should go to bed.");
			System.out.println("Before he went to sleep. He checked his weight.He was "+weit+" pounds... he thought to himself,'I have to lose weight...'" );
			System.out.println("As he dozed off. He thought to himself,'What am I doing with my life? He got up and thought that he would be a better student." );
			System.out.println("He immidietly started studying. The next day, he had a math test. he was ready.The first question was a question that said,");
			System.out.println("'Write a number and show your work'");
			
			
			Scanner kb11 = new Scanner(System.in);
			System.out.println("Please enter an integer");
			noice=kb11.nextInt();
			
			Scanner kb12 = new Scanner(System.in);
			System.out.println("Please enter another integer");
			int noice2=kb12.nextInt();
			
			Scanner kb13 = new Scanner(System.in);
			System.out.println("Please enter another integer.");
			int int4=kb13.nextInt();
			
			Scanner kb14 = new Scanner(System.in);
			System.out.println("Please enter one last integer.");
			int int5=kb14.nextInt();
			
			
			
			
			
			
			System.out.println(name1+" got a hundred! His answer was: "+noice+noice2/(int5)%(noice2)+weit+weit/(noice2));
			
			System.out.println("you might be wondering how i reached that number from all of the numbers you gave me.");
			System.out.println("I took much of the numbers and renamed them into variables that put on random operations on them!");
			System.out.println("this was the code used: noice+noice2/(int5)%number(noice2)+weit+weit/(noice2)");
			
			
			
			
			
			
			
			
			
			
			
			Scanner kb10 = new Scanner(System.in);
			System.out.println("Please rate us out of 100!");
			int int2=kb10.nextInt();
			
			System.out.println("Thank You!!!! PLEASE COME AGAIN!!!!");
			
		
	}
}