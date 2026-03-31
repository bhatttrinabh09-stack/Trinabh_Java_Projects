import java.util.*;
class P2${
	public static void main(String args[]){
		int n, i, x, index;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		n = sc.nextInt();
		index = n+1;
		int arr[] = new int[n];
		System.out.print("Enter values in array: ");
		for(i=0; i<n; i++)		arr[i] = sc.nextInt();
		System.out.print("Enter the element to be searched: ");
		x = sc.nextInt();
		for(i=0; i<n; i++){
			if(arr[i] == x){		
				index =i;
				break;
			}
		}
		if(index<n)	System.out.println("Element is found at " + index);
		else			System.out.println("Element not found");
	}
}