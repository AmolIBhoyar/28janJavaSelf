package sunday2204;

public class sample12
{
	public static void main(String[] args) 
	{
		//leap year
		int year=2005;
		if(year%4==0  && !(year%100==0) ||year%400==0)
		{
			System.out.println(year +" is leap year");
			}
		else
		{
			System.out.println(year +" not leap year");
		}
		
		
	}

}
