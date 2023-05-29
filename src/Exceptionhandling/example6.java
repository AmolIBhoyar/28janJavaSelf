package Exceptionhandling;

public class example6 
{
	public static void main(String[] args)
	{
		String s1="abcd";
		try
		{
			System.out.println(s1.charAt(5));
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException handled e");
		}
		catch(StringIndexOutOfBoundsException e1)
		{
			System.out.println("StringIndexOutOfBoundsException handled e1");
		}
		catch(Exception e)
		{
			System.out.println("generic exception handled");
		}
		
		System.out.println("hi");
		
	}

}
