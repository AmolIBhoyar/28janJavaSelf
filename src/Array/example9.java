package Array;

public class example9 
{
	public static void main(String[] args) 
	{    //10 20 30
		//40 50 60
		int ar[][]= {{10,20,30},{40,50,60}};
		System.out.println(ar.length);
		for(int i=0;i<=1;i++)//outer forloop row
		{
			for(int j=0;j<=2;j++) //inner for loop column
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
			
		}
	}

}
