import java.util.Scanner;
public class q5
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
//multiply
System.out.print ("enter a number");
String str = System.console().readLine();
int i = Integer.parseInt(str);
System.out.print ("enter another number");
String str2 = System.console().readLine();
int j = Integer.parseInt(str2);
System.out.print ("the answer is " + 
i*j);
}}

