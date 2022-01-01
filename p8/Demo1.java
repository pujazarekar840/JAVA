package p8;
public class Demo1 {

	public static void main(String[] args) {
		String myStr="Hello";
		System.out.println(myStr.replace('l','p'));
		
		String s7="10";
		Integer iob=Integer.valueOf(s7);
		
		int m=20;
		String s5=Integer.toString(m);
		System.out.println(s5);
		
		String s="10";
		int c=Integer.parseInt(s);
		
		String s1="10";
		String s2="20";
		String s3=s1+s2;
		System.out.println("s3="+s3);
		
		int sum=Integer.parseInt(s1)+Integer.parseInt(s2);
		System.out.println("sum="+sum);
		
		int a=10;
		//Integer ob=new Integer(a);//boxing[primitive->classtype]
		Integer ob=a;//auto Boxing
		
		Integer ob2=new Integer(200);
		//int b=ob2.valueOf();//unboxing[classtype->primitive]
		int b=ob2;//Auto unboxing
		}
}
