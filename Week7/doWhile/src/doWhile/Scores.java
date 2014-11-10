package doWhile;
import java.util.Scanner;
public class Scores {
	private static int counter = -1;
	private static int fail = 0;
	private static int pass = 0;
	private static int distinction = 0;
	private static int undefined = 0;
	public static void markAdder(){
		int mark = 0;
		System.out.println("Enter Marks end with -1");
		do {
		System.out.println("Input a mark: ");
		Scanner in = new Scanner(System.in);
		mark = in.nextInt();
		//String str = System.console().readLine();
		//1mark = Integer.parseInt(str);		
		getGrade(mark);
		counter ++;
		} while (mark != -1);
		System.out.println("there are " + counter + " students: " + distinction + " distinctions, " + pass + " pass, " + fail + " fails (plus " + undefined + " invalid)");
	}
	public static void getGrade(int mark){
		if (0 <= mark && mark < 50) {
			//return "fail";
			fail++;
		}
		if (50 <= mark && mark < 70) {
			//return "pass";
			pass++;
		}
		if (70 <= mark && mark <= 100) {
			//return "distinction";
			distinction++;
		}
		if (-1 > mark || mark > 100) {
			//return "undefined";
			undefined++;
		}
	}

	public static void main(String[] args) {
		markAdder();
	}

}
