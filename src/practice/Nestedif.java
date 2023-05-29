package practice;

public class Nestedif
{
	public static void main(String[] args)
	{
		int pre=150;
		int main=150;
		if(pre>=120)
		{
			System.out.println("eligible for mains");
			if(main>=150)
			{
				System.out.println("selcted");
			}
			else
			{
				System.out.println("rejected");
			}
		}
		else
		{
			System.out.println("not ligible for main");
		}
		}
		
	}


