public class ShortSop
{
	public static void main(String[] args)
	{
		int num1 = 67;
	//	num1 = manNum(num1);
		
		String t = "Hello";
		num1 = manipulate(t,num1);
	t =text(t);
		
		System.out.println(num1);
		System.out.println(t);
	}
	public static int manipulate(String t,int num)
	{
		t+=" World";
		num+=3;
		return num;
	}
	public static String text(String t)
	{
		t+=" World";
		return t;
	}
//	public static int manNum(int num)
//	{
//		num+=3;
//		return num;
//	}
}