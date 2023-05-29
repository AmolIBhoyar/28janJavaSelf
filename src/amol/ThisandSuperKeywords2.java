package amol;

public class ThisandSuperKeywords2 extends ThisandSuperKeywords 
{
	int a=20;     //global variable
	public void m1()
	{
		int a=30;     //local variable
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
		
	}
	public static void main(String[] args)
	{
		ThisandSuperKeywords2 t2=new ThisandSuperKeywords2();
		t2.m1();
		
		
	}

}
