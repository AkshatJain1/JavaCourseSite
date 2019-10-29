public class Monster extends Truck
{
	public void m1()
	{
		System.out.println("monster 1");
	}
	public void m2()
	{
		//prints truck1 and car1
		super.m1();
		super.m2();
	}
	public String toString()
	{
		//monster vroomvroom
		return "monster " + super.toString();
	}
}