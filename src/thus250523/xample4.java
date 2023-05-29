package thus250523;

import sun.main;

public class xample4 
{
	public static void main(String[] args)
	{
		//duplicate character
		String s="amolafda";
		 char[] ar = s.toCharArray();
		 System.out.print("duplicate character is"+" ");
		 for(int i=0;i<=ar.length-1;i++)
		 {
			 for(int j=i+1;j<=ar.length-1;j++)
			 {
				 if(ar[i]==ar[j])
				 {
					 System.out.print(ar[j]);
				 }
			 }
		 }
		
	}

}
