package amol;

public class Elseif 
{
	public static void main(String[] args) 
	{
		int marks=59;
		if(marks>=75)
		{
			System.out.println("Dist");
		}
		else if(marks>=60 &marks<=74)
		{
			System.out.println("1st class");
		}
		else if(marks>=50 & marks<=59)
		{
			System.out.println("2nd class");
		}
		else if(marks>=35 & marks<=49)
		{
			System.out.println("3rd class");
		}
		else 
			System.out.println("Fail");
		
		
	}

}
