import java.util.Scanner;
public class q8
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
//max
System.out.print ("enter a number -1 to stop ");
int max = -999999;
int i = max;
while (i != -1)
	{
	String str = System.console().readLine();
	i = Integer.parseInt(str);
	if (i>max)
		{
		max=i;
		}
	System.out.print ("enter another number");
	}
System.out.print (" max is " + max);
}}

