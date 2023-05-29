package typesofvariable;

public class Demo9
{
	int num1;
	int num2;
	Demo9(int a,int b)
	{
		num1=a;
		num2=b;
	}
	public void m1()
	
	{
		System.out.println(num1+num2);
	}
	public void m2()
	{
		System.out.println(num1*num2);
	}
	public static void main(String[] args) 
	{
		Demo9 d9=new Demo9(10,20);
		d9.m1();
		d9.m2();
		
	}
}
