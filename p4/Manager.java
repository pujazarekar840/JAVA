package p4;
public class Manager extends Employee 
{
	private double no_of_subordinate,incentivepermember;
	public Manager() {
	
		super();// hidden
		no_of_subordinate=15000;
		incentivepermember=0.5;
	}
	public Manager(int id,String nm,double bs,double nsab,double ipm)
	{
		super(id,nm,bs);  
		no_of_subordinate=nsab;
		incentivepermember=ipm;
	}
	public String toString() {
	
     return no_of_subordinate+"  "+incentivepermember+" "+super.toString();
	}
	public double calSalary()
	{
		return super.calSalary()+no_of_subordinate*incentivepermember;
	}
	public void calIncentive()
	{
      System.out.println("Manager incentive= "+no_of_subordinate*incentivepermember);
	}
}
