package LogicalProgram;

public class x
{
	public static void main(String[] args) 
	{
		int ar1[]= {10,20,30,40,100};
		int ar2[]= {10,20,70,80,100};
		
		for(int i=0;i<=4;i++)
		{//100!=100
			if(ar1[i]!=ar2[i])
			{
				System.out.println(ar1[i]+" "+ar2[i]);
				
			}
		}
	}

}
