package sunday2204;

public class sample1
{
 
	 int a=30;  //global variable
	public void m1()
	{
		int b=10;    //local variable
		System.out.println(b);
	}

	
	public static void main(String[] args)
	{
		sample1 s1=new sample1();
		System.out.println(s1.a);
		s1.m1();
		
	}
}
