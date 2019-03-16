package microwave;
import java.util.*;

class PowerTube{
	private boolean isOn;

	public void On(){
		isOn = true;
		System.out.println("Power tube is on...");
	}

		public void Off(){
		isOn = false;
		System.out.println("Power tube is off...");
	}

	public boolean isOn(){
		return isOn;
	}
}