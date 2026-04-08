import java.util.*;
class Interest{
	final protected float roi = 9.5f;
	protected float p, n, in;
	final public void accept(){
		Scanner sc = new Scanner(System.in);
		System.out.println("For Rate of Interest as 9.5%, ");
		System.out.print("Enter the Principal Amount: ");
		p = sc.nextFloat();
		System.out.print("Enter the Number of years: ");
		n = sc.nextFloat();
	}
	final public void display(){
		System.out.println("\nInterst is " + in");
	}
}
class Simple extends Interest{
	public void calculate(){
		in = p*n*r/100;
	}
}
class Compound extends Interest{
	public void calculate(){
		in = (float)(p*Math.pow(1+roi/100, n)) - p;
	}
}
class P10b{
	public static void main(String args[]){
		Simple s = new Simple();
		Compound c = new Compound();
		s.accept();
		s.calculate();
		s.display();
		c.accept();
		c.calculate();
		c.display();
	}
}