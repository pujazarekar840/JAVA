package p12;

import java.util.ArrayList;

import p2.MyDate;

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
		 //dmfg=new MyDate();
	 }
	 public String toString()
	 {
		 return productid+" "+pname+" "+price;
	 }
	 public Product(int pid,String pnm,double p)
	 {
		 productid=pid;
		 pname=pnm;
		 price=p;
		 //dmfg=md;
	 }
	 
	 

public static void main(String []args) {
	ArrayList a1=new ArrayList();
	 a1.add( new Product(101,"pen",10));
	 a1.add( new Product(103,"pencile",10));
	 a1.add( new Product(102,"notebook",10));
	 System.out.println(a1);

	
}


}
