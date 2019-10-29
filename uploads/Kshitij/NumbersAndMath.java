public class NumbersAndMath
{
	public static void main( String[] args )
	{
		//This line prints out the line which introduces the code.
		System.out.println( "I will now count my chickens:" );
		//This line adds 25 and 30/6, which gives you 30, and then prints out how many hens you have.
		System.out.println( "Hens " + ( 25 + 30 / 6 ) );
		/**This line first multiplies 25 and 3, then does modulous of 75, which gives you 3. 
		Then it subtracts 3 from a hundred, which gives you 97. Finally it prints out the how many chickens you have.**/
		System.out.println( "Roosters " + ( 100 - 25 * 3 % 4 ) );
		//This line tells the user that the narrarator is now counting the eggs.
		System.out.println( "Now I will count the eggs:" );
		//This line does 4 modulous 2 first, which give you 0, and then does 1 divided by 4, which rounds to 0. Then the computer does 3+2+1-5+6, which gives you 7.
		System.out.println( 3 + 2 + 1 - 5 + 4 % 2 - 1.0 / 4.0 + 6 );
		//This asks if 3+2 is less than 5-7.
		System.out.println( "Is it true that 3 + 2 < 5 - 7?" );
		//This checks if 3+2 is less than 5-7, and then prints out false because it 3+2 isnt less than 5-7.
		System.out.println( 3 + 2 < 5 - 7 );
		//This adds 3 + 2 and then prints out what 3+2 is.
		System.out.println( "What is 3 + 2? " + ( 3 + 2 ) );
		//This subtracts 7 from 5 and then prints out the answer.
		System.out.println( "What is 5 - 7? " + ( 5 - 7 ) );
		//This prints the line in the print statement.
		System.out.println( "Oh, that's why it's false." );
		//This prints whatever is in the Print statement.
		System.out.println( "How about some more." );
		//Checks if the things in the parenthisis are true or false and then prints the answer.
		System.out.println( "Is it greater? " + ( 5 > -2 ) );
		System.out.println( "Is it greater or equal? " + ( 5 >= -2 ) );
		System.out.println( "Is it less or equal? " + ( 5 <= -2 ) );
		//The math seems wrong in these because they are all integer divisions. Java always rounds integer divisions.
	}
}