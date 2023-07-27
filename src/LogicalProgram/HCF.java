package LogicalProgram;

import java.util.Scanner;

public class HCF
{
	public static void main(String[] args) 
	{
		int a=40;
		int b=80;   //gabriel lame
//		Scanner sc=new Scanner(System.in);
//		a=sc.nextInt();
//		b=sc.nextInt();
		
		while(a!=0 && b!=0)
		{
			if(a>b)
			{
				a=a%b;
			}
			else
			{
				b=b%a;
			}
		}
		if(a!=0)
		{
			System.out.println("HCFForGCD is "+ a);
		}
		else
		{
			System.out.println("HCFForGCD is"+ b);
		}
		
	}

}
