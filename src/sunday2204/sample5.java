package sunday2204;

public class sample5
{
	//constructor
	int num1;
	int num2;
	sample5()
	{
		num1=10;
		num2=20;
	}
	public void add()
	{
		System.out.println(num1+num2);
	}
	public static void main(String[] args) 
	{
		sample5 s5=new sample5();
		s5.add();
		
	}

}
