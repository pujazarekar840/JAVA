package p8;
public class A {
	int y=10;
	static int z=20;
	static class B{
		static int x=30;
		public void showB() {
			System.out.println("x= "+x);
			System.out.println("z= "+z);
			//System.out.println("y= "+y);
          }
		}
	public static void main (String[]args) {
		B b1=new B();
		b1.showB ();
	}

}
