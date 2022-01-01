package p4;

public class Employee {
	private int empid;
	private String ename;
	private double basicsalary;
	private double pf=1200,pt=200;
	
	public Employee() {
		//System.out.println("in emp default ctor ");
		empid=101;
		ename="Yash";
		basicsalary=10000;		
	}
	public Employee(int eid,String nm,double sal) {

		empid=eid;
		ename=nm;
		basicsalary=sal;
	}
	
	public String toString() {
	
		return empid+" "+ename+" "+basicsalary;
	}
	public double calSalary()
	{
		return basicsalary-pf-pt;
	}

}
