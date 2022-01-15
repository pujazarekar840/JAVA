package p9;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo4 {
	
	@SuppressWarnings("unused")
	public static void show() throws FileNotFoundException
	{
		
		@SuppressWarnings("resource")
		FileInputStream fi=new FileInputStream("e:\\pooja.txt");
		System.out.println("reading file ");

	}

	public static void main(String[] args) throws FileNotFoundException 
	{
		show();

		 
		int a=10,b=20;
		int temp=a;
		a=b;
		b=temp;
		System.out.println("after swap "+a+" "+b);
		
		System.out.println("application ended  ......");
	}

}
