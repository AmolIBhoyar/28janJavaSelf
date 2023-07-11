package Exceptionhandling;

public class example5 
{
	public static void main(String[] args)
	{
		String s1="abcd";
		try {
			System.out.println(s1.charAt(5));
		}
		catch(Exception e)
		{
			printStackTrace();
			System.out.println("generic exception handled");
		}
		System.out.println("hi");
		System.out.println("hello");
		
		
	
		
	
		
	}

	private static void printStackTrace() {
		// TODO Auto-generated method stub
		
	}
}
