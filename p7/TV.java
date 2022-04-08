package p7;

public class TV implements RemoteDevice {
	@Override
	public void SwitchOn() {
		System.out.println("TV is ON"); 
	}
	
	
	@Override
	public void SwitchOff() {
		System.out.println("TV is Off");
	}

}
