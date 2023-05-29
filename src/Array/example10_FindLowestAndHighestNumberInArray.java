package Array;

import java.util.Arrays;

public class example10_FindLowestAndHighestNumberInArray
{
	public static void main(String[] args)
	{
		int ar[]=new int[4];
		ar[0]=30;
		ar[1]=20;
		ar[2]=40;
		ar[3]=10;
		Arrays.sort(ar);
		System.out.println(ar.length);
		for(int i=0;i<=3;i++)
		{
			System.out.println(ar[i]);
		}
		System.out.println("----dec-----");
		for(int j=3;j>=0;j--)
		{
			System.out.println(ar[j]);
		}
		
			
		
	

}
}
