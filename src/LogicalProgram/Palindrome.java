package LogicalProgram;

public class Palindrome 
{
	public static void main(String[] args)
	{
		String s="level";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		if(rev.equals(rev))
		{
			System.out.println("given string palindrome");
		}
		else
		{
			System.out.println("is not palindrome");
		}

		 
			
		}
	

}
