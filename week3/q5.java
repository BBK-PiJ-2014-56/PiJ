import java.util.Scanner;
public class q5
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
//Counting letters
System.out.println("enter a string ");
String str = System.console().readLine();
System.out.println("enter a letter ");
String firstletter = System.console().readLine();
char letter = firstletter.charAt(0);
int len = str.length();
int num = 0;
for (int i = 0; i<len; i++)
	{
	if (str.charAt(i)==letter)
		{
		
		num = num + 1;
		}
	}
System.out.println ("There are " + num + " letter " + letter + "'s");
}}

