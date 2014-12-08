public class SmartPhone extends MobilePhone{
	public SmartPhone(String brand) {
		super(brand);
	}
	public void browseWeb(String address) {
		System.out.println(address);
	}
	public void findPosition() {
		System.out.println("right here");
	}
	public void call(String number) {
		if (number.charAt(0)=='0' && number.charAt(1)=='0') {
			System.out.println("Calling " + number + " through the internet to save money");
		} else {
			super.call(number);
		}
	}
	/*public void playGame(String gaming) {
			System.out.println(gaming);
	}*/

	/*
	protected void playGame(String gaming) {
			super.playGame(gaming);
	}
*/
}