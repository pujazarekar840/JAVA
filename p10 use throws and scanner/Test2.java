package p10;
@SuppressWarnings("serial")
class NegativenumberException extends Exception{
	public NegativenumberException() {
}
	public NegativenumberException(String msg) {
		super(msg);
	}
}
public class Test2 {
	public static void main(String[] args) {
		int age=-10;
		try
		{
			if(age<0)
			throw new NegativenumberException("Age required positive number");
			else
			{
				System.out.println("Number is valid for age");
			}
		}
		catch(NegativenumberException e)
		{
			e.printStackTrace();
		}
		System.out.println("Application ended");

	}

}
