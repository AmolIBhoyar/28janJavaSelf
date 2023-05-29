package practice;

public class Udc 
{
//	global variable declaration
	int num1;
	String s;
	float f;
//	initialization
	Udc()
	{
	
		num1=10;
		s = "Amol";
		f =13.4f;
		
	
	}
	public void m1()
	{
		System.out.println(num1+f+" "+"Bhoyar="+"Amol");
	}
	public void m2()
	{
		System.out.println(s);
	}
	public static void main(String[] args)
	{
		Udc u1=new Udc();
		u1.m1();
		u1.m2();
		Udc2 u2=new Udc2();
		u2.m4();
		
	}
	
	

}
