package ArmanPack;
import java.util.Scanner;
import java.util.Random;


public class Battleship {

	public static void main(String[] args) {
		boolean userStop = false;
		boolean inputOK = false;
		boolean ifHit = false;
		int numHits=0;
		int numMiss=0;
		int row;
		int column;
		Scanner keyboard = new Scanner(System.in);
		char [][] sea = {{'X', 'X', 'X', 'X', 'X'},
				{'X', 'X', 'X', 'X', 'X'},
				{'X', 'X', 'X', 'X', 'X'},
				{'X', 'X', 'X', 'X', 'X'},
				{'X', 'X', 'X', 'X', 'X'}};
		int [] rowShips = {-1, -1, -1, -1};
		int [] columnShips = {-1, -1, -1, -1};
			Random r1 = new Random();
			Random c1 = new Random();
			for(int k = 0; k < 4; k++)
			    {
			        rowShips[k] = r1.nextInt(5);
			        columnShips[k] = c1.nextInt(5);
			        for(int j = 0; j < k; j++)
			        {
			            if (rowShips[j] == r1.nextInt(5) && columnShips[j] == c1.nextInt(5))
			            {
			                k--;
			            }
			            else
			            {
			                continue;
			            }
			        }
			        if(k >= 0)
			        {
			            rowShips[k] = r1.nextInt(5);
			            columnShips[k]= c1.nextInt(5);
			        }
			        else
			        {
			            continue;
			        }
			    }
			for (int k = 0; k<4; k++)
			{
				System.out.println(rowShips[k]+ " " +columnShips[k]+ " ");
			}
		System.out.println("Welcome to Battleship");
		System.out.println("This is your game board");
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(sea [i][j]+ " ");
			}
			System.out.print("\n");
		}
		while(!userStop && numHits < 4 )
		{
			ifHit=false;
			inputOK = true;
			do
			{
				inputOK = true;
				System.out.println("Guess the row");
				row = keyboard.nextInt();
				System.out.println("Guess the column or enter 9 to Quit");
				column = keyboard.nextInt();
				if (column==9)
				{
					userStop = true;
					inputOK = true;
				}
				if (!userStop && (row>5 || row<1 || column > 5 || column<1)) 
				{
					inputOK = false;
					System.out.println("Invalid Choice, Try Again");
				}
			} while(!inputOK);
			
			if (!userStop)
			{
				// Now let's find whether a Hit or a Miss
				for (int i=0;i<4;i++) 
				{
					if((row-1) ==rowShips[i] && (column-1) ==columnShips[i]) 
					{
						if(sea [row-1][column-1] == 'H') 
						{
							System.out.println("You have already hit this ship before, enter something else");
							ifHit = true;
						}
						else
						{
						numHits++;
						System.out.println("You got a hit!");
						sea [row-1][column-1] = 'H';
						ifHit = true;
						}
					}
				}
				if (!ifHit)
				{
					System.out.println("You Missed");
					sea [row-1][column-1] = 'M';
					numMiss++;
				}
			} // End If Else
		} // End While
		System.out.println("You have "+numHits+" hits");
		System.out.println("You have "+numMiss+" misses");
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(sea [i][j]+ " ");
			}
			System.out.print("\n");
		}
		if(numHits==4)
		{
			System.out.println("You Won");
			int numTurns = numHits+numMiss;
			System.out.println("It took you "+numTurns+" turns to win");
		}
		else
		{
			System.out.println("You Lost");
		}
	}
}
	

