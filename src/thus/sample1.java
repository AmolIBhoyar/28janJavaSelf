package thus;

public class sample1
{
	public static void main(String[] args) 
	{
		int s[]= {10,40,30,20,40};
		int add=0;
		int avg=0;
		int mul=1;
		for(int i=0;i<=s.length-1;i++)
		{
			add=add+s[i];
			mul=mul*s[i];
			avg=add/s.length-1;
		}
		System.out.println("Addition ="+add);
		
		System.out.println("Average ="+avg);
	System.out.println("multiplication="+mul);
	}
	

}
