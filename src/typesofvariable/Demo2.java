package typesofvariable;

public class Demo2 
{
     //static global variable
	static int a=10;     //static global variable
	public static void main(String[] args)
	{  //static global variable call from same class
		System.out.println(a);
	 //static global variable call from diff class

	 System.out.println(Demo3.b);
		
	}
	public static void m1()
	{
		System.out.println(a);
	}
	public void m2()
	{
		System.out.println(a);
	}
	
}
