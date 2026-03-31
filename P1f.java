import java.util.*;
class P1f{
	public static void main(String args[]){
		int i, n;
		float sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of series: ");
		n = sc.nextInt();
		for(i=1; i<=n; i++)		sum = sum + (1.0f/(i*i));
		System.out.println("Sum of the Series is " + sum);
	}		
}