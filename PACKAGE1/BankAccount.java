package p1;

public class BankAccount {
	private int accno;
	private String name;
	private double balance;
	static double rateint=4.5;
	
	public static void show()
	{
		System.out.println("rate of int ="+rateint);
	}
	public BankAccount()
	{
		this(101,"JOY");
		balance=10000;
	}
	public BankAccount(int ano,String nm)
	{
		accno=ano;
		name=nm;
	}
	public BankAccount(int ano,String nm,double balance)
	{
		accno=ano;
		name=nm;
		this.balance=balance;
	
	}
	public void display()
	{
		System.out.println(accno+ " "+name+" "+balance);
	}
	  public String toString()
	   {
		   //System.out.println("i am in toString()");
		   return accno+" "+name+" "+balance;
	   }
	
}
