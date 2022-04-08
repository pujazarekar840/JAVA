package p7;
 interface Bounceable {
	 void bounce();
 }
 class Ball implements Bounceable
 {
	 public void bounce() {
		 System.out.println("ball bounce");
	 }
	 public class test1{
		 public static void main(String[]args) {
			 Bounceable b1=new Ball();
			 b1.bounce();
			 Ball b=new Ball();
			 b.bounce();
		 }
	 }

}
