package PracticeLogical;

public class duplicateno 
{
	public static void main(String[] args)
	{
		int ar[]= {10,20,30,20,40};
		for(int i=0;i<=ar[i];i++)
		{
			for(int j=i+1;j<=ar[j];i++)
			{
				if(ar[i]==ar[j])
				{
					System.out.println(ar[i]);
				}
			}
			
		}
		
		
	}

}
