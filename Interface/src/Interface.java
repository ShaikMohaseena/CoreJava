interface Vehicle
{
	 void start();
	 void noOfGears(int a);
	 
}
abstract class Bus implements Vehicle
{
	public void start()
	{
		System.out.println("bus start with key");
	}
}
class Car implements Vehicle
{
	public void start()
	{
		System.out.println("car start with key");
	}
	public void noOfGears (int gears)
	{
		System.out.println("car has"  +gears+   "gears");
	}

	
}
class Scooter implements Vehicle
{
	public void start()
	{
		System.out.println("Scooter start with key");
	}
	public void noOfGears (int gears)
	{
		System.out.println("Scooter has" +gears+ "gears");

	}
}
public class Interface 

{
	    public static void main(String[] args)
  
	    {
	    	//Vehicle v=new Vehicle();
	    	Car b=new Car();
	        b.start();
	    	b.noOfGears(6);
	    }

}
