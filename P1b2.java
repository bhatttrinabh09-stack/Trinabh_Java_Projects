import java.util.*;
import java.lang.*;
class P1b2
{
	public static void main(String args[])
	{
		int a, b, c, large;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Three Numbers ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		large = (a>b)? a:b;
		large = (large>c)? large:c;
		System.out.println(large + " is the Greatest");
	}
}