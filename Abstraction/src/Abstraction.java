abstract class Vehicle
{
	abstract void start();
}
class Car extends Vehicle
{
	void start()
	{
		System.out.println("start with key");
	}
}
class Scooter extends Vehicle
{
	
	void start()
	{
		System.out.println("start with kick");
	}
}
public class Abstraction
{
	public static void main(String[] args)
	{
		
	
     Car ob1=new Car();
     ob1.start();
	 System.out.println("------------------");
	 
	 Scooter ob2=new Scooter();
	 ob2.start();
	}
     
}
