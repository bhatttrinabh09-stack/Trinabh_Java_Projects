import java.util.*;
abstract class Shape{
	protected float area;
	abstract public void getData();
	abstract public void calArea();
	public void displayArea(){
		System.out.print("Area: " + area);
	}
}
class Circle extends Shape{
	private float r;
	public void getData(){
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the Radius of the Circle: ");
		r = sc.nextFloat();
	}
	public void calArea(){
		area = 3.142f * r * r;
	}
}
class Triangle extends Shape{
	private float h, b;
	public void getData(){
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the Base and Height of the Triangle: ");
		b = sc.nextFloat();
		h = sc.nextFloat();
	}
	public void calArea(){
		area = 0.5f * b * h;
	}
}
class Rectangle extends Shape{
	private float l, br;
	public void getData(){
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the Breadth and Length of the Rectangle: ");
		br = sc.nextFloat();
		l = sc.nextFloat();
	}
	public void calArea(){
		area = br * l;
	}
}
class P11a{
	public static void main(String args[]){
		Circle c = new Circle();
			c.getData();
			c.calArea();
			c.displayArea();
		Rectangle r = new Rectangle();
			r.getData();
			r.calArea();
			r.displayArea();
		Triangle t = new Triangle();
			t.getData();
			t.calArea();
			t.displayArea();
	}
}