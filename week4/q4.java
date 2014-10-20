import java.util.Scanner;
public class q4
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
//binary and decimal

System.out.println("Choose 1 for binary2decimal or 2 for decimal2binary");

String c = System.console().readLine();
int choice = Integer.parseInt(c);

if (choice == 1)
	{
	System.out.println(binary2decimal());
	}
	
if (choice == 2)
	{
	System.out.println(decimal2binary());
	}

} private static int binary2decimal()
	{
	System.out.println("enter a binary number ");
	String binary = System.console().readLine();
	int bin = Integer.parseInt(binary);
	int len = binary.length();
	int total = 0;

	for (int i = 0; i<len; i++)
		{
		int base = Integer.parseInt(binary.substring(i, i+1));
		double binpow = Math.pow((2 * base), (len-i-1));
		total = total + (int)binpow;
		}

	return total;
	}

static String decimal2binary()
	{
	System.out.println("enter a decimal number ");
	String decimal = System.console().readLine();
	int dec = Integer.parseInt(decimal);
	String binaryNo = "";
	
	while (dec>0)
		{
		binaryNo = dec%2+binaryNo;
		dec = dec/2;
		}
	return binaryNo;
	}
	
	
}

