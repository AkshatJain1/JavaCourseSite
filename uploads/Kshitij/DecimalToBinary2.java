import java.util.Scanner;
public class DecimalToBinary2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a number you want converted to binary: ");
		int no = keyboard.nextInt();
		convertToBinary(no);
	}
	
	public static void convertToBinary(int no){
		String no2 = "";
    	while (no >= 1) {
    	    int no1 = no % 2;
    		no = no / 2;
    		no2 += (no1 + "");
    		int str = no2.length();
        	String reverse = new StringBuffer(no2).reverse().toString();
    		if (no < 1) {
    			System.out.print("The binary number is: " + reverse + "!");
    		}
    	}
    	
    	
	}
}