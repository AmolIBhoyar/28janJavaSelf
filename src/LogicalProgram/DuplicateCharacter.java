package LogicalProgram;

public class DuplicateCharacter 
{
	public static void main(String[] args) 
	{
		String s="amola";
		//1st convert string into character array
		char ar[]=s.toCharArray();
		System.out.print("duplicate character is"+" ");
		for(int i=0;i<=ar.length-1;i++)
		{
			for(int j = i+1;j<=ar.length-1;j++)
			{
				if(ar[i]==ar[j])
				{
					System.out.print(ar[i]);
				}
			}
				
			
				
				
				
				
				
		}
		
		
		
	}

}
