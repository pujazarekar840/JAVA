package p1;

public class TestBank {

	public static void main(String[] args) {
		System.out.println("In Main");

	
    BankAccount.show();
	Loan.show();
	BankAccount b1=new BankAccount();
	b1.display();
	BankAccount b2=new BankAccount(101104,"Puja",50000.6);
	b2.display();
	
	}
}
