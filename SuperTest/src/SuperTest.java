class A
{
	 A()
	 {
		 System.out.println("i am A class constructor");
	 }
}
class B extends A
{
	B()
	{
		System.out.println("i am B class constructor ");
	}
}
public class SuperTest {
	public static void main(String[] args) {
		B ob=new B();
		
	}

}
