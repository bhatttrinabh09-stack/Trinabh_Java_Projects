import java.util.Scanner;
class P5a {
    public static void main(String args[]){
        Employee e = new Employee();
        e.getEmployee();
        e.showEmployee();
        e.showGrade();
    }
}
class Employee{
    private int empid;
    private float salary;
    private String empname, designation;
    public void getEmployee(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Name of the Employee: ");
        empname = sc.nextLine();
        System.out.print("Enter the ID of the Employee: ");
        empid = sc.nextInt();
        System.out.print("Enter the Salary (in LPA) of the Employee: ");
        salary = sc.nextFloat();
        System.out.print("Enter the Designation of the Employee: ");
        designation = sc.nextLine();
    }
    public void showGrade(){
        if(salary > 12)     System.out.println("Super Dream Package.");
        else if (salary<=12 || salary>8)    System.err.println("Dream Package.");
        else if (salary<=8 || salary>5)    System.err.println("Average Package.");
        else    System.err.println("Below Average Package.");
    }
    public void showEmployee(){
        System.out.println("Employee Details:");
        System.out.println("Name: " + empname);
        System.out.println("ID: " + empid);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}
