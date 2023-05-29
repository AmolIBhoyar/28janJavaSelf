package LogicalProgram;

public class Swap
{
	public static void main(String[] args)
	{
		int a=10;
		int b=20;
		System.out.println("before swap");
		System.out.println("number1:"+a);
		System.out.println("number2:"+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("after swap");
		System.out.println("number1 :"+a);
		System.out.println("number2 :"+b);
		
		
		
		
	}

}
