package p17;

import java.util.HashSet;
import java.util.TreeSet;

public class Demo2 {

	public static void main(String[] args) {
		HashSet s1=new HashSet();
		s1.add(10);
		s1.add(11);
		s1.add(20);
		s1.add(15);
		s1.add(20);
		s1.add(11);
		s1.add(17);
		s1.add(null);
    System.out.println(s1);
    
    
    TreeSet<Integer>t1=new TreeSet<>();
    t1.add(10);
    t1.add(11);
    t1.add(20);
    t1.add(15);
    t1.add(20);
    t1.add(11);
    t1.add(17);
    t1.add(22);
  System.out.println(t1);
  System.out.println("ceiling="+t1.ceiling(16));
  System.out.println("floor="+t1.floor(16));
  System.out.println("pollast="+t1.pollLast());
  System.out.println("after poollast "+t1);
  System.out.println("pollfirst="+t1.pollFirst());
  System.out.println("after poollfirst "+t1);

 }

}
