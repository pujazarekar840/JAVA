package p2;
public class MyDate {
	int day,month,year;
	public MyDate() {
		day=1;
		month=1;
		year=2001;
	}
	public MyDate(int d,int m,int y) {
		day=d;
		month=m;
		year=y;
	}
	public String toString() {
		return day+"/"+month+"/"+year;
	}
	//pass by value mechanism
	public static void exchange1(MyDate a,MyDate b)
	{
		MyDate temp;
		temp=a;
		a=b;
		b=temp;
	}
	//pass by array notation

	public static void exchange2(MyDate[] a) {
		MyDate temp;
		temp=a[0];
		a[0]=a[1];
		a[1]=temp;
	}
	public static void main (String[]args) {
		MyDate d1=new MyDate(2,3,2006);
		MyDate d2=new MyDate(4,5,2008);
		System.out.println("before swap"+d1+" "+d2);
		exchange1(d1,d2);
		System.out.println("after swap"+d1+" "+d2);
		//use concept of Array
		MyDate d[]=new MyDate[2];
		d[0]=new MyDate(2,3,2006);
		d[1]=new MyDate(4,5,2008);
		 System.out.println("before swap "+d[0]+" "+d[1]);
		 exchange2(d);
		 System.out.println("after swap "+d[0]+" "+d[1]);
		}
}
