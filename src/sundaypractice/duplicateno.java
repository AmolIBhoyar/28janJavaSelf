package sundaypractice;

public class duplicateno
{
	public static void main(String[] args)
	{
		int ar[]= {3,5,7,5,3};	
	
		System.out.print("duplicate no =");
		for(int i=0;i<=ar.length-1;i++)
		{
			for(int j=i+1;j<=ar.length-1;j++)
			{
				if(ar[i]==ar[j])
				{
					System.out.print(ar[j]+" ");
	
			}
		}
		}}}