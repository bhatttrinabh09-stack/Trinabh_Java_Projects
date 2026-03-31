import java.io.*;
class P1h{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the lenght of pattern");
		int n = Integer.parseInt(br.readLine());
		int i, j;
		char ch='A';
		for(i=1; i<=n; i++){
			for(j=1; j<=i; j++){
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
	}
}










