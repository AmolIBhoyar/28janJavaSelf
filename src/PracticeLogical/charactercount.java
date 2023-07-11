package PracticeLogical;

public class charactercount 
{
	public static void main(String[] args)
	{
		
	String s= "amaol";
	
	
	char c='a';
	int count=0;
	for(int i=0;i<=s.length()-1;i++)
	{
		if(s.charAt(i)=='a')
		count++;
		
		
	}
	System.out.println(count);
	}

}
