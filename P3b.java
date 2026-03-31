import java.util.*;
class P3b{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str1 = sc.nextLine();
		int len = str1.length();
		System.out.print("Enter another string: ");
		String str2 = sc.nextLine();
		String copy = str1;
		String str_upp = str1.toUpperCase();
		String str_cat = str2.concat(str1);
		System.out.println("Lenght of string is " + len);
		System.out.println("Real string is " + copy);
		System.out.println("Upeercased string is " + str_upp);
		System.out.println("Concatenated string is " + str_cat);
	}
}