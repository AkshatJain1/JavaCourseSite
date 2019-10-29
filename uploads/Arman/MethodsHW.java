import java.util.Scanner;

public class MethodsHW {
public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	int a, b, x, y, e, f, h, divinum, divinum2, averagea, averageb, averagec, avg1, avg2, avg3, avg4;
	double c, d;
	boolean g, divinumSum;
	String aCount;
	double aver, finalAverage;
	powersOfTwo();
	alarm();
	a = sum100();
	System.out.println("The sum of the first one hundred numbers is "+a);
	System.out.println("Enter a number");
	x = keyboard.nextInt();
	System.out.println("Enter a larger number");
	y = keyboard.nextInt();
	b = sumRange(x,y);
	System.out.println("The sum of the numbers in the range you entered is "+b);
	System.out.println("Enter a number");
	e=keyboard.nextInt();
	System.out.println("Enter a second number");
	f=keyboard.nextInt();
	a = maxOfTwo(e,f);
	System.out.println("The largest number you chose was "+a);
	System.out.println("Enter a floating-point decimal number");
	c = keyboard.nextDouble();
	System.out.println("Enter a second floating-point decimal number");
	d = keyboard.nextDouble();
	g = larger(c, d);
	System.out.println("Enter a word");
	aCount = keyboard.next();
	h = countA(aCount);
	System.out.println("There are "+h+" uses of the letter a in the word or phrase you entered");	
	System.out.println("Enter a number");
	divinum = keyboard.nextInt();
	System.out.println("Enter a second number");
	divinum2 = keyboard.nextInt();	
	divinumSum = evenlyDivisible(divinum, divinum2);	
	System.out.println("divisibility: "+divinumSum);	
	System.out.println("Enter a number");
	averagea = keyboard.nextInt();
	System.out.println("Enter a number");
	averageb = keyboard.nextInt();
	System.out.println("Enter a number");
	averagec = keyboard.nextInt();	
	aver = average(averagea, averageb, averagec);
	System.out.println("The average of the 3 numbers you entered is "+aver);	
	System.out.println("Enter a number");
	avg1=keyboard.nextInt();	
	System.out.println("Enter a number");
	avg2 = keyboard.nextInt();
	System.out.println("Enter a number");
	avg3 = keyboard.nextInt();
	System.out.println("Enter a  final number");
	avg4 = keyboard.nextInt();	
	finalAverage = average(avg1, avg2, avg3, avg4);
	System.out.println("The average of the 4 numbers you entered is "+finalAverage);
	
}
public static void powersOfTwo() {
double i;
double power1;
for (i=1;i<=10;i++)
{
power1=Math.pow(2,i);
System.out.println(power1);
}
}
public static void alarm() {
Scanner keyboard = new Scanner(System.in);
int userInput;
int i;
System.out.println("Enter a number");
userInput = keyboard.nextInt();
for(i=1;i<=userInput;i++)
{
System.out.println("Alarm");
}
}
public static int sum100() {
int i;
int sumOf100 = 0;
for(i=1;i<=100;i++)
{
sumOf100=sumOf100+i;
}
return sumOf100;
}
public static int sumRange(int a, int b) {
int i;
int sumOfRange;
sumOfRange=0;
for (i=a;i<=b;i++)
{
sumOfRange=sumOfRange+i;
}
return sumOfRange;
}
public static int maxOfTwo (int a, int b) {
if (a>b)
{
return a;
}
else
{
return b;
}
}
public static boolean larger(double c, double d) {
if (c>d)
{
return true;
}
else
{
return false;
}
}
public static int countA(String a) {
int strLength=a.length();
int numA=0;
int i;
char ab;
for(i=0;i<strLength;i++)
{
ab = a.charAt(i);	
if (ab == 'A' || ab == 'a')
{
numA++;
}
}
return numA;
}
public static boolean evenlyDivisible(int x, int y) {
if (x%y==0 || y%x==0)
{
return true;
}
else
{
return false;
}
}
public static double average(int a, int b, int c) {
double avg;
avg = (a+b+c)/3.0;
return avg;
}
public static double average(int a, int b, int c, int d) {
double avg;
avg = (a+b+c+d)/4.0;
return avg;
}
    
    
}