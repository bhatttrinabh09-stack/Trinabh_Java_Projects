import java.util.*;
class P2$${
	public static void main(String args[]){
		int i, n, j, temp;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter values in array: ");
		for(i=0; i<n; i++)		arr[i] = sc.nextInt();
		for(i=0; i<=n-2; i++){
			for(j=0; j<=n-2; j++){
				if(arr[j]>arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted array is: ");
		for(int m : arr){
			System.out.println(m);
		}
	}
}
		