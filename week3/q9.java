import java.util.Scanner;
public class q9
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
//Palindrome
System.out.println("enter a string ");
String str = System.console().readLine();

int len = str.length();
boolean pal = true;
System.out.print (str);
for (int i = 0; i<len; i++)
	{
	System.out.print(str.charAt(len-i-1));
	}
}}

