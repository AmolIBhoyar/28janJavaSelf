package control_statement;

public class Sample4_Nested_if
{
	public static void main(String[] args) 
	{
		int PET=500;
		int MEM=700;
		if(PET>=300)
		{
			System.out.println("eligible for main exam");
			if(MEM>=800)
			{
				System.out.println("got selected");
			}
			
			else
			{
				System.out.println("REJECTD FOR MAIN EXAM");
			}
			}
		else
		{
			System.out.println("NOT ELIGIBLE FOR MAIN EXAM");
		}
	
	
		}
	
}
