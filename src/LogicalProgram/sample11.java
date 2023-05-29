package LogicalProgram;

public class sample11 
{
	public static void main(String[] args) 
	{
		String s="amola";
		//convert into array
		char ar[]=s.toCharArray();
		for(int i=0;i<=ar.length-1;i++)
		{
			for(int j=i+1;j<=ar.length-1;j++)
			{
				if(ar[i]==ar[j])
				{
					System.out.println("duplicate no : "+ar[i]);
				}
				
			}
			
		}
		
	}

}
