import java.util.Scanner;
public class q3
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
//change
System.out.println ("cost of item in pennies ");
String str1 = System.console().readLine();
int cost = Integer.parseInt(str1);

System.out.println ("money passed over in pennies ");
String str2 = System.console().readLine();
int money = Integer.parseInt(str2);

int change = 0;

while (cost > money)
	{
	System.out.println ("more money needed ");
	String str3 = System.console().readLine();
	int more = Integer.parseInt(str3);
	money = money + more;
	}
	
if (money - cost >= 5000)
	{
	int fiftys = (money - cost) / 5000;
	System.out.println ("give " + fiftys + " fifty pound notes");
	money = money - (fiftys * 5000);
	}
if (money - cost >= 2000)
	{
	int twentys = (money - cost) / 2000;
	System.out.println ("give " + twentys + " twenty pound notes");
	money = money - (twentys * 2000);
	}
if (money - cost >= 1000)
	{
	int tens = (money - cost) / 1000;
	System.out.println ("give " + tens + " ten pound notes");
	money = money - (tens * 1000);
	}
if (money - cost >= 500)
	{
	int fives = (money - cost) / 500;
	System.out.println ("give " + fives + " five pound notes");
	money = money - (fives * 500);
	}
if (money - cost >= 100)
	{
	int ones = (money - cost) / 100;
	System.out.println ("give " + ones + " one pound coins");
	money = money - (ones * 100);
	}
if (money - cost >= 50)
	{
	int fifty = (money - cost) / 50;
	System.out.println ("give " + fifty + " fifty pence coins");
	money = money - (fifty * 50);
	}
if (money - cost >= 20)
	{
	int twenty = (money - cost) / 20;
	System.out.println ("give " + twenty + " twenty pence coins");
	money = money - (twenty * 20);
	}
if (money - cost >= 10)
	{
	int ten = (money - cost) / 10;
	System.out.println ("give " + ten + " ten pence coins");
	money = money - (ten * 10);
	}
if (money - cost >= 5)
	{
	int five = (money - cost) / 5;
	System.out.println ("give " + five + " five pence coins");
	money = money - (five * 10);
	}
if (money - cost >= 2)
	{
	int two = (money - cost) / 2;
	System.out.println ("give " + two + " two pence coins");
	money = money - (two * 2);
	}
if (money - cost >= 1)
	{
	int one = (money - cost) / 1;
	System.out.println ("give " + one + " one pence coins");
	money = money - (one * 1);
	}
}}

