package LogicalProgram;

public class Average
{
	public static void main(String[] args)
	{
		int ar[]= {10,40,60,30};
		int sum=0;
		int avg=0;
		int mul=1;
	
		for(int i=0;i<=ar.length-1;i++)
		{
			sum=sum+ar[i];   //addition formula
			avg=sum/ar.length-1;   //avg formula
			mul=mul*ar[i];     //multiplication formula
			
			
		}
		System.out.println("Addition = "+sum);
		System.out.println("Average = "+avg);
		System.out.println("Multiplication ="+mul);
		
		
	
		
		
	
}

}