package Inheritance1;

public class sample5 extends sample4
{
	public void m3()
	{
		System.out.println("videocalling");
		}
	
	public static void main(String[] args) 
	{
		sample5 s5=new sample5();
		s5.m1();
		s5.m2();
		s5.m3();
		
	}

}
