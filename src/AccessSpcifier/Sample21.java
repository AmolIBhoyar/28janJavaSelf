package AccessSpcifier;

public class Sample21
{
	protected int d;
	protected Sample21()
	{
		d=40;
	}
	protected void printsquareofnum()
	{
		System.out.println(d*d);
	}
	public static void main(String[] args)
	{
		Sample21 s21=new Sample21();
		s21.printsquareofnum();
		System.out.println(s21.d);
		
	}

}
