
public class NumbersAndMath
{
	public static void main( String[] args )
	{
		//This shows you are printing that you will count the chickens.
		System.out.println( "I will now count my chickens:" );
		//This does some operations and prints it as a value corresponding to the number of hens, 30.
		System.out.println( "Hens " + ( 25.0 + 30.0 / 6.0 ) );
		//This does some operations and prints it as a value corresponding to the number of roosters, 97.
		System.out.println( "Roosters " + ( 100.0 - 25.0 * 3.0 % 4.0 ) );
		//This shows you are printing that you will count the eggs.
		System.out.println( "Now I will count the eggs:" );
		//This does some operations and prints the number of eggs, 7 (6.75 after changing them to decimals).
		System.out.println( 3.0 + 2.0 + 1.0 - 5.0 + 4.0 % 2.0 - 1.0 / 4.0 + 6.0 );
		//This is printing the question: is 3 + 2 less than 5 - 7?
		System.out.println( "Is it true that 3 + 2 < 5 - 7?" );
		//This solves the above question and shows it is false as 5 is not less than -2 and then prints it as false.
		System.out.println( 3.0 + 2.0 < 5.0 - 7.0 );
		//This solves the first problem, gets the answer, and prints it, 5.
		System.out.println( "What is 3 + 2? " + ( 3.0 + 2.0 ) );
		//This solves the second problem, gets the answer, and prints it, -2.
		System.out.println( "What is 5 - 7? " + ( 5.0 - 7.0 ) );
		//This is a moment of realization being printed as you realize 5 is not less than -2.
		System.out.println( "Oh, that's why it's false." );
		//This print statement begins more questions.
		System.out.println( "How about some more." );
		//This reverses the 1st question and makes it a true statement as 5 is greater than -2, and prints it.
		System.out.println( "Is it greater? " + ( 5.0 > -2.0 ) );
		//This slightly changes the last question to include 5 as a correcct answer and since 5 is still greater than or equal to -2, it
		//continues to print it as a true statement.
		System.out.println( "Is it greater or equal? " + ( 5.0 >= -2.0 ) );
		//This changes the greater than or equal to sign to less than or equal to and as 5 is not less than or equal to -2, it is false.
		System.out.println( "Is it less or equal? " + ( 5.0 <= -2.0 ) );
	}
}

//1. See above.
//2. It treats them as integers and always rounds down.
//3. See above.