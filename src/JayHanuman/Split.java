package JayHanuman;

public class Split 
{
	public static void main(String[] args)
	{
		String s="i love my india";
		System.out.println(s.charAt(4));
		System.out.println(s.contains("my"));
		
		//split
		String[] s2=s.split(" ");
		for(int i=0;i<=s2.length-1;i++)
		{
			System.out.print(s2[i]+" ");
		}
		System.out.println();
		System.out.println(s2.length);
		
		
	}

}
