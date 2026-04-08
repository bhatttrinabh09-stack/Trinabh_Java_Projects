import java.util.*;
class Student{
    protected String name;
    protected int rollno;
    Scanner sc = new Scanner(System.in);
    Student(){
        System.out.print("Enter the Name of the Student: ");
        name = sc.nextLine();
        System.out.print("Enter the Roll No.: ");
        rollno = sc.nextInt();
        sc.nextLine();
    }
    public void display(){
        System.out.print("\nName: " + name + "\nRoll No.: " + rollno);
    }
}
class Exam extends Student{
    private float cgpa;
    Exam(){
        super();
        System.out.print("Enter the CGPA: ");
        cgpa = sc.nextFloat();
        sc.nextLine();
    }
    public void display(){
        super.display();
        System.out.print("\nC.G.P.A.: " + cgpa);
    }
}
class P8b${
    public static void main(String[] args) {
        Exam e = new Exam();
        e.display();
    }
}