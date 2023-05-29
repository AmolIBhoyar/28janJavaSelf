package mock23;

public class duplicateString 
{
	public static void main(String[] args)
	{
		String s="amola";
		char ar[]=s.toCharArray();
		System.out.println("duplicate string is");
		
		for(int i=0;i<=ar.length-1;i++)
		{
			for (int j=i+1;j<=ar.length-1;j++)
			{
				if(ar[i]==ar[j])
				{
					System.out.println(ar[j]+" ");
				}
		}
		
		}
	}
	}
