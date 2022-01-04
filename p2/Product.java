package p2;

public class Product {
	 private int productid;
	 private String pname;
	 private double price;
	 private MyDate dmfg;
	 public Product()
	 {
		 productid=1;
		 pname="Lackme";
		 price=75.5;
		 dmfg=new MyDate();
	 }
	 public String toString()
	 {
		 return productid+" "+pname+" "+price+" "+dmfg;
	 }
	 public Product(int pid,String pnm,double p,MyDate md)
	 {
		 productid=pid;
		 pname=pnm;
		 price=p;
		 dmfg=md;
	 }
}
