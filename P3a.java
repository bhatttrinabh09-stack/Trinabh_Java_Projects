import java.util.*;
class P3a{
	public static void main(String args[]){
		int i;
		char x;
		int upper = 0, lower = 0, space = 0, number = 0, symbol=0;
		Scanner sc = new Scanner(System.in);
			System.out.print("Enter a String: ");
			String str = sc.nextLine();
			for(i=0; i<str.length(); i++){
				x = str.charAt(i);
				if(Character.isUpperCase(x)){
					upper++;
				}
				else if(Character.isLowerCase(x)){
					lower++;
				}
				else if(Character.isDigit(x)){
					number++;
				}
				else if(Character.isWhitespace(x)){
					space++;
				}
				else{
					symbol++;
				}
			}
		System.out.printf("\nThe string has %d uppercase characters, %d lowercase characters, %d numeric characters, %d Symbols and %d spaces", upper, lower, number, symbol, space);
	}
}
