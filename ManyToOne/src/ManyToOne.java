class Student 
{
	String rollno;
	String name;
	
	Branch branch;
	Student(String rollno1, String name1,Branch branch1)
	{
		rollno=rollno1;
		name=name1;
		branch=branch1;
		
	}
	void getStudentDetails()
	{
		System.out.println("Student Rollno:" +rollno);
		System.out.println("Student name:" +name);
		System.out.println("Student Branch Code:" +branch.branchcode);
		System.out.println("Student Branch name:" +branch.branchname);
		System.out.println("--------------------------------");
	}
}
class Branch
{
	String branchcode;
	String branchname;
	Branch(String branchcode1,String branchname1)
	{
		branchcode=branchcode1;
		branchname=branchname1;
	}
}
public class ManyToOne
{
	public static void main(String[] args)
	{
		
          Branch b1=new Branch("cse01","CSE");
          Student s1=new Student("101","pandu",b1);
          Student s2=new Student("102","gundu",b1);

          Student s3=new Student("103","moose",b1);
          s1.getStudentDetails();
          s2.getStudentDetails();
          s3.getStudentDetails();
    }


   
}
