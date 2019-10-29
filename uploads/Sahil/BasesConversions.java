package com.company;
import java.util.Scanner;
public class BasesConversions {
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        int choice;
        int a=0;
        int userNum;
        System.out.print("Would you like to convert from: ");
        System.out.print("1. Decimal to Binary, 2. Binary to Decimal, 3. Decimal to Hexadecimal, or 4. Hexadecimal to Decimal?");
        key.nextLine();
        while (a==0) {
            System.out.print("Answer as 1, 2, 3, or 4: ");
            choice = key.nextInt();
            key.nextLine();
            if(choice==1) {
                System.out.print("What is your number? ");
                userNum=key.nextInt();
                key.nextLine();
                int baseToConvertTo = 10;
                System.out.println("Answer: " + Long.toString(userNum, baseToConvertTo));
                a++;
                continue;
            }
            else if(choice==2) {
                System.out.print("What is your number? ");
                userNum=key.nextInt();
                key.nextLine();
                int baseToConvertTo = 2;
                System.out.println("Answer: " + Long.toString(userNum, baseToConvertTo));
                a++;
                continue;
            }
            else if(choice==3) {
                System.out.print("What is your number? ");
                userNum=key.nextInt();
                key.nextLine();
                int baseToConvertTo = 16;
                System.out.println("Answer: " + Long.toString(userNum, baseToConvertTo));
                a++;
                continue;
            }
            else if(choice==4) {
                System.out.print("What is your number? ");
                String nums=key.nextLine();
                System.out.println("Answer: "+Integer.parseInt(nums,16));
                a++;
                continue;
            }
            else {
                continue;
            }
        }
    }
}
