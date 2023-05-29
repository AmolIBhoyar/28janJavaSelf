package practice;

public class Vowel
{
	public static void main(String[] args) 
	{
		String s="amola";
		System.out.print("vowel is :");
		for(int i=0;i<=s.length()-1;i++)
		{
		if(s.charAt(i)=='a' ||s.charAt(i)=='e'||s.charAt(i)=='i' ||s.charAt(i)=='o'||s.charAt(i)=='u')
		{
			System.out.print(s.charAt(i)+" ");
			
		}
		
	}

}
}
