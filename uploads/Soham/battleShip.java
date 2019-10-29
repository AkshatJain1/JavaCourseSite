
import java.util.Random;
import java.util.Scanner;
public class battleShip {


    public static void main(String[] args) {




        Scanner keyboard= new Scanner(System.in);
        Random mynumber= new Random();
        System.out.println("Random Number:" + mynumber);
        int rowCoordinate, columnCoordinate;
        int number1, number2;
        System.out.println("Welcome to Battle Ship. \nBelow is your board. \nYour objective is to hit all the ships in as less turns as possible. There are three ships");

        String[][] battleShipBoard = {{"xxxxx"},
                                      {"xxxxx"},
                                      {"xxxxx"},
                                      {"xxxxx"},
                                      {"xxxxx"}};

        for  (int r = 0; r < battleShipBoard.length; r++) {

          for (int c=0;c < battleShipBoard[0].length; c++){
               System.out.print(battleShipBoard[r][c]+"");
          }
          System.out.print("\n");
        }


// Assigning values to coordinates

        number1= mynumber.nextInt(4);
        number2= mynumber.nextInt(4);

       System.out.println(number1+"&"+number2);




        System.out.println("Enter your row coordinate:");
        rowCoordinate=keyboard.nextInt();
        // Checing if entered coordinates are valid
       if (rowCoordinate >=5){
           System.out.println("Error. Please enter coordinate that is between 0 and 4.");
           rowCoordinate= keyboard.nextInt();
       }

        if (rowCoordinate <0){
            System.out.println("Error. Please enter coordinate that is between 0 and 4.");
            rowCoordinate= keyboard.nextInt();
        }

        System.out.println("Enter your column coordinate:");
         columnCoordinate=keyboard.nextInt();

         if (columnCoordinate >=5){
            System.out.println("Error. Please enter coordinate that is between 0 and 4.");
            columnCoordinate= keyboard.nextInt();
        }

        if (columnCoordinate <0){
            System.out.println("Error. Please enter coordinate that is between 0 and 4.");
            columnCoordinate= keyboard.nextInt();
        }



     if (rowCoordinate==number1 && columnCoordinate==number2)
      {
     System.out.println("Nice you got a hit!");

      battleShipBoard[number1][number2]="h";

          for  (int r = 0; r < battleShipBoard.length; r++) {

              for (int c=0;c<battleShipBoard[0].length; c++){
                  System.out.print(battleShipBoard[r][c]+"");
              }
              System.out.print("\n");
         }




         }

       else {

             System.out.println("Oops! you missed try again");
            battleShipBoard[rowCoordinate][columnCoordinate]="m";
         }








    }
}