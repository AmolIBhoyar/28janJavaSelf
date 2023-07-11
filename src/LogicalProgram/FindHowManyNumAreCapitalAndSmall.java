package LogicalProgram;

import PracticeLogical.charactercount;

public class FindHowManyNumAreCapitalAndSmall 
{
	public static void main(String[]args)
	{
		String s="Amol Bhoyar";
		int CapitalCount=0;
		int SmallCount=0;
		
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
			}
			System.out.println("Capital Letter="+CapitalCount);
			System.out.println("Small letter="+SmallCount);
		}
	}

}
