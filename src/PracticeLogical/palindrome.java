package PracticeLogical;

public class palindrome
{
	public static void main(String[] args) 
	{
		String s="soos";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.print(rev+"=");
		
			if(rev.equals(s))
			{
				System.out.println("is palindrome");
			}
			else
			{
				System.out.println("not palindrome");
			}
		}
		
	}


