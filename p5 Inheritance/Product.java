package p5;
//equality
//Inheritance object-cosmic super class use code
public class Product {
	private int pid,price;
   public Product()
	{
		pid=1;
		price=30;
	}
   public Product(int id,int pr) {
	   pid=id;
	   price=pr;
   }
   public String toString() {
	   return pid+" "+price;
   }
   public boolean equals(Object o2)
   {
	   Product dd2=(Product)o2;
		if(this.pid==dd2.pid && this.price==dd2.price)
		{
			return true;
		}
		else
		{
			return false;
		}
			
	}
	public static void main(String [] args) {
		Product d1=new Product(101,399);
		System.out.println(d1);
		
		Product d2=new Product(1, 509);
		System.out.println(d2);
		
		if(d1.equals(d2))
		{
			System.out.println("Same id,Price ");
		}
		else
		{
			System.out.println(" Different id,Price"); 
		}
	 
   }
	

}
