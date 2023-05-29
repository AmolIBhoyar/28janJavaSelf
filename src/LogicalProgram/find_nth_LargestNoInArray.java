package LogicalProgram;

public class find_nth_LargestNoInArray
{
	public static void main(String[] args)
	{
		int ar[]={10,30,20,80,90,60,50};
		int n=2;
		for(int i=0;i<=ar.length-1;i++)
		{
			for(int j=i+1;j<=ar.length-1;j++)
			{
				if(ar[i]<ar[j])
				{
					int temp=ar[i];
							ar[i]=ar[j];
							ar[j]=temp;
				}
			}
			if(i==n-1)
			{
				System.out.println("nth largest no is :"+ar[i]);
			}
		}
		
	}

}
