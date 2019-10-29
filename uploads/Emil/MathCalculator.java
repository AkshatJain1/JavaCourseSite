import java.util.Scanner;
public class MathCalculator
{
	public static void main(String[] args)
	{
		
		Scanner yo = new Scanner (System.in);
		
		int addition = 1;
		System.out.println("Welcome to math Calculator");
		System.out.println("What would you like to do?");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Division");
		System.out.println("4.Multiplication");
		System.out.println("5.Modulus");
		System.out.println("6.Exponents");
		System.out.println("7.Absolute value");
		System.out.println("8.Round up a decimal number");
		System.out.println("9.Round down a decimal number");
		System.out.println("10.Take max of two numbers");
		System.out.println("11.Take min of two numbers");
		System.out.println("12.Square Root");
		System.out.println("13.Random Number");
		System.out.println("Enter your selection number: ");
		int selection = yo.nextInt();
		
		if(selection == 1)
		{
			System.out.println("Enter a number: ");
			int a = yo.nextInt();
			System.out.println("Enter another number that you want to add to the previous number: ");
			int b = yo.nextInt();
			int sum = add(a,b);
			System.out.println("The sum of "+a+" and "+b+" is: "+sum);
		}
		
		else if(selection == 2)
		{
			System.out.println("Enter a number: ");
			int c = yo.nextInt();
			System.out.println("Enter another number that you want to subtract to the previous number: ");
			int d = yo.nextInt();
			int sub = sub(c,d);
			System.out.println("The difference of "+c+" and "+d+" is: "+sub);
		}
		
		else if(selection == 3)
		{
			System.out.println("Enter a number: ");
			int e = yo.nextInt();
			System.out.println("Enter another number that you want to divide the previous number by: ");
			int f = yo.nextInt();
			int div = div(e,f);
			System.out.println("The quotient of "+e+" and "+f+" is: "+div);
		}
		
			else if(selection == 4)
		{
			System.out.println("Enter a number: ");
			int g = yo.nextInt();
			System.out.println("Enter another number that you want to multiply the previous number by: ");
			int h = yo.nextInt();
			int mult = mult(g,h);
			System.out.println("The product of "+g+" and "+h+" is: "+mult);
		}
		
		else if(selection == 5)
		{
			System.out.println("Enter a number: ");
			int i = yo.nextInt();
			System.out.println("Enter another number that you want to multiply the previous number by: ");
			int j = yo.nextInt();
			int mod = mod(i,j);
			System.out.println("The product of "+i+" and "+j+" is: "+mod);
		}
		
		else if(selection == 6)
		{
			System.out.println("Enter a number: ");
			int k = yo.nextInt();
			System.out.println("Enter another number that you want to use as an expponent: ");
			int l = yo.nextInt();
			double ex = ex(k,l);
			System.out.println("The value is: "+ex);
		}
		
		else if(selection == 7)
		{
			System.out.println("Enter a number: ");
			int m = yo.nextInt();
			double abs = abs(m);
			System.out.println("The absolute value is: "+abs);
		}
		
		else if(selection == 8)
		{
			System.out.println("Enter a number: ");
			double n = yo.nextDouble();
			double up = up(n);
			System.out.println("The decimal value rounded up is : "+up);
		}
		
		else if(selection == 9)
		{
			System.out.println("Enter a number: ");
			double o = yo.nextDouble();
			double down = down(o);
			System.out.println("The decimal value rounded down is : "+down);
		}
		
		else if(selection == 10)
		{
			System.out.println("Enter a number: ");
			int p = yo.nextInt();
			System.out.println("Enter another number: ");
			int q = yo.nextInt();
			double max = max(p,q);
			System.out.println("The greatest number is: "+max);
		}
		
		else if(selection == 11)
		{
			System.out.println("Enter a number: ");
			int r = yo.nextInt();
			System.out.println("Enter another number: ");
			int s = yo.nextInt();
			double min = min(r,s);
			System.out.println("The smallest number is: "+min);
		}
		
			else if(selection == 12)
		{
			System.out.println("Enter a number: ");
			int t = yo.nextInt();
			double square = square(t);
			System.out.println("The square root is : "+square);
		}
		else if(selection == 13)
		{
			double u = rand();
			System.out.println(u);
		}
		
	
	}
	
	public static int add(int a, int b)
	{
		int sum = a+b;
		return sum;
	}
	

	public static int sub(int c , int d)
	{
		int sub = c-d;
		return sub;
	}
	
	public static int div(int e , int f)
	{
		int div = e/f;
		return div;
	}
	
	public static int mult(int g , int h)
	{
		int mult = g*h;
		return mult;
	}
	
	public static int mod(int i , int j)
	{
		int mod = i%j;
		return mod;
	}
	
	public static double ex(int k , int l)
	{
		double ex = Math.pow(k,l);
		return ex;
	}
	
	public static double abs(int m)
	{
		double abs = Math.abs(m);
		return abs;
	}
	
	public static double up(double n)
	{
		double integer = (int)n;
		return ++integer;
	}
	
	
	public static double down(double o)
	{
		return (int)o;
		
	}
	
	public static int max(int p , int q)
	{
		int pro = 0;
		int pie = 0;
		if(p>q)
		{
			pro = p;
			pie = q;
		}
		else 
		return pro;
		return pie;
	}
	
	
	public static int min(int r , int s)
	{
		int ext = 3;
		int ajt = 4;
		if(r<s)
			{
			ext = r;
			ajt = s;}
		else 
		return ext;
		return ajt;
	}					
	
	public static double square(int t)
	{
		double square = Math.sqrt(t);
		return square;
		
	}
	
	public static double rand()
	{
		double u = Math.random();
		return u;
	}
	
}