package sunday2204;

public class sample6 
{
	int num1;
	int num2;
	sample6(int a,int b)
	{
		num1=a;
		num2=b;
				
	}
	public void add()
	{
		System.out.println(num1*num2);
	}
public static void main(String[] args)
{
	sample6 s6=new sample6(30, 40);
	s6.add();
			
	
}
}
