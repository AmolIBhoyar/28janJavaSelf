package LogicalProgram;

public class MaximumNo
{
	public static void main(String[] args) 
	{
		int ar[]= {10,20,30,60};
		
		int max=ar[0];
		
		for(int i=0;i<=ar.length-1;i++)
		{
			if(ar[i]>max)
			max=ar[i];
				
		}
		System.out.println("maximum no is : "+max);
		
	}
	}
		
	
