import java.util.*;
class P1b1
{
	public static void main(String args[])
	{
		//Using nested if-else statement
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Three Numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if(a>b){
			if(a>c) 	System.out.println(a + " is Greatest");
			else		System.out.println(c + " is Greatest");
		}
		else{
			if(b>c)	System.out.println(b + " is Greatest");
			else		System.out.println(c + " is Greatest");
		}
	}
}