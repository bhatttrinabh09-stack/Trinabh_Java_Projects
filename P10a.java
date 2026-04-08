import java.util.*;
class A{
	private int x;
	public void display(int a){
		x = a;
		System.out.println("x= " + x);
	}
}
class B extends A{
	private int y;
	public void display(int a){
		y = a;
		System.out.println("y= " + y);
	}
}
class P10a{
	public static void main(String args[]){
		A a = new A();
		B b = new B();
		A a1;
		Scanner sc = new Scanner(System.in);
		System.out.print("1.A\n2.B\nEnter a choice: ");
		int i = sc.nextInt();
		if(i==1)	a1 = a;
		else		a1 = b;
		a1.display(18);
	}
}
		