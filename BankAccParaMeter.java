public class BankAccParaMeter {
	private int accno;
	private String name;
	private double balance;
	public BankAccParaMeter() {
		// TODO Auto-generated constructor stub
	}
	public BankAccParaMeter(int ano,String nm,double balance)
	{
		accno=ano;
		name=nm;
		this.balance=balance;
	}
	public void display()
	{
		System.out.println(accno+ " "+name+" "+balance);
	}
	public static void main(String[]args) {
		BankAccParaMeter b1=new BankAccParaMeter();
		b1.display();
		BankAccParaMeter b2=new BankAccParaMeter(101104,"puja",50000.6);
		b2.display();
	
	}
}
