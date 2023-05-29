package sunday2204;

public class sample13
{
	public static void main(String[] args)
	{
		int ar[]= {10,20,30,20,40};
		System.out.print("duplicate no");
		
		for(int i=0;i<=ar.length-1;i++)
		{
			for(int j=i+1;j<=ar.length-1;j++)
			{
				if(ar[i]==ar[j])
				{
					System.out.println(ar[j]);
				}
			}
			
		}
	}
	}