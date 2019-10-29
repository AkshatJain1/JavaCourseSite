import java.util.Scanner;
public class Greatest {
public static void main(String[] args) {
	Scanner keyBoard=new Scanner(System.in);
	int a1;
	int a2;
	int a3;
	System.out.println("Please enter a number.");
	a1=keyBoard.nextInt();
	System.out.println("Please enter a number.");
	a2=keyBoard.nextInt();
	System.out.println("Please enter a number.");
	a3=keyBoard.nextInt();

	if (a1 > a2) {
		if (a1 > a3)
			System.out.println(a1 + " is the biggest number you entered.");
	}
	if (a2 > a1) {
		if (a2 > a3)
			System.out.println(a2 + " is the biggest number you entered.");
	}
	if (a3 > a1) {
		if (a3 > a2)
			System.out.println(a3 + " is the biggest number you entered.");
	}
}
}