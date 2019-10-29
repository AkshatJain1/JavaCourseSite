import java.util.Scanner;

public class greatest {
    public static void main(String [] args) {

Scanner keyboard = new Scanner(System.in);
double x, y, z;
System.out.println("Enter the first number: ");
x = keyboard.nextdouble();
System.out.println("Enter the second number: ");
y = keyboard.nextdouble();
System.out.println("Enter the third number: ");
z = keyboard.nextdouble();


If (x > y) {
	if (x > z){
	system.out.println(x + " is the greatest number");}
	else {
	system.out.println(z + " is the greatest number");
	}
}
else {
if (y > z){
	system.out.println(y + " is the greatest number");}
	else {
	system.out.println(z + " is the greatest number");
	}
}
    }
}