package sunday2204;

public class sample2 
{
//method
	public static void m1()
	{
		System.out.println("static method1 sc");
	}
	public void m3()
	{
		System.out.println("non static methodm2 sc");
	}
	public static void main(String[] args)
	{
		m1();
		sample3.m2();
		sample2 s2=new sample2();
		s2.m3();
		sample3 s3=new sample3();
		s3.m4();
		
		
	}
}
