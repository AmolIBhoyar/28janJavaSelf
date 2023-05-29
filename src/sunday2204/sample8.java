package sunday2204;



public class sample8 
{
	public static void main(String[] args)
	{
		//exception handeling
		String s="amol";
		int ar[]= {10,30,40};
		try
		
		{
		System.out.println(ar[7]);
		}
		catch(Exception y)
		{
			y.printStackTrace();
			System.out.println("generic exception a");
		}
		System.out.println("hiii");
		
	}

}
