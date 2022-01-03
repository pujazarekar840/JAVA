package p8;
public class Order {
	int orderid;
		public Order() {
		
			orderid=1011;
		}
		public void placeOrder()
		{
			
			class Product
			{
				@SuppressWarnings("unused")//Add @supress worning for pid error
				int pid,quantity,rate;
				public Product() {
				
					pid=10222;
					quantity=1;
					rate=200;
				}
				public void makeBill()
				{
					System.out.println("bill amount ="+quantity*rate);
				}
			}
			Product p=new Product();
			p.makeBill();
			System.out.println("order placed .....");
		}
	}




