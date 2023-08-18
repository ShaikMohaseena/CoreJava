class Test 
{
	Test()
	{
		System.out.println("1");
	}
	Test(int a)
	{
		System.out.println("2");
	}
}
class MethodOverloading
{
       public static void main (String[] args)
       {
    	     new Test();
             Test t=new Test(10);
             
       }
       
}
