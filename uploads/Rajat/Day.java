
//Minor - User enters a number, outputs the corresponding weekday.
import java.util.Scanner;

public class Day {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day;

        do {
            System.out.println("What day of the week do you want to enter? Enter a number from 1-7. To end program, simply press -1");
            day = input.nextInt();

            if (day == 1) {
                System.out.println("Sunday! Uhh Tommorow's School...");
            }

            else if (day == 2) {
                System.out.println("Noooooo!!! It's Monday...");
            }

            else if (day == 3) {
                System.out.println("Tuesday! At least there's Tacos for lunch for TACO TUESDAY!!!"); 
            }
            
            else if (day == 4) {
                System.out.println("Wednesday! We're halfway there!");
            }   
			else if (day == 5) {
                System.out.println("Thursday! ALEMOST THERE!");
            }
            else if (day == 6) {
                System.out.println("YES FINALLY FRIDAYY,!!!!");
            }
            else if (day == 7) {
                System.out.println("Saturday!!!! Just wake up at 11:30.");
            }
            else if (day == -1) {
                System.out.println("You ended the program.");
            }
           else{
           		System.out.println("Invalid day of the week.");
           }
        }
        while (day != -1);
    }

} 