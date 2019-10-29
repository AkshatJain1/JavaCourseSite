/*
 *create an array of 5x5 spots in an theoretical ocean. /	
 *set some random spots to be our "ships".			/
 *keep asking the user to guess the row, col		
 *they cant enter something thats not valid
 * if they miss, set the value at that spot to a M
 *if they hit, set the value at that spot to a H
 *otherwise all default values are X
 *when they hit all the ships that they need, they are done and they won
 *you lose when everything but the ships are M 
 */
 import java.util.Scanner;
 public class BattleShip
 {
 	public static void main(String[] args)
 	{
 		Scanner keyboard = new Scanner(System.in);
 		char[][] ocean = {{'X','X','X','X','X'},
 						{'X','X','X','X','X'},
 						{'X','X','X','X','X'},
 						{'X','X','X','X','X'},
 						{'X','X','X','X','X'}};
 		int[] rowOfShips = {-1,-1,-1,-1};
 		int[] colOfShips = {-1,-1,-1,-1};
 		
 		for(int x=0;x<rowOfShips.length;x++)	{
 			int rShip,cShip;
 			boolean runagain = false;
 			do
 			{
 				 rShip = (int)(Math.random()*5);
 				 cShip =(int)(Math.random()*5);
 				for(int s = 0;s<rowOfShips.length;s++)
				{
					if(rShip == rowOfShips[s]&&cShip == colOfShips[s])
					{
						runagain = true;
						break;
					}
					if(s==3)
					{
						runagain = false;
						break;
					}
					
				}
 			
 			}while(runagain);
 			rowOfShips[x] = rShip;
 			colOfShips[x] = cShip;
 		}
 	
 	
 	
 	
 	
 	
 	
		do
 		{
 			for(int r = 0; r<ocean.length;r++)
 			{
 				for(int c=0;c<ocean[0].length;c++)
 				{
 					System.out.print(ocean[r][c]+ " ");
 				}
 				System.out.println();
 			}
 			
 			System.out.print("\n\nEnter the row of your hit: ");
 			int rHit = keyboard.nextInt();
 			System.out.print("Enter the column of your hit: ");
 			int cHit = keyboard.nextInt();
 			
 			for(int s = 0;s<rowOfShips.length;s++)
			{
				if(rHit == rowOfShips[s] && cHit == colOfShips[s])
				{
					System.out.println("You got a hit!");
					ocean[rHit][cHit] = 'H';
					break;
				}
				if(s==3)
				{
					System.out.println("Sorry. You missed! :(\n\n");
					ocean[rHit][cHit] = 'M';
				}
			}
			
			int mCount =0;
			int hCount =0;
			for(int r = 0; r<ocean.length;r++)
 			{
 				for(int c=0;c<ocean[0].length;c++)
 				{
 					if(ocean[r][c]=='M')
 						mCount++;
 					if(ocean[r][c]=='H')
 						hCount++;
 				}
 			}
 			
 			if(mCount==21)
 			{
 				System.out.print("You lose");
 				break;
 			}
 			else if(hCount==4)
 			{
 				System.out.print("You won");
 				break;
 			}
 			
 			
 		}while(true);
 		
 		 		
 	}
 }