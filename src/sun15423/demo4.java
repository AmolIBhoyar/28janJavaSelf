package sun15423;

public class demo4 
{
	public static void main(String[] args)
	{
		//nested if
		int pre=120;
		int mains=150;
		if(pre>=120)
		{
			System.out.println("eligible for mains");
			if(mains>=150)
			{
				System.out.println("got selected");
			}
			else
			{
				System.out.println("rejrcted");
			}
		}
		else
		{
			System.out.println("not eligible for mains");
		}
		}
		
	}


