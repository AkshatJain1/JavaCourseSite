//This states the class
public class NumbersAndMath
{
	//this states the main method
	public static void main( String[] args )
	{
	//This line will state on the screen, I will count my chickens
		System.out.println( "I will now count my chickens:" );
//This line will state Hens 30.0
		System.out.println( "Hens " + ( 25.0 + 30.0 / 6.0 ) );
		//This line will state Roosters 97.0
		System.out.println( "Roosters " + ( 100.0 - 25.0 * 3.0 % 4.0 ) );
//This line will state Now I will count the eggs:
		System.out.println( "Now I will count the eggs:" );
//This will state 9.25
		System.out.println( 3.5 + 2.5 + 1.25 - 5.25 + 4.0 % 2.5 - 1.0 / 4.0 + 6.0 );
//This will state, Is it true that 3.5 + 2.5 < 5.25 - 7.25?
		System.out.println( "Is it true that 3.5 + 2.5 < 5.25 - 7.25?" );
//Because 3.5+2.5 =5.25 and 5.25-7.25=-2.5, -2.5 is less than 5.25, which shows that 3.5 + 2.5 < 5.25 - 7.25 is false
		System.out.println( 3.5 + 2.5 < 5.25 - 7.25 );
//This will state What is 3.5 + 2.5? 6.00
		System.out.println( "What is 3.5 + 2.5? " + ( 3.5 + 2.5 ) );
//This will state 5.25 - 7.25? -2.0
		System.out.println( "What is 5.25 - 7.25? " + ( 5.25 - 7.25 ) );
//This will state Oh, that's why it's false
		System.out.println( "Oh, that's why it's false." );
//This will state How about some more
		System.out.println( "How about some more." );
// This will state Is it greater? true because 3.5 is greater than -2.5
		System.out.println( "Is it greater? " + ( 3.5 > -2.5 ) );
//This will state Is it greater or equal? true because 3.5 >= -2.5 is correct	
		System.out.println( "Is it greater or equal? " + ( 3.5 >= -2.5 ) );
//This will state Is it less or equal? false, because 3.5 isn't less or equal to -2.5 		
		System.out.println( "Is it less or equal? " + ( 3.5 <= -2.5 ) );
	}
}
//2. The numbers are all whole numbers not fractions because none of the numbers have decimal points behind them.
//Because of this our numbers are being recognized throught the int variable not the double variable. We need to add decimal places behind each number.