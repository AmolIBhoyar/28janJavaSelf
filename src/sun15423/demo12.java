package sun15423;

public class demo12
{
	public static void main(String[] args)
	{
		//palindrome
		String s="level";
		String rev="";
		for(int i=4;i>=0;i--)
		{
			rev=rev+s.charAt(i);
			
		}
		System.out.println(rev);
		
	if(s.equals(rev))
	{
		System.out.println("is palindrome");
	}
	else
	{
		System.out.println("not palindrome");
	}

}}
