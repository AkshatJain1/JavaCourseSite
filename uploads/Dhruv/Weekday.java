import java.util.Scanner;

public class Weekday {
    public static void main(String [] args) {

Scanner keyboard = new Scanner(System.in);
int num1;

System.out.print("Enter a whole number from 1 to 5: ");
num1 = keyboard.nextInt();

if(num1 == 1){
	System.out.println("The " + num1 + " weekday is a Monday.");}
	else if(num1 == 2){
	System.out.println("The " + num1 + " weekday is a Tuesday.");}
	else if(num1 == 3){
	System.out.println("The " + num1 + " weekday is a Wednesday.");}	
	else if(num1 == 4){
	System.out.println("The " + num1 + " weekday is a Thursday.");}
	else if(num1 == 5){
	System.out.println("The " + num1 + " weekday is a Friday.");}
	else{
	System.out.println("The " + num1 + " weekday is unknown.");}
	
    }
}