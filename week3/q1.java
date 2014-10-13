import java.util.Scanner;
public class q1
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
//C?alculator
System.out.print ("enter a number ");
String str1 = System.console().readLine();
Double num1 = Double.parseDouble(str1);

System.out.print ("enter another number ");
String str2 = System.console().readLine();
Double num2 = Double.parseDouble(str2);

System.out.print ("Choose 1 for +, 2 for -, 3 for *, 4 for / ");
String str3 = System.console().readLine();
Double num3 = Double.parseDouble(str3);

if (num3 == 1)
	{
	System.out.print (num1+num2);
	}
if (num3 == 2)
	{
	System.out.print (num1-num2);
	}
if (num3 == 3)
	{
	System.out.print (num1*num2);
	}
if (num3 == 4)
	{
	System.out.print (num1/num2);
	}
	
}}

