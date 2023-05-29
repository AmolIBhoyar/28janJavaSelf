package method;

public class Sample10 
{
	public static void main(String[] args)
	{
		studentname("Priyanka");
		System.out.println("----------");
		studentfullname("Amol","Bhoyar");
		System.out.println("----------");
		Sample11.studentinfo("Name amol",101,80.9f,'A');
		
	
		
	}
	
	


//method with String parameter
 public static void studentname(String s1)
{
	System.out.println(s1);
} 
 //
 public static void studentfullname(String fname,String lname)
 {
	 System.out.println(fname+" "+lname);
}
}
