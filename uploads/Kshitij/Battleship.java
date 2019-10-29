import java.util.Scanner;
import java.util.Random;
public class Battleship {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num = 0;
        String[][] grid = {{"X ", "X ", "X ", "X ", "X "},
                           {"X ", "X ", "X ", "X ", "X "},
                           {"X ", "X ", "X ", "X ", "X "},
                           {"X ", "X ", "X ", "X ", "X "},
                           {"X ", "X ", "X ", "X ", "X "}};

        Random apple = new Random();
        int row1 = apple.nextInt(5);
        int row2 = apple.nextInt(5);
        int row3 = apple.nextInt(5);
        int col1 = apple.nextInt(5);
        int col2 = apple.nextInt(5);
        int col3 = apple.nextInt(5);
        while (((row1 == row2) || (row1 == row3) || (row2 == row3)) && ((col1 == col2) || (col1 == col3) || (col2 == col3))) {
            row1 = apple.nextInt(5);
            row2 = apple.nextInt(5);
            row3 = apple.nextInt(5);
            col1 = apple.nextInt(5);
            col2 = apple.nextInt(5);
            col3 = apple.nextInt(5);
        }


        System.out.println("Welcome to Battleship!");
        sleep(1500);
        print(grid);
        System.out.println("This is the starting grid. You will be playing battleship against me, the computer!");
        sleep(3000);
        System.out.println("This game is simple. All you have to do is enter in where you want to strike, and the game will fire at that point.");
        sleep(3000);
        System.out.println("If you manage to hit (Marked by a 'H') all of the ships that I hid, which there will be three of, you win!");
        sleep(3000);
        System.out.println("However, if you miss (Marked by a 'M') all my ships except one, you lose!");
        System.out.println("Are you ready? Let's start!");
        sleep(2000);
        while ((!"H ".equals(grid[row1][col1])) && (!"H ".equals(grid[row2][col2])) && (!"H ".equals(grid[row3][col3]))) {
            playerTurn(grid, keyboard, row1, row2, row3, col1, col2, col3);
            sleep(500);
            print(grid);
            num++;
            for (int i = 0; i < grid.length; i++) {
                for (int r = 0; r < grid[0].length; r++) {
                    if (grid[r][i] == "M ") {
                        break;
                    }
                }
            }
        }
        System.out.println("WOW! YOU WON! CONGRATULATIONS!");
        System.out.println("It only took you " + num + " turns to win!");

    }

    public static void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (Exception e) {
        }
    }

    public static void print(String[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int r = 0; r < grid[0].length; r++) {
                System.out.print(grid[r][i] + "");
            }
            System.out.println();
        }
    }

    public static void playerTurn(String[][] grid, Scanner keyboard, int row1, int row2, int row3, int col1, int col2, int col3) {
        System.out.print("Enter the row of your strike (1 - 5): ");
        int userRowGuess = keyboard.nextInt() - 1;
        sleep(1000);
        System.out.print("Enter the column of your strike (1 - 5): ");
        int userColGuess = keyboard.nextInt() - 1;
        if ((userRowGuess < 0 || userRowGuess > 5) || (userColGuess < 0 || userColGuess > 5)) {
            System.out.println("That's not a point on our board! Run the program again please!");
            System.exit(0);
        } else if ((userRowGuess == row1) && (userColGuess == col1)) {
            grid[userColGuess][userRowGuess] = "H ";
            System.out.println("Aww, you got a hit. Good job!");
        } else if ((userRowGuess == row2) && (userColGuess == col2)) {
            grid[userColGuess][userRowGuess] = "H ";
            System.out.println("Aww, you got a hit. Good job!");
        } else if ((userRowGuess == row3) && (userColGuess == col3)) {
            grid[userColGuess][userRowGuess] = "H ";
            System.out.println("Aww, you got a hit. Good job!");
        } else if ((userRowGuess != row1) && (userColGuess != col1)) {
            grid[userColGuess][userRowGuess] = "M ";
            System.out.println("Nice try, but you missed.");
        } else if ((userRowGuess != row2) && (userColGuess != col2)) {
            grid[userColGuess][userRowGuess] = "M ";
            System.out.println("Nice try, but you missed.");
        } else if ((userRowGuess != row3) && (userColGuess != col3)) {
            grid[userColGuess][userRowGuess] = "M ";
            System.out.println("Nice try, but you missed.");
        }
    }
}