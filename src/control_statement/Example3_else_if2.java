package control_statement;

public class Example3_else_if2
{
	public static void main(String[] args)
	{
		int marks=34;
		if(marks>=65)
		{
				System.out.println("Distinction");
		}
		else if(marks>=60 &marks<=64)        //60-64
		{
			System.out.println("1st class");
			
		}
		else if(marks>=50 &marks<=59)//50-59
		{
			System.out.println("2nd clsss");
		}
		else if(marks>=35 &marks<=49)
		{
			System.out.println("3rd class");
		}
       else 
	
       {
			System.out.println("fail");
		}
	}
	
}
		
		