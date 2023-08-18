class Vehicle
{
     void start()
     {
    	 System.out.println("1");
     }

	
}
public class AnonymousInnerClass {

	public static void main(String[] args) {
		
         Vehicle v=new Vehicle ()
         {
        	 public void start()
        	 {
        		 System.out.println("starts with key");
        	 }
        	         };
         v.start();
        // v.showName();
         
	}

}
