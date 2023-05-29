package thus250523;

public class xampl2 
{
	public static void main(String[] args) 
	{
		//leap year
		int year=2023;
		if(year%4==0 &&!(year%100==0) || (year%400==0))
		{
			System.out.println(year+"is leap year");
		}
		else
		{
			System.out.println("not leap year"+year);
		}
		
	}

}
