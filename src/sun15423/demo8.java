package sun15423;

public class demo8 
{
	public static void main(String[] args)
	{
		//array addition
		int ar[][]= {{10,20,30},{40,50,60}}; 
		int ar1[][]= {{10,20,30},{40,50,60}};
		int ar3[][]=new int[2][3];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				ar3[i][j]=ar[i][j]+ar1[i][j];
				System.out.print(ar3[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
