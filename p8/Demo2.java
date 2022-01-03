package p8;
 import java.util.Scanner;
public class Demo2 {
	public static void main(String[]args) {
		System.out.println("Enter number= ");
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);//add@suppress worning'resource'to's'
        int a=s.nextInt();
		System.out.println("a = "+a);
		
		System.err.println("something went wrong ");

	}
}
