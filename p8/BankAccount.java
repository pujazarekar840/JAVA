package p8;
public class BankAccount {
	private int accno;
	private String name;
	private double balance;
	public BankAccount() {
		accno=1234;
		name="Anku"	;	
		balance=2000;
	}
	class Loan {
		int loannumber=4567;
		int loanamt=3000;
		public void showLoan() {
			System.out.println("account no= "+accno);
			System.out.println("name= "+name);
			System.out.println("loannumber= "+loannumber);
			System.out.println("loanamount="+loanamt);
			}
	}
	public void display() {
		System.out.println(accno+" "+name+" "+balance);
		//System.out.println(loanamt);
	}
	

}

