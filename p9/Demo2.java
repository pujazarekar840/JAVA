package p9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;



@SuppressWarnings("unused")
public class Demo2 {
	@SuppressWarnings("resource")
	public static void main(String[]args) {
		System.out.println("Application Started...");
		try
		{
			FileInputStream f1=new FileInputStream("e:\\pooja.txt");//e Drive File type name
			System.out.println("reading file ");
			try
			{
				Thread.sleep(10);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("statement after catch");
		 }
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
			try
			{
				FileInputStream fi=new FileInputStream("e:\\pooja.txt");
				System.out.println("reading file");

				Thread.sleep(10);
			}
			catch(FileNotFoundException | InterruptedException e)
			{
				e.printStackTrace();
			}
			try
			{
				FileInputStream fi=new FileInputStream("e:\\pooja.txt");
				System.out.println("reading file ");

				Thread.sleep(10);
			}
			catch(FileNotFoundException e)
			{
				e.printStackTrace();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			    int a=10,b=20;
				int temp=a;
				a=b;
				b=temp;
				System.out.println("after swap "+a+" "+b);
				System.out.println("Application ended...");

			}

		}
//Application started...
//reading file
//statement after catch
//reading file
//reading file
//after swap 20 10
//Application ended...
	
