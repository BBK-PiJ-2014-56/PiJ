import java.util.Scanner;
public class q8
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
//Palindrome
System.out.println("enter a string ");
String str = System.console().readLine();

int len = str.length();
boolean pal = true;

for (int i = 0; i<len; i++)
	{
	if (str.charAt(i)!=str.charAt(len-i-1))
		{
		pal = false;
		}
	}
if (pal == true)
	{
	System.out.println ("palindrome");
	}
else
	{
	System.out.println ("not a palindrome");
	}
}}

