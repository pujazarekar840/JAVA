package p1;

public class BankAccount1 {
	private int accno;
    private String name;
    private double balance;
   public BankAccount1()
   {
	accno=101103;
	name="Rahul";
	balance=30000.5;
   }
 public BankAccount1(int ano,String nm,double balance)
   {
	accno=ano;
	name=nm;
	this.balance=balance;
   }
   public String toString()
   {
	   //System.out.println("i am in toString()");
	   return accno+" "+name+" "+balance;
   }
   public static void main(String[] args) {
	   BankAccount1 b1=new BankAccount1();
	   System.out.println(b1);
	   BankAccount1 b2=new BankAccount1(101104,"Puja",5000.6);
	   System.out.println(b2); 
	   
		

	}

}
