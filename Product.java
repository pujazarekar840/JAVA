public class Product {
	 private int pid;
		private String pname;
		private double price;
		public Product()
		{
			pid=100;
			pname="yadli";
			price=300.4;
		}
		public void display()
		{
			System.out.println(pid+ " "+pname+" "+price);
		}
		public static void main(String[]args) {
			Product b1=new Product();
			b1.display();
		}

}
