import java.util.Scanner;
public class q11
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
//Text2Num
System.out.println("enter a number ");
String str = System.console().readLine();

int len = str.length();
System.out.print (str);
for (int i = 0; i<len; i++)
	{
	if (str.charAt(i) == '9' || '8') //'9'||'8'||'7'||'6'||'5'||'4'||'3'||'2'||'1'||'0') 
		{
		
		}
	//System.out.print(str.charAt(len-i-1));
	}
}}

