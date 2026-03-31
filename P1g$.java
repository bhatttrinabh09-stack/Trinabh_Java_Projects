import java.util.*;
class P1g${
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n,i,j;
		char ch='A';
		System.out.println("Rows : ");
		n=sc.nextInt();
		for(i=1; i<=n; i++){
			if(i%2 == 1){
				for(j=1; j<=i; j++){
					System.out.print(j+ " ");
				}
			}
			else{
				for(j=i; j>=1; j--){
					System.out.print(j+ " ");
				}
			}
			System.out.println();
		}
	}
}