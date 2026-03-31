import java.util.*;
class P1a
{
	public static void main(String args[])
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of number:");
		n = sc.nextInt();
		if(n%2 != 0){
			System.out.print("Weird");
		}
		else{
			if(n>=2 && n<=5){
				System.out.print("Not Weird");
			}
			else if(n>=6 && n<=20){
				System.out.print("Weird");
			}
			else{
				System.out.print("Not Weird");
			}
		}
	}
}