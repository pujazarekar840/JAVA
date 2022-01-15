package p9;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo3 {
	    @SuppressWarnings("resource")
		public static void show() throws FileNotFoundException
		{
			@SuppressWarnings("unused")
			FileInputStream fi=new FileInputStream("e:\\pooja.txt");
			System.out.println("reading file ");

			int m[]=new int[5];
			m[7]=30;
		}

		public static void main(String[] args) 
		{
			try {
				show();

			}
			catch (FileNotFoundException e) {

				e.printStackTrace();
			}
			int a=10,b=20;
			int temp=a;
			a=b;
			b=temp;
			System.out.println("after swap "+a+" "+b);
			
			System.out.println("application ended  ......");
		}
	}


