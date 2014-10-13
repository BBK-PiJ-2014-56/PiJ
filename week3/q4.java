import java.util.Scanner;
public class q4
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
//line to column
System.out.println ("enter a string ");
String str = System.console().readLine();
int len = str.length();
for (int i = 0; i<len; i++)
	{
	System.out.println (str.charAt(i));
	}
}}

