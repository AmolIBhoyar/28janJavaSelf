package useofStaticnonstatic;

public class EmpInfo 
{
	public static void main(String[] args)
	{
		Emp e1=new Emp();
		e1.empName="Amol";
		e1.empID=101;
		Emp.empCEOName="abc";
		
		Emp e2=new Emp();
		e2.empName="Rahul";
		e2.empID=102;
		Emp.empCEOName="xyz";
		
		Emp e3=new Emp();
		e3.empName="Ganesh";
		e3.empID=103;
		Emp.empCEOName="lmn";
		
		e1.empInfo();
		e2.empInfo();
		e3.empInfo();
		
		
		
	}

}
