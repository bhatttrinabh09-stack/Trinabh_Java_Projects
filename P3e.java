import java.util.*;
class P3e{
	public static void main(String args[]){
		String s1 = "Java";
		String s2 = "Java";
		String s3 = new String("Java");
		String s4 = new String("Java");
		if(s1 == s2)		System.out.println("Yes");
		else				System.out.println("No");
		if(s3 == s4)		System.out.println("Yes");
		else				System.out.println("No");
		if(s1.equals(s2))	System.out.println("Yes");
		else				System.out.println("No");
		if(s3.equals(s4))	System.out.println("Yes");
		else				System.out.println("No");
	}
}
