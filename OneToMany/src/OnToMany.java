class Student
{
	String id;
	String name;
	
	Courses [] Courses;
	Student(String id1,String name1,Courses [] Courses1)
	{
		id=id1;
		name=name1;
		Courses=Courses1;
	}
	void getStudentDetails()
	{
		System.out.println("Student ID :" +id);
		System.out.println("Student Name :" +name);
		System.out.println("Student Courses Details");
		for(int i=0;i<Courses.length;i++)
		{
			System.out.println("course"+(i+1)+":"+"course ID: "	+Courses [i]. Courseid+" & Course Name:" +Courses[i].Coursename);
					
		}
		System.out.println("--------------------------------------");
	}

}
class Courses
{
	 String Courseid;
	 String Coursename;
	 Courses(String Courseid1, String Coursename1)
	 {
		 Courseid=Courseid1;
		 Coursename=Coursename1;
		 
		 
	 }

	 
}
public class OnToMany
{
     public static void main(String[] args)
     {
    	 Courses c1=new Courses("j1","java");
    	 Courses c2=new Courses("c1","c");
    	 Courses c3=new Courses("py1","python");
    	 Courses [] Courses1= {c1,c2,c3};
    	 
    	 Student s1= new Student("101","deepak",Courses1);
    	 s1.getStudentDetails();
    	 
    	 Courses c4=new Courses("ph1","PHP");
    	 Courses c5=new Courses("h1","HTML");
    	 Courses [] Courses2= {c4,c5};
    	 Student s2= new Student("102","deepesh",Courses2);
    	 s2.getStudentDetails();


    	 

    	 


    	 
    	 
    	 
    	 
    	 
    	 
     }
}
