package typesofvariable;

public class Demo1 
{     //ex local & global variable
	int b=20;    //global variable
	public void m1()
	{
		int a=10;      //local variable
		System.out.println(a);
		System.out.println(b);
	}
	public void m2()
	{
		System.out.println(b);    //20
	}
	public static void main(String[] args)
	{
		Demo1 d1=new Demo1();
		d1.m1();
		d1.m2();
		
		
	}
}
