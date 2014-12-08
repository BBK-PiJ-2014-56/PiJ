public class Comparator<T> {
	//T n;
	//T m;
	public int getMax(T n, T m) {
		if (n > m) {
			return n;
		} else {
			return m;
		}
	}
	/*public double getMax(T n, T m) {
		if (n > m) {
			return n;
		} else {
			return m;
		}
	}*/
	public String getMax(String number1, String number2) {
		int n1 = Integer.parseInt(number1);
		int n2 = Integer.parseInt(number2);
		if (n1 > n2) {
			return number1;
		} else {
			return number2;
		}
	}
	public static void main (String[] args) {
		Comparator C = new Comparator ();
		getMax(1, 2);
	}
}