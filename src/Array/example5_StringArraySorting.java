package Array;

import java.util.Arrays;

public class example5_StringArraySorting
{
	public static void main(String[] args) 
	{
		String ar []=new String[5];
		ar[0]="rahul";
		ar[1]="ganesh";
		ar[2]="mahesh";
		ar[3]="suresh";
		ar[4]="ramesh"; 
		System.out.println(ar.length);
		Arrays.sort(ar);
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		
	}

}
