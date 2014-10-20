import java.util.Scanner;
public class q3
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
//import mathpow.*

//doubles interest
System.out.println("how much have you borrowed? ");
String str = System.console().readLine();
double borrowed = Double.parseDouble(str);

System.out.println("what is the interest rate? ");
String str1 = System.console().readLine();
double rate = Double.parseDouble(str1);

System.out.println("how many years do you want to repay it over? ");
String str2 = System.console().readLine();
double years = Double.parseDouble(str2);

System.out.println (totalToBePaid(borrowed, rate, years));
System.out.println (totalToBePaidEachYear(borrowed, rate, years));
System.out.println (yearsBeforeInterestPaid(borrowed, rate, years));

} private static double totalToBePaid(double borrowed, double rate, double years)
	{
	double total = borrowed * (Math.pow((1+(rate/100)), years));
	return total;
	}

 private static double totalToBePaidEachYear(double borrowed, double rate, double years)
	{
	double eachYear = totalToBePaid(borrowed, rate, years)/years;
	return eachYear;
	}

 private static int yearsBeforeInterestPaid(double borrowed, double rate, double years)
	{
	int yearsBeforeIntPaid = (totalToBePaid(borrowed, rate, years) - borrowed) / totalToBePaidEachYear(borrowed, rate, years);
	return yearsBeforeIntPaid;
	}






























/*int len = str.length();System.out.print (str);
for (int i = 0; i<len; i++)
	{
	if (str.charAt(i) == '9' || str.charAt(i) == '8') //'9'|| '8'||'7'||'6'||'5'||'4'||'3'||'2'||'1'||'0') 
		{
		
		}
	//System.out.print(str.charAt(len-i-1));
	}*/
}

