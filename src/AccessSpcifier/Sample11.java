package AccessSpcifier;

public class Sample11
{
	int b;
	 Sample11()
	{
		b=20;
	}
	public void printcubeofnum()
	{
		System.out.println(b*b*b);
	}
	public static void main(String[] args) 
	{
		Sample11 s11=new Sample11();
		s11.printcubeofnum();
		System.out.println(s11.b);
		
	}

}
