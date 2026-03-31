import java.util.*;
class P3c{
	public static void main(String args[]){
		String str, str_copy;
		StringBuffer sb = new StringBuffer();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		str = sc.nextLine();
		sb.append(str);
		sb.reverse();
		str_copy = sb.toString();
		if(str.equals(str_copy))		System.out.println("The String is a Palindrome");
		else 							System.out.println("The String is not a Palindrome");
	}
}