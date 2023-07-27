package LogicalProgram;

import PracticeLogical.charactercount;

public class FindHowManyNumAreCapitalAndSmall 
{
	public static void main(String[]args)
	{
		String s="Amol Bhoyar";
		int CapitalCount=0;
		int SmallCount=0;
		int whitespace=0;
		
		{
			for(int i=0;i<=s.length()-1;i++)
			{
				char ch=s.charAt(i);
				if(Character.isUpperCase(ch))
				{
					CapitalCount++;
				}
				else if(Character.isLowerCase(ch))
				{
					SmallCount++;
				}
				else 
				{
					whitespace++;
				}
			}
			System.out.println("Capital Letter="+CapitalCount);
			System.out.println("Small letter="+SmallCount);
			System.out.println("white space="+whitespace);
		}
	}

}
