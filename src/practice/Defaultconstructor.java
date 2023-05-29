package practice;

public class Defaultconstructor 
{
	//default constructor
//	Defaultconstructor()
//	{
//	}
	public static void main(String[] args) 
	{
		Defaultconstructor d1=new Defaultconstructor();
		d1.m1();
		d1.m2();
		
		
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
