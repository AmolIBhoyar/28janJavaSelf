package sundaypractice;

public class arrayaddition 
{
	public static void main(String[] args) 
	{
		int ar[][]= {{10,20,30},{20,30,40}};
		int ar1[][]= {{30,40,50},{40,50,60}};
		int ar2[][]=new int [2][3];
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=2;j++)
			{
				ar2[i][j]=ar[i][j]+ar1[i][j];
				System.out.print(ar2[i][j]+" ");
				
			}
			System.out.println();
			
		}
		
	}

}
