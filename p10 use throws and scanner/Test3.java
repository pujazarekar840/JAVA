package p10;
import java.util.Scanner;
@SuppressWarnings("serial")
class LowageException extends Exception{
	public LowageException() {
}
	public LowageException(String msg) {
		super(msg);
	}
}
public class Test3 {
     @SuppressWarnings("unused")
	public static void main(String[] args) {
    	 Test3 t=new Test3();
		int age;
		try
		{
			System.out.println("Enter age: ");
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			 age=sc.nextInt();
						
			if(age<18)
				throw new LowageException("minimum age is required 18");
			else
			{
				System.out.println("Register for voting...");
			}
	  }
		catch (LowageException e)
		{
			e.printStackTrace ();
		}
		System.out.println("Application ended...");

	}

}
