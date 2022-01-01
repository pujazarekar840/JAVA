package p4;
public class Salesperson extends Employee {
	private double salesamount,commissionrate;
	public Salesperson() {
	
		//super();// hidden
		salesamount=2000;
		commissionrate=0.2;
	}
	public Salesperson(int id,String nm,double bs,double samt,double cr)
	{
		super(id,nm,bs); //calls Employee's parameterized ctor 
		salesamount=samt;
		commissionrate=cr;
	}
	public String toString() {
	
		return salesamount+"  "+commissionrate+" "+super.toString();
	}
	public double calSalary()
	{
		return super.calSalary()+salesamount*commissionrate;
	}
	public void calComm()
	{
	System.out.println("Salesperson comm = "+salesamount*commissionrate);
	}
}
