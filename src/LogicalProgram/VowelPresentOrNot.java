package LogicalProgram;

public class VowelPresentOrNot
{
	public static void main(String[] args) 
	{
		String s="amol";
		
		for(int i=0;i<=3;i++)
			
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')

			 {
				 System.out.print(s.charAt(i)+" ");
			 }
		}	

}
}