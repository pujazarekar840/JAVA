package p12;

import java.util.Comparator;

public class B implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Product p1=(Product)o1;
		Product p2=(Product)o2;
		return p1.pname.compareTo(p2.pname);
	}

}
