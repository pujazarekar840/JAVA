package p7;

public class Test {

	public static void main(String[] args) {
		RemoteDevice m=new TV();
		m.SwitchOn();
		
		RemoteDevice m1=new TV();
		m1.SwitchOff();
		
		RemoteDevice d=new DVDPlayer();
		d.SwitchOn();

		RemoteDevice d1=new TV();
		d1.SwitchOff();


		
		

	}

}
