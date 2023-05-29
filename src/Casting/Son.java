package Casting;
//subclass/childclass

public class Son extends Father
{
	public void bike()
	{
		System.out.println("bike : F2V3");   //own property
	}
	public void car()     //override
	{
		System.out.println("car : kiaseltos");
	}
	public void money()    //override
	{
		System.out.println("money : 2lac");
	}

}
