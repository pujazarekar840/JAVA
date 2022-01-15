package p9;

public class Demo1 {

	public static void main(String[] args) {
		System.out.println("Application Started...");
		try
		{
			int []arr=new int[5];
			arr[7]=20;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();// use java lang package
		}
		int a=10,b=20;
		int temp=a;
		a=b;
		b=temp;
		System.out.println("after swap "+a+" "+b);
		System.out.println("Application ended...");

	}

}
//Application Started...
//java.lang.ArrayIndexOutOfBound (error)
//after swap 20 10
//Application ended...
