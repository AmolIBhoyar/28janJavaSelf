package JayHanuman;

public class Palindrome 
{
	public static void main(String[] args)
	{
		String s="cooc";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		if(s.equals(rev));
		{
			System.out.println("palindrome");
		}
	
		{
			System.out.println("not palindrome");
		}
	}

}
