package ArmanPack;
import java.util.Scanner;

public class Hangman {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		char guess;
		int numGuesses=0;
		numGuesses = HangmanGame.correctGuesses + HangmanGame.wrongGuesses;
		while (numGuesses != 6)
		{
			System.out.println("Welcome to Hangman");
			for(char r:HangmanGame.Sentence)
			{
				System.out.println(r+ " ");
			}
			System.out.println("Enter a letter guess");
			guess = keyboard.next().charAt(0);
			HangmanGame.guess(guess);
			
			if (HangmanGame.guess(guess) == true)
			{
				System.out.println("You guessed right");

			}
			else
			{
				System.out.println("You guessed wrong");
			}
		}
		if (true == HangmanGame.won() && HangmanGame.guessesLeft() != 0)
		{
			System.out.println("You won");
		}
		else
			System.out.println("You lost");

	}

}
import java.util.arrayList;
public class HangmanGame {
	final float MAX_GUESSES = 6;
	public static int wrongGuesses;
	public static int correctGuesses;
	static ArrayList <Character> Sentence = new ArrayList<Character>();
	static ArrayList<Character> LettersGuessed = new ArrayList<Character>();
	//public static void main(String[] args) {
	public HangmanGame() {
	int sum=0;
	//int wrongGuesses;
	//ArrayList <Character> Sentence = new ArrayList<Character>();
	int wrongGuesses = 0;
	Sentence.add('h');
	Sentence.add('e');
	Sentence.add('l');
	Sentence.add('l');
	Sentence.add('o');
	LettersGuessed.add(guess+ " ");
	}
	public HangmanGame(int wrongGuesse) {
		wrongGuesses = wrongGuesse;
	}
	public int getWrongGuesses() {
		return wrongGuesses;
	}
	public void setWrongGuesses(int wrongGuesses) {
		this.wrongGuesses=wrongGuesses;
	}
	public static boolean guess (char letter) 
	{
		for(int i = 0;i<Sentence.size();i++) {
			sum+=(int)(Sentence.charAt(i));
		}
		if ()
		{
			correctGuesses++;
		}
		else
			wrongGuesses++;
		return true;
	}
	public static boolean isGuessed (char letter)
	{
		return true;
	}
	public static boolean sentence () 
	{
		return true;
	}
	public static int guessesLeft () 
	{
		return 6 - (wrongGuesses + correctGuesses);
	}
	public static boolean won() 
	{
		return true;
	}
}
