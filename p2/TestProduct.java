package p2;

public class TestProduct {

	public static void main(String[] args) {
		Product p1=new Product();
		System.out.println(p1);
		Product p2=new Product(2,"Spring",80.5,new MyDate(2,2,2000));
		System.out.println(p2);

	}

}
