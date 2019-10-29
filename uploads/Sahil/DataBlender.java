import java.util.Scanner;
public class DataBlender{
public static void main(String[] args) {
	Scanner keyBoard = new Scanner(System.in);

	boolean amIReady;
	String userName = "";
	int userAge;

	System.out.println("\nHello and welcome to DataBlender, a system that takes your input, changes it, and gives you the new data! Press enter to continue...");
	String input = keyBoard.nextLine();
	if (input.equals("0"));
	{
		System.out.println("\nWe'll be starting soon. First we would like to know a bit more about you. Press enter to continue...");
		String input1 = keyBoard.nextLine();
		if (input1.equals("0"));
		{
			System.out.println("\nOk, are you ready? Respond as true or false.");
			amIReady = keyBoard.nextBoolean();
		}
	}

	if (amIReady == true)
	{
		System.out.println("\nOk then! Please enter your name.");
		userName = keyBoard.next();
	}
	if (amIReady == false)
	{
		System.out.println("\nType 'Ready' when you are ready to continue.");
		Scanner keyBoard2 = new Scanner(System.in);
		String input2 = keyBoard2.nextLine();
		if (input2.equals("Ready"))
		{
		System.out.println("\nOk then! Please enter your name.");
		userName = keyBoard.next();

		}
	}

	System.out.println("\nOk, " + userName + " what is your age?");
	userAge = keyBoard.nextInt();

	System.out.println("\nOk, I have another question for you. Think of your native language. What is it's first letter? For example, 'e' for English.");
	char userLetter = keyBoard.next().charAt(0);

	System.out.println("\nWe're not done yet! Do you like to read? Answer as true or false.");
	boolean userRead = keyBoard.nextBoolean();

	System.out.println("\nOk, last question: how many digits of pi do you know? Enter as many as you can remember. If you don't know any, just type in '3'.");
	double userPi = keyBoard.nextDouble();

	//Question variables: userName, userAge, userLetter, userRead, userPi

	System.out.println("\nHere is your blended, mixed and matched data: ");
	System.out.println("\n" + userName + "hafshj" + userLetter + "iAmaPiG" + userPi + "4537454385739sadhd898d8ea78ef7" + userAge*1783.4324+327647 + userRead + "ENDOFTRANSMISSION_BZZT.");

}
}