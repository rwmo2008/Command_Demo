package Demo_Src;
//Code by GeeksForGeeks: https://www.geeksforgeeks.org/command-pattern/

public class Runner {

	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		Stereo stereo = new Stereo();

		System.out.println("You pressed the button to turn on the light.");
		remote.setCommand(new LightOnCommand(light));
		remote.buttonWasPressed();
		System.out.println("You pressed the button to turn on the stereo.");
		remote.setCommand(new StereoOnWithCDCommand(stereo));
		remote.buttonWasPressed();
		System.out.println("You pressed the button to turn off the stereo.");
		remote.setCommand(new StereoOffCommand(stereo));
		remote.buttonWasPressed();
		System.out.println("You pressed the button to turn off the light.");
		remote.setCommand(new LightOffCommand(light));
		remote.buttonWasPressed();
	}

}
