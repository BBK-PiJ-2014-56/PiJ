import java.util.Scanner;
public class q7
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
//sort
System.out.print ("enter a number");
String str = System.console().readLine();
int i = Integer.parseInt(str);
System.out.print ("enter another number");
String str2 = System.console().readLine();
int j = Integer.parseInt(str2);
System.out.print ("enter another number");
String str3 = System.console().readLine();
int k = Integer.parseInt(str3);
int temp;
if (j<i)
	{
	temp = j;
	j = i;
	i = temp;
	}
if (k<j)
	{
	temp = k;
	k = j;
	j = temp;
	}
if (j<i)
	{
	temp = j;
	j = i;
	i = temp;
	}
if (k<j)
	{
	temp = k;
	k = j;
	j = temp;
	}
	
System.out.print (i + ", " + j + ", "+ k);
}}

