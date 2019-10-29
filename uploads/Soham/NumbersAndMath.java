/**
 * @(#)NumbersAndMath.java
 *
 *
 * @author 
 * @version 1.00 2018/6/30
 */


public class NumbersAndMath
{
	public static void main( String[] args )
	{
		System.out.println( "I will now count my chickens:" );// displays text to the user

		System.out.println( "Hens " + ( 25.0 + 30.0 / 6.0 ) );// finds out the number of hens
		System.out.println( "Roosters " + ( 100.0 - 25.0 * 3.0 % 4.0 ) );// finds out the number of roosters

		System.out.println( "Now I will count the eggs:" );// displays "Now I will count the eggs:" to the user 

		System.out.println( 3.0 + 2.0 + 1.0 - 5.0 + 4.0 % 2.0 - 1.0 / 4.0 + 6.0 );// calculates the number of eggs

		System.out.println( "Is it true that 3 + 2 < 5 - 7?" ); // compares chickens and eggs

		System.out.println( 3 + 2 < 5 - 7 );// Show it is false

		System.out.println( "What is 3 + 2? " + ( 3 + 2 ) ); // adds 3+2
		System.out.println( "What is 5 - 7? " + ( 5 - 7 ) );// subtracts 5-7

		System.out.println( "Oh, that's why it's false." );// displays "Oh, that's why it's false."

		System.out.println( "How about some more." ); // displays "How about some more."

		System.out.println( "Is it greater? " + ( 5 > -2 ) ); // boolean
		System.out.println( "Is it greater or equal? " + ( 5 >= -2 ) );// boolean
		System.out.println( "Is it less or equal? " + ( 5 <= -2 ) );// boolean
	}
}