package practice;

public class Sample1method 
{
	public static void main(String[] args)
	{  //method is block of code which only run when it is called
		 //main method
		//1 static same class
		m1();
		//2 static from diff class
		Sample2method.m2();
		//3 non static same class
		Sample1method s1=new Sample1method();
		s1.m3();
		//non static diff class
		Sample2method s2=new Sample2method();
		s2.m4();
		
		
		
	}
	//regular method
	public static void m1()
	{
		System.out.println("running static regular method m1 from same class");
	}
	public void m3()
	{
		System.out.println("running nonstatic regular method m3 from same class");
	}
}
