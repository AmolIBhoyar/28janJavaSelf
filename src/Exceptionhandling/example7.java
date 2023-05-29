package Exceptionhandling;

public class example7
{
	public static void main(String[] args)
	{
		String s1="abcd";
		int ar[]= {40,20,10,30};
		try
		{
			System.out.println(s1.charAt(5));  //1st risky code
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("StringIndexOutOfBoundsException e");
		}
		try
		{
			System.out.println(ar[9]);  //2nd risky code
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException e");
		}
		
		System.out.println("hi");
		
	}

}
