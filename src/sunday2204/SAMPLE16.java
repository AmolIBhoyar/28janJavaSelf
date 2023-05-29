package sunday2204;

public class SAMPLE16
{
	public static void main(String[] args)
	{
		//duplicate
		String s="amola";
		char ar[]=s.toCharArray();
	System.out.print("duplicate character ="+" ");
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
