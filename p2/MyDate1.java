package p2;
public class MyDate1 {
	int day,month,year;
	public MyDate1() {
		day=1;
		month=1;
		year=2001;
	}
	public MyDate1(int d,int m,int y) {
		day=d;
		month=m;
		year=y;
	}
	public String toString() {
		return day+"/"+month+"/"+year;
	}

	//pass by value mechanism
	public static void exchange(MyDate1 a,MyDate1 b)
	{
		MyDate1 temp;
		temp=a;
		a=b;
		b=temp;
	}

	public static void main(String[] args) {
		MyDate1 d1=new MyDate1(2,3,2006);
		MyDate1 d2=new MyDate1(4,5,2008);
		System.out.println("before swap"+d1+" "+d2);
		exchange(d1,d2);
		System.out.println("after swap"+d1+" "+d2);
		}

}
