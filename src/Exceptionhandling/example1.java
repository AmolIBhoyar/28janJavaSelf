package Exceptionhandling;

public class example1 
{
	public static void main(String[] args) 
	{
		String s1="abcd";
		try
		{
		   System.out.println(s1.charAt(5));
	     }
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("StringIndexOutOfBoundsException");
		}
		{
			System.out.println("hi");
			System.out.println("hello");
			
			}
		}

}
