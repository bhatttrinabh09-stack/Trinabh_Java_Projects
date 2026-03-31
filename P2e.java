import java.util.*;
class P2e{
	public static void main(String args[]){
		int r1, r2, c1, c2, i, j, k;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of Rows for Matrix A: ");
		r1 = sc.nextInt();
		System.out.print("Enter number of Coloumns for Matrix A: ");
		c1 = sc.nextInt();
		System.out.print("Enter number of Rows for Matrix B: ");
		r2 = sc.nextInt();
		System.out.print("Enter number of Coloumns for Matrix B: ");
		c2 = sc.nextInt();
		int a[][] = new int[r1][c1];
		int b[][] = new int[r2][c2];
		System.out.println("Enter the values in Matrix A: ");
		for(i=0; i<r1; i++){
			for(j=0; j<c1; j++){
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the values in Matrix B: ");
		for(i=0; i<r2; i++){
			for(j=0; j<c2; j++){
				b[i][j] = sc.nextInt();
			}
		}
		if(r1 == r2 && c1==c2){
			int c[][] = new int[r1][c1];
			for(i=0; i<r1; i++){
				for(j=0; j<c1; j++){
					c[i][j] = a[i][j]+b[i][j];
				}
			}
			System.out.println("Matrix A is: ");
			for(i=0; i<r1; i++){
				for(j=0; j<c1; j++){
					System.out.printf("%d\t", a[i][j]);
				}
				System.out.println();	
			}
			System.out.println("Matrix B is: ");
			for(i=0; i<r2; i++){
				for(j=0; j<c2; j++){
					System.out.printf("%d\t", b[i][j]);
				}
				System.out.println();	
			}
			System.out.println("Added Matrix C is: ");
			for(i=0; i<r1; i++){
				for(j=0; j<c2; j++){
					System.out.printf("%d\t", c[i][j]);
				}
				System.out.println();	
			}
		}
		else		System.out.println("Adddition is not possible");
	}
}

