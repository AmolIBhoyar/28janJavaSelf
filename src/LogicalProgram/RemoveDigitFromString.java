package LogicalProgram;

public class RemoveDigitFromString 
{
	public static void main(String[] args) 
	{
		String s="abc123xyz";
		String s1="";
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if(!Character.isDigit(ch))
			{
				s1=s1+ch;
			}
			//if(Character.isAlphabetic(ch))
//			{
//				s1=s1+ch;
//			}
		}
		System.out.println(s1);
	}

}
