import java.util.*;
class Student{
	protected int rollno;
	public void read(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Roll No.: ");
		rollno = sc.nextInt();
	}
}
class Test extends Student{
	protected int sem1_marks, sem2_marks;
	public void read(){
		Scanner sc = new Scanner(System.in);
		super.read();
		System.out.print("Enter the Semester 1 Marks: ");
		sem1_marks = sc.nextInt();
		System.out.print("Enter the Semester 2 Marks: ");
		sem2_marks = sc.nextInt();
	}
}
interface Sports{
	void score();
	int sports_marks = 10;
}
class Result extends Test implements Sports{
	private int i;
	private float total;
	public void score(){
		System.out.print("If sports is taken, enter 1, else enter 2: ");
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();
		if(i == 1){
			total = ((sem1_marks + sem2_marks + sports_marks)/200.0f)*100;
		}
		else{
			total = ((sem1_marks + sem2_marks)/200.0f)*100;
		}
	}
	public void display(){
		if(i==1){
			System.out.print("\nRoll No.: " + rollno + "\nScore: " + total +"%");
		}
		else{
			System.out.print("\nRoll No.: " + rollno + "\nScore: " + total +"%");
		}
	}
}
class P9b{
	public static void main(String args[]){
		Result r = new Result();
		r.read();
		r.score();
		r.display();
	}
}
		
		
	