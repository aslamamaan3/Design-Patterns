package microwave;
import java.util.*;

class Oven{


	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Enter a choice");
		System.out.println("press p to start cooking, press d to close the door, press c to cancel cooking");
		
		String opt = "";
		Door door = new Door();
		Light light = new Light();
		PowerTube powertube = new PowerTube();
		MyTimer mytimer = new MyTimer();
		
		while(true) {
			opt = sc.nextLine();
			switch(opt){
				case "d":
					//door toggle close
					if(!door.isClosed()) {
						door.Closed();
						break;
						
					}
					//door toggle open
					else if(door.isClosed() && !mytimer.isRunning()) {
						door.Open();
						break;
					}
					//opening the door while cooking
					else if(mytimer.isRunning() && door.isClosed()){
						door.Open();
						light.Off();
						powertube.Off();
						mytimer.Cancel();
						System.out.println("beep!");
						System.out.println("Cooking Cancelled by opening door");
						break;
					}
					break;
				case "p":
					//to start cooking
					if(door.isClosed() && !mytimer.isRunning()) {
						System.out.println("Light is on");
						//System.out.println("Added 1 minute of Cook time");
						mytimer.Add1Minute();
						System.out.println("Power Tube is on...");
						System.out.println("Beep!");
						break;
					}
					//to add extra minute
					if(mytimer.isRunning() && door.isClosed()) {
						mytimer.AddExtraMinute();
					}
					//door open, so just beep
					else if(!door.isClosed())
						System.out.println("Beep!");
					break;
				case "c":
					//door closed, timer running, so cancel cooking
					if(door.isClosed() && mytimer.isRunning()) {
						light.Off();
						powertube.Off();
						mytimer.Cancel();
						System.out.println("Beep!");
						System.out.println("Cooking cancelled by pressing Cancel");
						break;
					}
					//door closed, but not cooking, so just beep!
					if(!mytimer.isRunning()) {
						System.out.println("Beep!");
					}

			}
		}

	}
	
}