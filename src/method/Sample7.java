package method;

public class Sample7
{
  //method without/zero parameter
	public static void main(String[] args)
	{
		//static regular mthod call from same class
		m1();
		//static regular method call from diff class
		Sample8.m2();
		//non static regular method call from same class
		Sample7 s7=new Sample7();
				s7.m3();
				//non static regular method call from diff class
				Sample8 s8=new Sample8();
						s8.m4();
		
				
	}
public static void m1()
{
System.out.println("running static regular method m1 := from same class");
}
public void m3()
{
System.out.println("running staatic regular method m3; from same class");
}
}