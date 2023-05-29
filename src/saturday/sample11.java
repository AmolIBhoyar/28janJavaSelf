package saturday;

public class sample11 extends thisandsuperkeyward
{
	int a=20;
	public void m2()
	{
		int a=30;
		
		System.out.println(super.a);
		System.out.println(a);
		System.out.println(this.a);
	}
	public static void main(String[] args) 
	{
		sample11 s11=new sample11();
		s11.m2();
		
	}
	}
			


