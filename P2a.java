import java.util.*;
class P2a{
	public static void main(String args[]){
		int i, n, j;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		n = sc.nextInt();
		int arr[] = new int[n];
		int sum[] = new int[n];
		System.out.print("Enter values in array: ");
		for(i=0; i<n; i++)		arr[i] = sc.nextInt();
		for(i=0; i<n; i++){
			sum[i] = 0;
			for(j=0; j<n; j++){
					if(i == j)		continue;
					sum[i] = sum[i] + arr[j];
			}
		}
		System.out.println("Sum array is: ");
		for(int m : sum)	System.out.println(m);
	}
}