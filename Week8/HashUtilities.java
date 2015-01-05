
public class HashUtilities {
	public static int shortHash(int i) {
		int j = Math.abs(i);
		j = j%1000;
		return j;
	}

	public static void main(String[] args) {
		System.out.println("Give me a string and I will calculate its hash code");
		String str = System.console().readLine();
		int hash = str.hashCode();
		int smallHash = HashUtilities.shortHash(hash);
		System.out.println("0 < " + smallHash + " < 1000");
	}
}