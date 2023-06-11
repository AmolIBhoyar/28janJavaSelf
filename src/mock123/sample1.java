package mock123;

public class sample1 
{
	public static void main(String[] args) 
	{
		String s1="Am o l";
		int count=0;
		//String rev="";
		char ch[]=s1.toCharArray();
		for(int i=0;i<=s1.length()-1;i++)
		{
			
			if(ch[i]==' ')
			{
				count++;
				System.out.println(count+"sapace are present ");
			}
			
			
		}
		
	}

}
