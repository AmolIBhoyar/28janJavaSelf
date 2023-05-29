package constructor;

public class Sample7
{//ex4 user defined constructor-->multiple constructor-->constructor overload
	int num1;
	int num2;
	String name;
	//user defined without/zero parameter cont.
	Sample7()
	{
		num1=10;
		num2=20;
	}
	//user defined with 2 int parameter
	Sample7(int a,int b)
	{
		num1=a;
		num2=b;
	}
	//user defined constructor with String parameter
	Sample7(String s1)
	{
		name=s1;     //smita
	}
	public void studentname()
	{
		System.out.println(name);
	}
	public void add()
	{
		System.out.println(num1+num2);
	}
	public static void main(String[] args)
	{
		Sample7 s7=new Sample7();
		s7.add();
		System.out.println("---------");
		Sample7 s8=new Sample7(5,6);
		s8.add();
		System.out.println("---------");
		Sample7 s9=new Sample7("smita");
		s9.studentname();
	}

	}


