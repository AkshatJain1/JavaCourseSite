import java.util.Scanner;

public class Main  {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        HangmanGame game = new HangmanGame("Hello");

        do{
          System.out.println(game.sentence());
          System.out.println(game.getLetterGuesses());

          System.out.println("You have " + game.guessesLeft() + " guesses left!");


          char letter;
          do {
              System.out.print("Guess a letter: ");
               letter = kb.nextLine().charAt(0);
          }while(game.isGuessed(letter));

          if(game.guess(letter)){
              System.out.println("You guessed correctly!");
          } else{
              System.out.println("You guessed incorrectly!");
          }

          System.out.println("\n");

          if(game.won() == true){
              break;
          }
          if(game.guessesLeft() == 0){
              break;
          }

        }while(true);

        if(game.won()){
            System.out.print("Congrats, you won");
        }

        if(game.guessesLeft() == 0){
            System.out.print("Sucks, you lost");
        }

    }
}
