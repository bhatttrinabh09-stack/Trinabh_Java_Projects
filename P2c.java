import java.util.*;
public class P2c {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number of rows: ");
	int rows = sc.nextInt();
	int[][] jaggedArray = new int[rows][];
	for (int i = 0; i < rows; i++) {
		jaggedArray[i] = new int[i + 1];
		for (int j = 0; j <= i; j++) {
			jaggedArray[i][j] = j + 1;
		}
	}
	for (int i = 0; i < rows; i++) {
		for (int j = 0; j < jaggedArray[i].length; j++) {
			System.out.print(jaggedArray[i][j] + " ");
		}
		System.out.println();
	}
	}
}