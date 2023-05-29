package JayHanuman;

import java.util.Arrays;

public class reverseofintarray
{
	public static void main(String[] args)
	{
		int ar[]= {70,10,40,30,60,50,90};
		System.out.println("Reverse");
		System.out.println(ar.length+"=length");
		
		for(int i=ar.length-1;i>=0;i--)
			
		{
		System.out.print(ar[i]+" ");
		}
		
System.out.println("---------");
		Arrays.sort(ar);
		for(int i=0;i<=ar.length-1;i++)
		{
			
			System.out.print(ar[i]+" ");
		}
	}

}
