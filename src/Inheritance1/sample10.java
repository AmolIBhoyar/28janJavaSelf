package Inheritance1;

public class sample10 extends sample9 
{
	int a=20;  //global variable
	public void m1()
	{
		int a=10;  //local variable
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
	public static void main(String[] args)
	{
		sample10 s10=new sample10();
		s10.m1();
		
	}
	

}
