package sunday2204;

public class demo14
{
	public static void main(String[] args) 
	{
		String s="amola";
		
		System.out.print("duplicate character is ="+" ");
		
		for(int i=0;i<=s.length()-1;i++)
		{
		for(int j=i+1;j<=s.length()-1;j++)
		{
			if(s.charAt(i)==s.charAt(j))
			{
				System.out.println(s.charAt(i));
			}
		}
		}
		
	}

}
