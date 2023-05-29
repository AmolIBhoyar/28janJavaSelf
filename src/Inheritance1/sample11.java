package Inheritance1;

public class sample11 
{
	//polymorphism
	//compiletime polymorphism overload
	//same method name diff parameter
	public void m1(int a,int b)
	{
		System.out.println(a+b);
	}
	public void m1(int a,int b, int c)
	{
		System.out.println(a+b+c);
	}
    
	public static void main(String[] args) 
	{
		sample11 s11=new sample11();
		s11.m1(10, 20);
		s11.m1(10, 20, 30);
		
	}
		
	}


