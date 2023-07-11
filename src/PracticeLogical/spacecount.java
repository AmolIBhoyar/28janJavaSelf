package PracticeLogical;

public class spacecount
{
	public static void main(String[] args)
	{
		String s="A m o l";
		int count=0;
		//convert into array
		char ar[]=s.toCharArray();
		for(int i=0;i<=s.length()-1;i++)
		{
			if(ar[i]==' ')
			{
				count++;
				System.out.println("space is"+count);
			}
			
		}
		
		
	}

}
