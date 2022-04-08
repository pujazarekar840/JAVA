public class BankAccount {
	private int accno;
	private String name;
	private double balance;
	public BankAccount()
	{
		accno=101103;
		name="Rahul";
		balance=30000.5;
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
	
	
	
   
  
	
	
  
}
