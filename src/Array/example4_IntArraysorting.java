package Array;

import java.util.Arrays;

public class example4_IntArraysorting
{
	public static void main(String[] args)
	{
		int ar1 []=new int[4];
		//array initialization
		ar1[0]=30;
		ar1[1]=20;
		ar1[2]=40;
		ar1[3]=10;
		System.out.println(ar1.length);
		System.out.println("---print original info---");
		for(int i=0;i<=ar1.length-1;i++)
		{
			System.out.println(ar1[i]);
		}
		Arrays.sort(ar1);
		System.out.println("---print array in ascending order---");
		for(int i=0;i<=ar1.length-1;i++)
		{
			System.out.println(ar1[i]);
		}
		System.out.println("---------");
		for(int i=ar1.length-1;i>=0;i--)
		{
			System.out.println(ar1[i]);
		}

		
	}

}
