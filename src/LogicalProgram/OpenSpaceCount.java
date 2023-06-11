package LogicalProgram;

public class OpenSpaceCount
{
	public static void main(String[] args) 
	{
		String s="Am o l";
		int count=0;
		//convert into array
		char ar[]=s.toCharArray();
		for (int i=0;i<=s.charAt(i)-1;i++)
		{
			if(ar[i]==' ')
			{
				count++;
				System.out.println(count+"space");
			}
		}
		
		
	}

}
