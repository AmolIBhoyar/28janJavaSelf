package thus;

import loop.For;

public class duplicatechar
{
	public static void main(String[] args)
	{
	int ar[]= {2,8,2,5,7,5};
	System.out.println("duplicate array");
	for(int i=0;i<=ar.length-1;i++)
	{
		
		for(int j=i+1;j<=ar.length-1;j++)
		{
			
			if(ar[i]==ar[j])
		
			{
				System.out.println(j);
				}
			}
		
		}
	
		
	}
	

}
