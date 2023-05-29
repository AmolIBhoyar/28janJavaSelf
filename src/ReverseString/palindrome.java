package ReverseString;

public class palindrome
{
	public static void main(String[] args)
	{//palindrome
		String s="roor";
		String s1="";
		for(int i=3;i>=0;i--)
		{
			s1=s1+s.charAt(i);
			
		}
		System.out.println(s1);
		if(s.contentEquals(s1))
		{
			System.out.println(s+ " "+"is palindrome string");
		}
		else
		{
			System.out.println(s1+"is not palindrome");
		}
		
		
	}

}
