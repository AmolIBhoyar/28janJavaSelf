package JayHanuman;

public class Constructor 
{
	int num1;
	int num2;
	String name;
	Constructor(int a,int b)
	{
		num1=a;
		num2=b;
	}
	Constructor()
	{
		name="Amol";
	}
	public void m1()
	{
		System.out.println(num1+num2);
	}
	public void m2()
	{
		System.out.println(num1*num1);
	}
	public void m3()
	{
		System.out.println(name);
	}
	public static void main(String[] args)
	{
		Constructor c=new Constructor(10,20);
		c.m1();
		c.m2();
		Constructor c2=new Constructor();
		c2.m3();
		
	}

}
