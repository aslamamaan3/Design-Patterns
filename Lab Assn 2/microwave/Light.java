package microwave;


class Light{

	private boolean isOn;

	public void On(){
		isOn = true;
		System.out.println("Light is on");
	}

	public void Off(){
		isOn = false;
		System.out.println("Light is off");
	}	

	public boolean isOn(){
		return isOn;
	}
}