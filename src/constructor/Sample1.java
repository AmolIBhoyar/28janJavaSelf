package constructor;

public class Sample1 
{
	
	//default constructor
	public static void main(String[] args)
	{
		Sample1 s1=new Sample1();  //default constructor call from same class
		s1.m1();
		s1.m2();
		System.out.println("-----------");
		
		Sample2 s2=new Sample2();
		s2.m3();
		
	}
	public void m1()
	{
		System.out.println("running method m1");
	}
	public void m2()
	{
		System.out.println("running method m2");
	}

}
