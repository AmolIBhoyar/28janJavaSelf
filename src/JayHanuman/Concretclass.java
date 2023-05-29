package JayHanuman;

public class Concretclass extends Abstractclass
{
	public void m2()
	{
		System.out.println("method m2");
	}
	public static void main(String[] args)
	{
		Concretclass c=new Concretclass();
		c.m1();
		c.m2();
	}

}
