package saturday;

public class sampl8 extends thisandsuperkeyward
{
	int a=20;  //global variable same class
	public void m2()
	{
		
		
		System.out.println(this.a);
		System.out.println(super.a);
	}
	public static void main(String[] args) 
	{
		sampl8 s8=new sampl8();
		s8.m2();
	}

}
