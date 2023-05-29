package typesofvariable;

public class Demo7 
{//global variable
	int num1;
	int num2;
	
	Demo7()
	{
		num1=10;
		num2=20;
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
	 Demo7 d7=new Demo7();
	 d7.add();
	 d7.mul();
	 Demo8 d8=new Demo8();
			 d8.add();
}
}

