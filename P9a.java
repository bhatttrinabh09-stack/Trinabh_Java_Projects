import java.util.*;
interface Rev{
	public String reversal(String s);
}
class ReverseString implements Rev{
	private String s, str="";
	public String reversal(String s){
		for(int i = s.length()-1; i>=0; i--){
			str = str + s.charAt(i);
		}
		return str;
	}
}
class P9a{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		ReverseString rs = new ReverseString();
		System.out.print("Enter a String: ");
		String str = sc.nextLine();
		str = rs.reversal(str);
		System.out.print("Reversed String is " + str);
	}
}