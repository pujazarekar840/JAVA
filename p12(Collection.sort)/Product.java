package p12;

import java.util.ArrayList;
public class Product implements Comparable {
	 int productid;
	  String pname;
	  int price;
	 public Product()
	 {
		 productid=1;
		 pname="Lackme";
		 price=75;
		 
	 }
	 public String toString()
	 {
		 return productid+" "+pname+" "+price;
	 }
	 public Product(int pid,String pnm,int p)
	 {
		 productid=pid;
		 pname=pnm;
		 price=p;
		 
	 }

   @Override
   public int compareTo(Object ob2) {
	Product pr2=(Product)ob2; 
	if(this.productid>pr2.productid)
		return 1;
	else if(this.productid<pr2.productid)
        return -1;
	else 
	return 0;
}


}
