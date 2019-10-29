/**
 * @(#)weekdays.java
 *
 *
 * @author 
 * @version 1.00 2018/7/5



public class weekdays {

    public weekdays() {
    }
    
    
} */

import java.util.Scanner;
public class weekdays{
public static void main (String[] args){


int number;
Scanner keyboard= new Scanner (System.in);

System.out.println("Enter a  number between 1 & 7 :");
number= keyboard.nextInt();

if(number == 1){

System.out.println("The 1st day of the week is Sunday.");

}

if(number == 2){
System.out.println("The 2nd day of the week is Monday.");

}

if(number == 3){

System.out.println("The 3rd day of the week is Tuesday.");
}

if(number == 4){

System.out.println("The 4th day of the week is Wednesday.");
}


if(number == 5){
System.out.println("The 5th day of the week is Thursday.");

}


if(number == 6){
System.out.println("The 6th day of the week is Friday.");

}



if(number == 7){
System.out.println("The 7th day of the week is Saturday.");
}






}
}