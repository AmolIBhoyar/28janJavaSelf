package constructor;

public class Sample3 
{  //user defined constructor
	//step1:declaration of variable
	int num1;
	int num2;
	//step2:variable initialization
	//user defined constructor-->provided by user
	//use1:initialize global variable
	//use2:copy all the member of call into object
	Sample3()
	{
		num1=10;
		num2=20;
	}
	//step3:usage
	public void addition()
	{
		System.out.println(num1+num2);
	}
	public void multiplication()
	{
		System.out.println(num1*num2);
		
	}
	public static void main(String[] args)
	{
		Sample3 s3=new Sample3();
				s3.addition();
				s3.multiplication();
	System.out.println("-------");
	Sample4 s4=new Sample4();
	s4.sub();
		
	}

}
