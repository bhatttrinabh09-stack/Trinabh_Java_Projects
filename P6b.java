import java.util.*;
class Complex{
	Scanner sc = new Scanner(System.in);
	private float real, img;
	public void getData(){
		System.out.print("Enter the real part: ");
		real = sc.nextFloat();
		System.out.print("Enter the imaginary part: ");
		img = sc.nextFloat();
	}
	public Complex addComplex(Complex c){
		Complex a = new Complex();
		a.real = c.real+this.real;
		a.img = c.img+this.img;
		return a;
	}
	public Complex subtractComplex(Complex c){
		Complex s = new Complex();
		s.real = c.real-this.real;
		s.img = c.img-this.img;
		return s;
	}
	public Complex multiplyComplex(Complex c){
		Complex m = new Complex();
		m.real = (c.real*this.real) - (c.img*this.img);
		m.img = (c.real*this.img) + (c.img*this.real);
		return m;
	}
	public Complex divideComplex(Complex c){
		Complex d = new Complex();
		d.real = (((this.real*c.img) + (this.img*c.img))/((c.real*c.real) + (c.img*c.img)));
		d.img = (((this.img*c.real) - (this.real*c.img))/((c.real*c.real) + (c.img*c.img)));
		return d;
	}
	public void displayResults (){
		System.out.printf("Result is %.2f + i(%.2f)\n", real, img);
	}
}
class P6b{
	public static void main(String args[]){
		Complex c1 = new Complex();
		Complex c2 = new Complex();
		Complex c3 = new Complex();
		c1.getData();
		c2.getData();
		System.out.println("Addition");
		c3 = c1.addComplex(c2);
		c3.displayResults();
		System.out.println("Subtraction");
		c3 = c1.subtractComplex(c2);
		c3.displayResults();
		System.out.println("Multiplication");
		c3 = c1.multiplyComplex(c2);
		System.out.println("Division");
		c3 = c1.divideComplex(c2);
		c3.displayResults();
	}
}