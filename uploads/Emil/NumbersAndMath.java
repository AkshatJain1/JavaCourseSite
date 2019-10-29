public class NumbersAndMath
{//skeleton code
	public static void main( String[] args )
	{//counting chickens(statement)
		System.out.println( "I will now count my chickens:" );
//math for number of chickens
		System.out.println( "Hens " + ( 25 + 30 / 6 ) );
	//math for number of roosters	
		System.out.println( "Roosters " + ( 100 - 25 * 3 % 4 ) );
//statement for number of eggs
		System.out.println( "Now I will count the eggs:" );
//math for number of eggs
		System.out.println( 3 + 2 + 1 - 5 + 4 % 2 - 1 / 4 + 6 );
//true or false boolean
		System.out.println( "Is it true that 3 + 2 < 5 - 7?" );
//math for previous statement(boolean)
		System.out.println( 3 + 2 < 5 - 7 );
//question asking for an integer
		System.out.println( "What is 3 + 2? " + ( 3 + 2 ) );
//question asking for an integer
		System.out.println( "What is 5 - 7? " + ( 5 - 7 ) );
//statement about a previously asked question
		System.out.println( "Oh, that's why it's false." );
//rhetorical question
		System.out.println( "How about some more." );
//boolean type question
		System.out.println( "Is it greater? " + ( 5 > -2 ) );
//boolean type question	
		System.out.println( "Is it greater or equal? " + ( 5 >= -2 ) );
//boolean type question	
		System.out.println( "Is it less or equal? " + ( 5 <= -2 ) );
	}
}