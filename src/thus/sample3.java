package thus;

public class sample3
{
	public static void main(String[] args) 
	{
		int[] a= {10,30,10,20,40,20};
		//duplicate
		System.out.print ("Duplicate number is"+" ");
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]==a[j])
				{
					System.out.print(a[i]+" ");
				}
			}
		}
		
	}

}

