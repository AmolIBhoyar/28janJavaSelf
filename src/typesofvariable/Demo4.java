package typesofvariable;

public class Demo4 
{
	//nonstatic global variable
	int c=30;
	public static void main(String[] args)
	{ //non static regular method call from same class
		Demo4 d4=new Demo4();
		System.out.println(d4.c);
		//non static regular method call from diff class	
		Demo5 d5=new Demo5();
		System.out.println(d5.d);
		
	}
	public static void m1()
	{
		Demo4 d4=new Demo4();
		System.out.println(d4.c);
	}
	public void m2()
	{
		System.out.println(c);
	}
	
	
}

