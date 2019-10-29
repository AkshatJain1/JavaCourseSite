import java.util.Scanner;

public class PosorNeg {
    public static void main(String [] args) {

Scanner keyboard = new Scanner(System.in);
double num1;

System.out.print("Enter a number: ");
num1 = keyboard.nextDouble();

if(num1 >= 0){
	System.out.println(num1 + " is a positive number");}
else{
	System.out.println(num1 + " is a negative number");}
}
}