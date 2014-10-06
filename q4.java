import java.util.Scanner;
public class q4
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
//prime
System.out.print ("enter a number");
String str = System.console().readLine();
int i = Integer.parseInt(str);
int divisor = 2;
boolean flag = false;
while (i>divisor)
	{
	if (i%divisor == 0)
		{
		System.out.print ("not prime");
		flag = true;
		break;
		}
	divisor++;
	}
if (flag == false)
	{
	System.out.print ("prime");
	}
	
}}

