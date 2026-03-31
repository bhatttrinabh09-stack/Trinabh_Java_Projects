import java.util.*;
class A{
	private int x;
	public A(){
	}
	public A(int y){
		x = y;
	}
	public void display(){
		System.out.println(x);
	}
	public A compare(A a){
		if(a.x > x)		return a;
		else 		        return this;
	}
}
class P6a${
	public static void main(String args[]){
		int z;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value: ");
		z = sc.nextInt();
		A a1 = new A(z);
		System.out.print("Enter a value: ");
		z = sc.nextInt();
		A a2 = new A(z);
		A a3 = a1.compare(a2);
		a3.display();
	}
}