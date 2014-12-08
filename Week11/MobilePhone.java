public class MobilePhone extends OldPhone{
	public MobilePhone(String brand) {
			super(brand);
	}
	String[] lastnumbers = new String[10];
	//lastnumbers[0] = "1234";
	//lastnumbers[1] = "2";
	//lastnumbers[2] = "3";
	public void ringAlarm(String alarm) {
		System.out.println(alarm);
	}
	public void playGame(String gaming) {
		System.out.println(gaming);
	}
	public void printLastNumbers() {
		System.out.println(lastnumbers[0]);
		System.out.println(lastnumbers[1]);
		System.out.println(lastnumbers[2]);
		System.out.println(lastnumbers[3]);
		System.out.println(lastnumbers[4]);
		System.out.println(lastnumbers[5]);
		System.out.println(lastnumbers[6]);
		System.out.println(lastnumbers[7]);
		System.out.println(lastnumbers[8]);
		System.out.println(lastnumbers[9]);
	}
}