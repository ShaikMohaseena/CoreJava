class  Outer
{
	  void show()
	  {
              class  Inner 
              {
                             public int a  =10;
			                 void show2()
			                 {
				                       System.out.println(a);
			                 }
               
              }
	  
          
	   
                Inner i=new Inner();
                i.show2();
	  
	   }
		
              
	  
	  
}	  

public class MethodLocalInnerClass {
	 public static void main(String[] args)
	 {
		 Outer ob=new Outer();
		 ob.show();
		 

	 }

}
