package p12;

import java.util.Comparator;

public class A implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Product p1=(Product) o1; 
		Product p2=(Product) o2;
		if(p1.price>p2.price)
			return 1;
		else if(p1.price<p2.price)
	        return -1;
		else 
		return 0;

		
	}

}
