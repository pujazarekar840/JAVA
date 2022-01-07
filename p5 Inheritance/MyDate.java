package p5;
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
	 public boolean equals(Object o2)
	{
		MyDate dd2=(MyDate)o2;
		if(this.day==dd2.day && this.month==dd2.month&& this.year==dd2.year)
		{
			return true;
		}
		else
		{
			return false;
		}
			
	}
	public static void main(String [] args) {
		MyDate d1=new MyDate(4,5,2006);
		System.out.println(d1);
		
		MyDate d2=new MyDate(4,5,2006);
		System.out.println(d2);
		
		if(d1.equals(d2))
		{
			System.out.println("Same Date");
		}
		else
		{
			System.out.println("Not Same"); 
		}
		
	}
}
