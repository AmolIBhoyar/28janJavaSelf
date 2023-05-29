package Exceptionhandling;

public class example4
{
	public static void main(String[] args) 
	{
		String s1="abcd";
		try
		{
			System.out.println(s1.charAt(5));
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println("ArrayIndexOutOfBoundsException handled");
		}
		catch(ArithmeticException e2)
		{
			System.out.println("ArithmeticException e2");
		}
		catch(StringIndexOutOfBoundsException e3)
		{
			System.out.println("StringIndexOutOfBoundsException e3");
		}
		
		
		
		
		System.out.println("hi");
		System.out.println("hello");
	}


}
