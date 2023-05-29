package Casting;

public class TestUpCasting 
{
	public static void main(String[] args) 
	{
		//create object of sub class with rference/datatype of superclass
		Father s=new Son();
		s.car();
		s.money();
		s.home();
		
	}

}
