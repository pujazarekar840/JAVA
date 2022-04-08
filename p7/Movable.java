package p7;
public interface Movable {
	void move();
}
 class Car implements Bounceable,Movable
 {
	 public void move() {
		 System.out.println("car Moves");
	 }
	 public void bounce() {
		 System.out.println("ball bounce"); 
	 }
 

}
