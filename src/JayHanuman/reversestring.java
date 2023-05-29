package JayHanuman;

public class reversestring
{
	public static void main(String[] args) 
	{
		String s="Avinash";
		String rev="";
		for(int i=6;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
	}

}
