public class Add {
	public static int Add(int a, int b) {
		int c = a + b;
		return c;
	}

	public static void main(String[] args) {
		System.out.println("Give me a 2 numbers and I will add them");
		System.out.println("Number 1");
		String str1 = System.console().readLine();
		int a = Integer.parseInt(str1);
		System.out.println("Number 2");
		String str2 = System.console().readLine();
		int b = Integer.parseInt(str2);

		System.out.println(Add(a,b));
	}
}