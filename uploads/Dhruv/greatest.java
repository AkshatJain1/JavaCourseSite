
import java.util.Scanner;

public class greatest {
    public static void main(String [] args) {

Scanner keyboard = new Scanner(System.in);
double num1, num2, num3;

System.out.print("Enter the first number: ");
num1 = keyboard.nextDouble();
System.out.print("Enter the second number: ");
num2 = keyboard.nextDouble();
System.out.print("Enter the third number: ");
num3 = keyboard.nextDouble();

if(num1 > num2){
	if (num1 > num3){
		System.out.println(num1 + " is greatest");}
	else {
		System.out.println(num3 + " is greatest");}
	}
else{
	
	if (num2 > num3){
		System.out.println(num2 + " is greatest");}
	else{
		System.out.println(num3 + " is greatest");}
	}
    }
}
