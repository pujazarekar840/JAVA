import java.util.Scanner;

public class AreaOfCircle{

	public static void main(String []args)
	{
		double r;
		System.out.println("Enter radius:");
		Scanner sc=new Scanner(System.in);
		r=sc.nextInt();
	 double area=3.14*r*r;
		System.out.println("Area of circle:"+area);
	}

}
;