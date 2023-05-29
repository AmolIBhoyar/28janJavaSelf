package thus;

public class sample2 
{
	public static void main(String[] args) 
	{
		String s="Beautiful beach";
		char ar[]=s.toCharArray();
		System.out.println("duplicate string");
		System.out.print("duplicate string is :");

		for(int i=0;i<=s.length()-1;i++)
		{
			for(int j=i+1;j<=s.length()-1;j++)
			{
				if(ar[i]==ar[j])
				{
				
					System.out.print(ar[j]+" ");
				}
					
			}
		}
		
		

	}
	}
