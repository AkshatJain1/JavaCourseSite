import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by respe on 7/12/2017.
 */
public class Main {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Movie> movies = new ArrayList<>();

        movies.add(new Movie("PG-13",5,"Spiderman: Homecoming"));
        movies.add(new Movie("G",4,"Cars 3"));
        movies.add(new Movie("PG",2,"Captain Underpants"));
        movies.add(new Movie("PG-13",5,"The Fate of the Furious"));
        movies.add(new Movie("PG",4,"Kung Fu Panda 3"));

        while(true) {
            for (int x = 0; x < movies.size(); x++) {
                System.out.println((x + 1) + ". " + movies.get(x).toString());
            }

            System.out.print("\nWelcome user! What movie do you want to book?: ");
            int sel = keyboard.nextInt();

            System.out.print("How many tickets?: ");
            int tickets = keyboard.nextInt();

            System.out.println();

            for (int x = 0; x < movies.get(sel - 1).getSeatingChart().length; x++) {
                for (int y = 0; y < movies.get(sel - 1).getSeatingChart()[0].length; y++) {
                    System.out.print(movies.get(sel - 1).getSeatingChart()[x][y] + " ");
                }
                System.out.println();
            }

            for (int x = 0; x < tickets; x++) {
                int row, col;
                do {
                    System.out.println("What row do you want ticket number "+ (x+1) +" in?");
                    row = keyboard.nextInt();

                    System.out.println("What col do you want  ticket number "+ (x+1) +" in?");
                    col = keyboard.nextInt();
                } while (!movies.get(sel - 1).occupySeat(row, col));

            }

            System.out.println("\nPlease pay $" + 5 * tickets + " when you get to the theatre.\n\n\n");

        }






    }
}
