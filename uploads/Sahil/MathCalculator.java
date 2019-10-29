import java.util.Scanner;
public class MathCalculator {
	public static void main(String[] args) {
		Scanner keyBoard=new Scanner(System.in);
		String userKnowledge="";
		int userChoice = 5;
		double userNum1 = 0, userNum2 = 0;
		String equal;

		String text = "Hello and welcome to Math Calculator, where we cater to your calculating desires.";
		char[] charArr = text.toCharArray();
	    for(int i=0; i<=charArr.length-1;i++)
		{
		    System.out.print(charArr[i]);
	        try
	        {
	            Thread.sleep(110);
		        } catch (Exception e)
		        {
		            e.printStackTrace();
		        }
		}
		keyBoard.nextLine();
		while (userChoice<=14 && userChoice > 0) {
			text = "\nChoose from the menu of options to perform a calculation.";
		charArr = text.toCharArray();
	    for(int i=0; i<=charArr.length-1;i++)
		{
		    System.out.print(charArr[i]);
	        try
	        {
	            Thread.sleep(110);
		        } catch (Exception e)
		        {
		            e.printStackTrace();
		        }
		}
		keyBoard.nextLine();
		text = "\n~~Caluclation Menu~~" + "\n1. Addition" + "\n2. Subtraction" + "\n3. Multiplication" + "\n4. Division" + "\n5. Modulus" + "\n6. Exponents";
		charArr = text.toCharArray();
	    for(int i=0; i<=charArr.length-1;i++)
		{
		    System.out.print(charArr[i]);
	        try
	        {
	            Thread.sleep(95);
		        } catch (Exception e)
		        {
		            e.printStackTrace();
		        }
		}
		text = "\n7. Absolute value" + "\n8. Round up a decimal number" + "\n9. Round down a decimal number" + "\n10. Find the greater of two numbers" + "\n11. Find the lesser of two numbers";
		charArr = text.toCharArray();
	    for(int i=0; i<=charArr.length-1;i++)
		{
		    System.out.print(charArr[i]);
	        try
	        {
	            Thread.sleep(95);
		        } catch (Exception e)
		        {
		            e.printStackTrace();
		        }
		}
		text = "\n12. Square root" + "\n13. Random number with a range" + "\n14. Exit";
		charArr = text.toCharArray();
	    for(int i=0; i<=charArr.length-1;i++)
		{
		    System.out.print(charArr[i]);
	        try
	        {
	            Thread.sleep(95);
		        } catch (Exception e)
		        {
		            e.printStackTrace();
		        }
		}
		text = "\nEnter in the number of the operation you would like to do: ";
		charArr = text.toCharArray();
	    for(int i=0; i<=charArr.length-1;i++)
		{
		    System.out.print(charArr[i]);
	        try
	        {
	            Thread.sleep(110);
		        } catch (Exception e)
		        {
		            e.printStackTrace();
		        }
		}
			userChoice=keyBoard.nextInt();
			keyBoard.nextLine();
	 		if (userChoice >= 14 || userChoice <= 0) {
	 			text = "You either chose to exit or pressed a different key than what was in the parameters. Have a nice day!";
				charArr = text.toCharArray();

	    		for(int i=0; i<=charArr.length-1;i++)
				{
			    System.out.print(charArr[i]);
		        try
		        {
		            Thread.sleep(110);
			        } catch (Exception e)
			        {
			            e.printStackTrace();
			        }
				}
				return;
	 		}else{
				while (userChoice < 14.0 || userChoice > 0.0){
					Scanner keyBoard1=new Scanner(System.in);
					switch (userChoice) {
						case 1: userChoice = 1;
							text = "You chose addition. \nWould you like me to explain what that is? Answer as yes or no: ";
							charArr = text.toCharArray();
				    		for(int i=0; i<=charArr.length-1;i++)
							{
						    System.out.print(charArr[i]);
					        try
					        {
					            Thread.sleep(110);
						        } catch (Exception e)
						        {
						            e.printStackTrace();
						        }
							}
							userKnowledge=keyBoard.nextLine();
							if (userKnowledge.equals("yes")){
								text = "\nAddition is when you take some numbers and combine their values to get one value, or their sum.";
								charArr = text.toCharArray();

					    		for(int i=0; i<=charArr.length-1;i++)
								{
							    System.out.print(charArr[i]);
						        try
						        {
						            Thread.sleep(115);
							        } catch (Exception e)
							        {
							            e.printStackTrace();
							        }
								}
								equal = keyBoard.nextLine();
							}else if (userKnowledge.equals("no")){
							}
							text = "Okay then... what is your first number? ";
							charArr = text.toCharArray();
					    	for(int i=0; i<=charArr.length-1;i++)
							{
						    	System.out.print(charArr[i]);
					   	    	try
						        	{
						            	Thread.sleep(110);
							        } catch (Exception e)
							        {
							            e.printStackTrace();
							        }
							}
							userNum1=keyBoard.nextDouble();
							text = "What is your second number? ";
							charArr = text.toCharArray();
					    	for(int i=0; i<=charArr.length-1;i++)
							{
						    	System.out.print(charArr[i]);
					   	    	try
						        	{
						            	Thread.sleep(110);
							        } catch (Exception e)
							        {
							            e.printStackTrace();
							        }
							}
							userNum2=keyBoard.nextDouble();
							text = "The sum is ";
							charArr = text.toCharArray();
					    	for(int i=0; i<=charArr.length-1;i++)
							{
						    	System.out.print(charArr[i]);
					   	    	try
						        	{
						            	Thread.sleep(110);
							        } catch (Exception e)
							        {
							            e.printStackTrace();
							        }
							}
							System.out.print(add(userNum1, userNum2));
							text = ".";
							charArr = text.toCharArray();
					    	for(int i=0; i<=charArr.length-1;i++)
							{
						    	System.out.print(charArr[i]);
					   	    	try
						        	{
						            	Thread.sleep(110);
							        } catch (Exception e)
							        {
							            e.printStackTrace();
							        }
							}
							break;
						case 2: userChoice = 2;
							text = "You chose subtraction.";
							charArr = text.toCharArray();
					    	for(int i=0; i<=charArr.length-1;i++)
							{
						    	System.out.print(charArr[i]);
					   	    	try
						        	{
						            	Thread.sleep(110);
							        } catch (Exception e)
							        {
							            e.printStackTrace();
							        }
							}
							keyBoard1.nextLine();
							text = "Would you like me to explain what that is? Answer as yes or no: ";
							charArr = text.toCharArray();
					    	for(int i=0; i<=charArr.length-1;i++)
							{
						    	System.out.print(charArr[i]);
					   	    	try
						        	{
						            	Thread.sleep(110);
							        } catch (Exception e)
							        {
							            e.printStackTrace();
							        }
							}
							userKnowledge=keyBoard.nextLine();
							if (userKnowledge.equals("yes")) {
								text = "Subtraction is where you take the value of a number away from the other number. The absolute value of the answer is how far apart they are, or the difference.";
								charArr = text.toCharArray();
						    	for(int i=0; i<=charArr.length-1;i++)
								{
							    	System.out.print(charArr[i]);
						   	    	try
							        	{
							            	Thread.sleep(110);
								        } catch (Exception e)
								        {
								            e.printStackTrace();
								        }
								}
							keyBoard.nextLine();
							}else{
								text = "Okay then.";
								charArr = text.toCharArray();
						    	for(int i=0; i<=charArr.length-1;i++)
								{
							    	System.out.print(charArr[i]);
						   	    	try
							        	{
							            	Thread.sleep(110);
								        } catch (Exception e)
								        {
								            e.printStackTrace();
								        }
								}
							}
							keyBoard.nextLine();
							text = "What is your first number? ";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
								}
							userNum1=keyBoard.nextDouble();
							text = "What is your second number? ";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
								}
							userNum2=keyBoard.nextDouble();
							text = "The difference is ";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							keyBoard.nextLine();
							System.out.print(sub(userNum1, userNum2));
							text = ".";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							keyBoard.nextLine();
							break;
						case 3: userChoice = 3;
						text = "You chose multiplication. ";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							keyBoard1.nextLine();
							text = "Would you like me to explain what that is? Answer as yes or no: ";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							userKnowledge=keyBoard1.nextLine();
							if (userKnowledge.equals("yes")) {
								text = "Multiplication is to obtain from (a number) another that contains the first number a specified number of times.";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
								System.out.print("");
								keyBoard.nextLine();
							}else{
									text = "Okay then.";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
								keyBoard.nextLine();
							}
									text = "What is your first number? ";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							userNum1=keyBoard.nextDouble();
									text = "What is your second number? ";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							userNum2=keyBoard.nextDouble();
							text = "The product is ";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							System.out.print(multi(userNum1, userNum2));
							text = ".";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							break;
						case 4: userChoice = 4;
						text = "You chose division.";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							keyBoard1.nextLine();
							text = "Would you like me to explain what that is? Answer as yes or no: ";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							userKnowledge=keyBoard1.nextLine();
							if (userKnowledge.equals("yes")) {
								text = "Division is the process of dividing a matrix, vector, or other quantity by another under specific rules to obtain a quotient.";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
								keyBoard.nextLine();
							}else{
								text = "Okay then.";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
								keyBoard.nextLine();
							}
							text = "What is your first number? ";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							userNum1=keyBoard.nextDouble();
							text = "What is your second number? ";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							userNum2=keyBoard.nextDouble();
							text = "The quotient is ";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							System.out.print(divi(userNum1, userNum2));
							text = ".";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							break;
						case 5: userChoice = 5;
							text = "You chose modulus.";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							keyBoard1.nextLine();
							text = "Would you like me to explain what that is? Answer as yes or no: ";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							userKnowledge=keyBoard1.nextLine();
							if (userKnowledge.equals("yes")) {
								text = "This finds the remainder, or leftovers of a division process.";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
								keyBoard.nextLine();
							}else{
								text = "Okay then.";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
								keyBoard.nextLine();
							}
							text = "What is your first number? ";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							userNum1=keyBoard.nextDouble();
							text = "What is your second number? ";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							userNum2=keyBoard.nextDouble();
							text = "The remainder is ";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							System.out.print(modu(userNum1, userNum2));
							text = ".";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							break;
						case 6: userChoice = 6;
							text = "You chose exponents.";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							keyBoard1.nextLine();
							text = "Would you like me to explain what that is? Answer as yes or no: ";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							userKnowledge=keyBoard1.nextLine();
							if (userKnowledge.equals("yes")) {
								text = "This finds a quantity representing the power to which a given number or expression is to be raised, usually expressed as a raised symbol beside the number or expression.";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
								keyBoard.nextLine();
							}else{
								text = "Okay then.";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
								keyBoard.nextLine();
							}
							text = "What is your base? ";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							userNum1=keyBoard.nextDouble();
							text = "What is the exponent? ";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							userNum2=keyBoard.nextDouble();
							text = "The answer is ";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							System.out.print(expo(userNum1, userNum2));
							text = ".";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							break;
						case 7: userChoice = 7;
							text = "You chose absoulute value.";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							keyBoard1.nextLine();
							text = "Would you like me to explain what that is? Answer as yes or no: ";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							userKnowledge=keyBoard1.nextLine();
							if (userKnowledge.equals("yes")) {
								text = "This is the magnitude of a real number without regard to its sign.";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
								keyBoard.nextLine();
							}else{
								text = "Okay then.";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
								keyBoard.nextLine();
							}
							text = "What is your number? ";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							userNum1=keyBoard.nextDouble();
							text = "The answer is ";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							System.out.print(abso(userNum1));
							text = ".";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							break;
						case 8: userChoice = 8;
							text = "You chose round up a number.";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							keyBoard1.nextLine();
							text = "Would you like me to explain what that is? Answer as yes or no: ";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							userKnowledge=keyBoard1.nextLine();
							if (userKnowledge.equals("yes")) {
								text = "This will raise the number given to the next whole number.";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
								keyBoard.nextLine();
							}else{
								text = "Okay then.";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
								keyBoard.nextLine();
							}
							text = "What is your number? ";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							userNum1=keyBoard.nextDouble();
							text = "The answer is ";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							System.out.print(roup(userNum1));
							text = ".";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							break;
						case 9: userChoice = 9;
							text = "You chose round down a number.";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							keyBoard1.nextLine();
							text = "Would you like me to explain what that is? Answer as yes or no: ";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							userKnowledge=keyBoard1.nextLine();
							if (userKnowledge.equals("yes")) {
								text = "This will raise the number given to the previous whole number.";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
								keyBoard.nextLine();
							}else{
								text = "Okay then.";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
								keyBoard.nextLine();
							}
							text = "What is your number? ";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							userNum1=keyBoard.nextDouble();
							text = "The answer is ";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							System.out.print(rodo(userNum1));
							text = ".";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							break;
						case 10: userChoice = 10;
							text = "You chose find the greater number.";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							keyBoard1.nextLine();
							text = "Would you like me to explain what that is? Answer as yes or no: ";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							userKnowledge=keyBoard1.nextLine();
							if (userKnowledge.equals("yes")) {
								text = "This will return the larger of the two numbers you entered.";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
								keyBoard.nextLine();
							}else{
								text = "Okay then.";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
								keyBoard.nextLine();
							}
							text = "What is your first number? ";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							userNum1=keyBoard.nextDouble();
							text = "What is your second number? ";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							userNum2=keyBoard.nextDouble();
							text = "The answer is ";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							System.out.print(great(userNum1, userNum2));
							text = ".";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							break;
						case 11: userChoice = 11;
							text = "You chose find the lesser number.";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							keyBoard1.nextLine();
							text = "Would you like me to explain what that is? Answer as yes or no: ";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							userKnowledge=keyBoard1.nextLine();
							if (userKnowledge.equals("yes")) {
								text = "This will return the smaller of the two numbers you entered.";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
								keyBoard.nextLine();
							}else{
								text = "Okay then.";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
								keyBoard.nextLine();
							}
							text = "What is your first number? ";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							userNum1=keyBoard.nextDouble();
							text = "What is your second number? ";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							userNum2=keyBoard.nextDouble();
							text = "The answer is ";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							System.out.print(less(userNum1, userNum2));
							text = ".";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							break;
						case 12: userChoice = 12;
							text = "You chose square root.";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							keyBoard1.nextLine();
							text = "Would you like me to explain what that is? Answer as yes or no: ";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							userKnowledge=keyBoard1.nextLine();
							if (userKnowledge.equals("yes")) {
								text = "This will find the number that produces a specified quantity when multiplied by itself.";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
								keyBoard.nextLine();
							}else{
								text = "Okay then.";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
								keyBoard.nextLine();
							}
							text = "What is your number? ";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							userNum1=keyBoard.nextDouble();
							text = "The answer is ";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							System.out.print(sqrt(userNum1));
							text = ".";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							break;
						case 13: userChoice = 13;
							text = "You chose random number with a range.";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							keyBoard1.nextLine();
							text = "Would you like me to explain what that is? Answer as yes or no: ";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							userKnowledge=keyBoard1.nextLine();
							if (userKnowledge.equals("yes")) {
								text = "This will find a random number inside of your dpecified range.";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
								keyBoard.nextLine();
							}else{
								text = "Okay then.";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
								keyBoard.nextLine();
							}
							text = "What is the minimum of your range? ";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							userNum1=keyBoard.nextInt();
							keyBoard.nextLine();
							text = "What is the maximum of your range? ";
							charArr = text.toCharArray();
					    	for(int i=0; i<=charArr.length-1;i++)
							{
						    	System.out.print(charArr[i]);
					   	    	try
						        	{
						            	Thread.sleep(110);
							        } catch (Exception e)
							        {
							            e.printStackTrace();
							        }
							}
							userNum2=keyBoard.nextInt();
							keyBoard.nextLine();
							text = "The answer is ";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							System.out.print(rando(userNum1, userNum2));
							text = ".";
							charArr = text.toCharArray();
						    for(int i=0; i<=charArr.length-1;i++)
							{
							    System.out.print(charArr[i]);
						   	    try
							    {
							    	Thread.sleep(110);
								} catch (Exception e)
									{
								    	e.printStackTrace();
								    }
							}
							break;
						default:
							System.out.print("You either chose to exit or pressed a different key than what was in the parameters. Have a nice day!");
							break;
					}
				break;
				}
			}
		}

	}
	public static double add(double userNum1, double userNum2) {
		double sum;
		sum = userNum1 + userNum2;
		return sum;
	}
	public static double sub(double userNum1, double userNum2) {
		double diff;
		diff = userNum1 - userNum2;
		return diff;
	}
	public static double multi(double userNum1, double userNum2) {
		double prod;
		prod = userNum1 * userNum2;
		return prod;
	}
	public static double divi(double userNum1, double userNum2) {
		double quot;
		quot = userNum1 / userNum2;
		return quot;
	}
	public static double modu(double userNum1, double userNum2) {
		double remain;
		remain = userNum1 % userNum2;
		return remain;
	}
	public static double expo(double userNum1, double userNum2) {
		double ex;
		ex = Math.pow(userNum1, userNum2);
		return ex;
	}
	public static double abso(double userNum1) {
		double abs;
		abs = Math.abs(userNum1);
		return abs;
	}
	public static double roup(double userNum1) {
		double up;
		up = Math.ceil(userNum1);
		return up;
	}
	public static double rodo(double userNum1) {
		double down;
		down = Math.floor(userNum1);
		return down;
	}
	public static double great(double userNum1, double userNum2) {
		double bigger;
		if (userNum1>userNum2)
			bigger=userNum1;
		else
			bigger=userNum2;
		return bigger;
	}
	public static double less(double userNum1, double userNum2) {
		double smaller;
		if (userNum1<userNum2)
			smaller=userNum1;
		else
			smaller=userNum2;
		return smaller;
	}
	public static double sqrt(double userNum1) {
		double root;
		root = Math.sqrt(userNum1);
		return root;
	}
	public static int rando(double userNum1, double userNum2) {
		int min= (int) userNum1;
		int max= (int) userNum2;
		int rand= (int) (Math.random() * (max - min + 1) + min);
		return rand;
	}
}
