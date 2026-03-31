import java.util.*;
import java.lang.*;
class P1d
{
	public static void main(String args[])
	{
		int a, b;
		char op;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the two Numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.print("Enter the Operator {+, -, *, /, %}");
		op = sc.next().charAt(0);
		switch(op){
			case '+': 
				System.out.println("Addition= " + (a+b));
				break;
			case '-': 
				System.out.println("Subtraction= " + (a-b));
				break;
			case '*': 
				System.out.println("Multiplication= " + (a*b));
				break;
			case '/': 
				System.out.println("Quotient= " + (a/b));
				break;
			case '%': 
				System.out.println("Remainder= " + (a%b));
				break;
			default:
				System.out.println("Enter the correct Operator.");
		}		
	}
}