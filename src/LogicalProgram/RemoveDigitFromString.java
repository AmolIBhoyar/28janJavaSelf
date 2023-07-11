package LogicalProgram;

public class RemoveDigitFromString 
{
	public static void main(String[] args) 
	{
		String s="abc123xyz";
		String s1="";
		for(int i=0;i<=s.length()-1;i++)
		{
			char s2=s.charAt(i);
			if(!Character.isDigit(s2))
			{
				s1=s1+s2;
			}
		}
		System.out.println(s1);
	}

}
