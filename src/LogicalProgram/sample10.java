package LogicalProgram;

public class sample10
{
	public static void main(String[] args)
	{
		int ar[]= {10,40,50,30,50,50};
		System.out.println("duplicate no is :");
		for(int i=0;i<=ar.length-1;i++)
		{
			for(int j=i+1;j<=ar.length-1;j++)
			{
				if(ar[i]==ar[j])
				{
					System.out.println(ar[i]);
				}
				
			}
			
		}
		
	}

}
