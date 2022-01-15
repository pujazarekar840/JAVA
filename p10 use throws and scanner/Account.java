package p10;

import java.util.Scanner;

@SuppressWarnings("serial")
class LowBalanceException extends Exception{
	public LowBalanceException(String balance) {
		super(balance);
		}
}
public class Account {
	static int balance;
	public Account() {
		balance=10000;
	}
	public void withdraw(int amt)throws LowBalanceException
	{
		if(balance-amt<5000)
			throw new LowBalanceException("minimum balance should be 5K...");
		else
		{
			System.out.println("widraw");
		}
	}
      @SuppressWarnings("resource")
	public static void main(String[] args) {
		Account ob=new Account();
		try
		{
			System.out.println("Enter widraw amount:");
			Scanner cs=new Scanner(System.in);
			
			int balance=cs.nextInt();
		     ob.withdraw(balance);
		}
		catch(LowBalanceException e)
		{
			e.printStackTrace();
		}
    }
}
