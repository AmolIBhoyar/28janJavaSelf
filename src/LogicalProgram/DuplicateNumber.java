package LogicalProgram;

public class DuplicateNumber
{
	public static void main(String[] args)
	{
		int ar[]= {3,5,3,5,4};
		System.out.print("Duplicate number in given array is"+" ");
		for(int i=0;i<=ar.length-1;i++)
		{
			for(int j=i+1;j<=ar.length-1;j++)
			{
				if(ar[i]==ar[j])
				{
					System.out.print(ar[j]+" ");
				}
			}
		}}
}
