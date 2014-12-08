public class PhoneLauncher {
	public static void main(String[] args) {
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	public void launch() {
		// your code creating and using SmartPhone here...
		MobilePhone p1 = new SmartPhone("Apple");
		//p1.browseWeb("Google");
		//p1.findPosition();
		p1.printLastNumbers();
		p1.call("12345");
		p1.call("0012345");
		p1.ringAlarm("alarm");
		p1.playGame("snake");
		Phone p2 = new OldPhone("OldPhone");
		p2.call("12345");
		RestrictedSmartPhone p3 = new RestrictedSmartPhone("Android");
		p3.playGame("snake2");
		testPhone(p1);
	}
	public void testPhone(Phone p1) {
		//p1.browseWeb("Google");
		//p1.findPosition();
		//p1.printLastNumbers();
		p1.call("12345");
		p1.call("0012345");
		//p1.ringAlarm("alarm");
		//p1.playGame("snake");
	}
}