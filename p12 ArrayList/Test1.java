package p12;

import java.util.ArrayList;

public class Test1 {
  //Non-Generic ArrayList    
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("Mayuri");
		a1.add(21);		
		a1.add("pune");
		a1.add(70);
		for(Object x:a1) {
			System.out.println(x);
			
		}
			
		
		

	}

}
