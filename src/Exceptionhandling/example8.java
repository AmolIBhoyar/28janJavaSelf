package Exceptionhandling;

public class example8
{
	public static void main(String[] args)
	{
		String s1="abcd";
		int ar[]= {40,20,10,30};
		
		//nested try block
		try
		{
			try
			{
				System.out.println(s1.charAt(5));  //1st risky code
			}
			catch(StringIndexOutOfBoundsException e)
			{
				System.out.println("StringIndexOutOfBoundsException e");
			}
			System.out.println(ar[9]);  //2nd risky code
		    }
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("ArrayIndexOutOfBoundsException");
			}
		
		System.out.println("hi");
		
			
			
			
		}
		
		
	}


