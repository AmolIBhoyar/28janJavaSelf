package sundaypractice;

public class duplicatearray
{
	public static void main(String[] args)
	{
		int ar[]= {10,50,40,10,20,20};
		System.out.print("duplicate character in integer array :");
		for(int i=0;i<=ar.length-1;i++)
		{
			for(int j=i+1;j<=ar.length-1;j++)
			{
				if(ar[i]==ar[j])
				{
					System.out.print(ar[i]+" ");
				}
			
			}
		
			
		}
		
	}

}
