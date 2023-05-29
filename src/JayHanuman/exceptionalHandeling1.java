package JayHanuman;

public class exceptionalHandeling1
{
	public static void main(String[] args)
	{
		int ar[]= {10,40,50,40};
		try
		{
		System.out.println(ar[7]);
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println(ar[3]);//alternate solution
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		System.out.println("hello");
		
	}

}
