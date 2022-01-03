package p8;
//use Run As(right click ans run as->configuration->Argument Enter 10 20 40)
public class Demo3 {
	public static void main(String[] args) {
		
		System.out.println(args[0]);
		
		int c = Integer.parseInt(args[1])+Integer.parseInt(args[2]);
		System.out.println(" c = "+c);
		
	}


}
//o/p=10
//c=60