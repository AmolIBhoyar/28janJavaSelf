package LogicalProgram;

public class CountCharacter 
{
	public static void main(String[] args) 
	{
		String s="application";
		char c='a';
		int count=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)==c)
			{
				count++;
			}
		}
		System.out.println(count);
		
	}

}
