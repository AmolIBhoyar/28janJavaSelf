package JayHanuman;

public class exceptionalHandeling2 
{
	public static void main(String[] args)
	{
		int num1=10;
		int num2=0;
		int div=0;
		try
		{
			div=num1/num2;
		}
		catch(ArithmeticException a)
		{
			System.out.println("error");
			
		}
		System.out.println(div);
		System.out.println("hi");
		
	}

}
