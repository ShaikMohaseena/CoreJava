class A 
{ 
   void show1()
   {
	   System.out.println("i am in class A");
   }
}
class B extends A
{
	void show2()
	{
		System.out.println("i am in class B");
	}
}
class c extends A
{
	void show3()
	{
		System.out.println("i am in class C");
	}
}
public class InheritanceMain
{
    public static void main(String[] args)
    {
    	A ob1=new A();
    	ob1.show1();
    	
    	B ob2=new B();
    	ob2.show2();
    	ob2.show1();
    	
    	c ob3=new c();
    	ob3.show3();
    	//ob3.show2();
    	ob3.show1();
    }
}
