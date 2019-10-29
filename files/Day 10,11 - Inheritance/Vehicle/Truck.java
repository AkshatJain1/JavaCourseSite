public class Truck extends Car {
	public void m1() {
		System.out.println("truck 1");
	}
	 
	public void m2() {
		//prints car 1
		super.m1();
	}
	 
	public String toString() {
		//vroom vroom
		return super.toString() + super.toString();
	}
}