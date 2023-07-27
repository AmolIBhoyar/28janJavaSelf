package LogicalProgram;

import java.util.Arrays;

public class MaxiaNoSortsMethod
{
	public static void main(String[] args)
	{
		
	
	int ar[]= {10,90,50,40,30};
	for(int i=0;i<=ar.length-1;i++)
		Arrays.sort(ar);
	System.out.println(ar.length);  //5
	{
		
		System.out.println(ar[4]);
	}

}
}
