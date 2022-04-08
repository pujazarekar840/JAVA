package p7;

public class DVDPlayer implements RemoteDevice {

		
		@Override
		public void SwitchOn() {
			System.out.println("Music Start"); 
		}
		@Override
		public void SwitchOff() {
			System.out.println("Music Off");
		}
	}


