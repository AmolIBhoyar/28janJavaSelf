package constructor;

public class Sample5 
{//user defined constructor with parameter
	//declare
	int num1;
	int num2;
	Sample5(int a, int b)
	{num1=a;
	num2=b;
	}
	public void add()
    {    
		System.out.println(num1+num2);
    }
	public void mul()
	{
		System.out.println(num1*num2);
	}
    
	public static void main(String[] args) 
	{
		Sample5 s5=new Sample5(10,20);
		s5.add();
		s5.mul();
		
			System.out.println("----------");
		Sample6 s6=new Sample6(8,6);
		s6.sub();
		System.out.println("-----------");
		Sample6 s7=new Sample6(80,60);
		s7.sub();
	}

	}


