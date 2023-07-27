package method;

public class Sample4    //non static regular call from same class
{
	public static void main(String[] args)
	{
	System.out.println("hi");
	Sample4 s4=new Sample4();
	s4.m5();
	s4.m6();
	s4.m6();
	}
	  //non static regular method
	public void m5()
	{
		System.out.println("running non static regular method m5 from same class");
		
	}
			public void m6()
			
			{
				System.out.println("running non static regular method m6 from same class");
	}

}
