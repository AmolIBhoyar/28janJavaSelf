package sundaypractice;

public class swap 
{
	public static void main(String[] args)
	{
		int num1=10;
		int num2=20;
		System.out.println("before swap");
		System.out.println("num1 ="+num1);
		System.out.println("Num2 ="+num2);
		num1=num1+num2;//30
		num2=num1-num2;  //10
		num1=num1-num2;   //30-10
		System.out.println("after swap");
		System.out.println("num1 ="+num1);
		System.out.println("num2 ="+num2);
		
	}

}
