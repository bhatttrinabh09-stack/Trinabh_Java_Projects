import java.util.*;
class P1g{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n,i,j;
		char ch='A';
		System.out.println("Rows : ");
		n=sc.nextInt();
		for(i=1;i<=n;i++){
			for(j=i;j<=n-1;j++){
				System.out.print(" ");
			}
			char k=ch;
			for(j=1;j<=i;j++){
				System.out.print(k--);
			}
			ch+=(i+1);
			System.out.println();
		}
	}
}