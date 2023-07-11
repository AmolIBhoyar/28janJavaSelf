package LogicalProgram;

public class findTotalNumberOfAlphabetOrDigitsInAString
{
	public static void main(String[] args)
	{
		String s= "abc #4@ boc";
		int alpha=0;
		int digit=0;
		int spechar=0;
		int space=0;
	//char ar[]=s.toCharArray();
	for(int i=0;i<=s.length()-1;i++)
	{
		char s1=s.charAt(i);
		if(Character.isLetter(s1))
		{
			alpha++;
		}
		else if(Character.isDigit(s1))
		{
			digit++;
		}
		else if(Character.isWhitespace(s1))
		{
			space++;
		}
		else
		{
			spechar++;
		}
	}
	System.out.println(alpha);
	System.out.println(digit);
	System.out.println(space);
	System.out.println(spechar);

}
}
