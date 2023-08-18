class A
{
	  void m1()
	{
		System.out.println("i m in class A");
	}
}
class B extends A
{
	void m1()
	{
		System.out.println("i m in class B");
	}
}
public class FinalTest {
	public static void main(String[] args)
	{
		A ob=new B();
		ob.m1();
	}

}
