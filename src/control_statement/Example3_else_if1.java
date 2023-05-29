package control_statement;

public class Example3_else_if1 
{
	public static void main(String[] args) 
	{
		int marks=60;
		if (marks>=65)      //>65
		{
			System.out.println("dist");
		}
		else if(marks>=60 & marks<=64)  //60-64
		{
			System.out.println("1st class");
			
		}
		else if (marks>=50 &marks<=59)     //50-59
	
	{System.out.println("2nd class");
	
	}
		else if (marks>=40 &marks<=49)    //40-49
			
		{System.out.println("3rd class");
		
		}
		if (marks>=35 )  //35-49
		{
			System.out.println("Pass");
			
		}
		else
		{
			System.out.println("fail");
		}
	}
	

}
