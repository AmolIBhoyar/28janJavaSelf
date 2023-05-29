package thus;

public class palindrome 
{
	public static void main(String[] args)
	{
		String s="cooc";
		String rev="";
		//palindrome
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		if(rev.equals(rev));
		{
			System.out.println("is palindrome");
		}
 
			
		{
			System.out.println("not palindrome");
		}
		
		
	}

}
