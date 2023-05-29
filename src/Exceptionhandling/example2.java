package Exceptionhandling;

public class example2
{
	public static void main(String[] args)
	{
		int ar[]= {40,20,10,30};
		try
		{
			System.out.println(ar[8]);		//risky code
		}
		catch(ArrayIndexOutOfBoundsException s1)
		{		
			System.out.println(ar[1]);   //alternate sol
			System.out.println("ArrayIndexOutOfBoundException handled");
	    }
		
			System.out.println("good night");
}
}
