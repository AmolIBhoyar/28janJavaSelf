package typesofvariable;

public class Demo6
{
	int a=10;
	public void m1()
	{
		
		int b=20;
		System.out.println(a);
		System.out.println(b);
	}
	public void m2()
	{
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		Demo6 d6=new Demo6();
		d6.m1();
		d6.m2();
	}
	}


