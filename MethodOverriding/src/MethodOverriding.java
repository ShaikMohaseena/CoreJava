

class A
{
	public static void main(String[] args)
  	{
		System.out.println("1");
    }
	
}
class B extends A
{

	public static void main(String[] args)

	{
		System.out.println("2");

	}
	
}
public class MethodOverriding
{
    public static void main(String[] args)
    {
   	     
   	     
   	     A ob3=new B();
   	     String [] str= {"a","b","c"};
   	     ob3.main(str);

   	     


    	 
    }
}
