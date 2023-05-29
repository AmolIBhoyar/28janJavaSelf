package JayHanuman;

public class exceptionalHandeling
{
	public static void main(String[] args)
	{
		String s="abcdef";
		try 
		{
		System.out.println(s.charAt(8));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("StringIndexOutOfBoundsException");
		}
		System.out.println("hii");
		
		
	}

}
