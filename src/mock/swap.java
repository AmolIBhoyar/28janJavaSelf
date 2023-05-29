package mock;

public class swap 
{
	public static void main(String[] args)
	{
		int num1=20;
		int num2=10;
		System.out.println("before swap");
		System.out.println(num1);
		System.out.println(num2);
		
		num1=num1+num2;  //30
		num2=num1-num2;  //30-10=20
		num1=num1-num2;
		
		System.out.println("after swap");
		System.out.println(num1);
		System.out.println(num2);
		
	}

}
