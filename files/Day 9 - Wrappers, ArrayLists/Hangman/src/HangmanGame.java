import java.util.ArrayList;
public class HangmanGame {
    //class
    public static final int MAX_GUSSES = 6;

    //instance attributes
    private ArrayList<Character> sentence;
    private ArrayList<Character> letterGuesses;

    private int wrongGuesses;

    public HangmanGame(String main_sentence){

        this.letterGuesses = new ArrayList<>();
        this.sentence = new ArrayList<>();

        for(int a =0; a < main_sentence.length(); a++){
            char letterInSentence = main_sentence.charAt(a);
            this.sentence.add(letterInSentence);
        }

        this.wrongGuesses = 0;

    }

    public ArrayList<Character> getSentence() {
        return sentence;
    }

    public void setSentence(ArrayList<Character> sentence) {
        this.sentence = sentence;
    }

    public ArrayList<Character> getLetterGuesses() {
        return letterGuesses;
    }

    public void setLetterGuesses(ArrayList<Character> letterGuesses) {
        this.letterGuesses = letterGuesses;
    }

    public int getWrongGuesses() {
        return wrongGuesses;
    }

    public void setWrongGuesses(int wrongGuesses) {
        this.wrongGuesses = wrongGuesses;
    }

    public boolean guess(char letter){
        boolean inSentece = sentence.contains(letter);

        letterGuesses.add(letter);

        if(inSentece){
            return true;
        }
        else{
            wrongGuesses++;
            return false;
        }
    }

    public boolean isGuessed(char letter){
        return letterGuesses.contains(letter);
    }

    public int guessesLeft(){
        return MAX_GUSSES-wrongGuesses;
    }

    public String sentence() {

        String user_sentence = "";

        for(int a =0; a < sentence.size(); a++){
            char letter = sentence.get(a);
            boolean hasBeenGussed = isGuessed(letter);

            if(hasBeenGussed){
                user_sentence += letter;
            }
            else{
                user_sentence += " _ ";
            }
        }


        return user_sentence;
    }

    public boolean won() {
        return !(sentence().contains("_"));
    }

}
