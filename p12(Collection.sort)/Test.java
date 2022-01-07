package p12;

import java.util.ArrayList;
import java.util.Collections;

//test-Product,A,B
public class Test {

	public static void main(String[] args) {
		
			ArrayList a1=new ArrayList();
			 a1.add( new Product(1,"cccccc",13));
			 a1.add( new Product(3,"bbbb",11));
			 a1.add( new Product(2,"AAAAAA",12));
			 
			 /*System.out.println(a1);
             Collections.sort(a1);//sort by pid
             System.out.println(a1);*/

            /* System.out.println(a1);
             Collections.sort(a1,new A());//sort by price
             System.out.println(a1);*/
             
             System.out.println(a1);
             Collections.sort(a1,new B());// sort by name
             System.out.println(a1);
             
             
             
	}

}
