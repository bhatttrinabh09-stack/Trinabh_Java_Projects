import java.util.*;
class Staff{
    protected long code;
    protected String name;
}
class Teacher extends Staff{
    private String sub;
    private int exp;
    public void readTeacher(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        name = sc.nextLine();
        System.out.print("Enter SAP ID: ");
        code = sc.nextLong();
        sc.nextLine();
        System.out.print("Enter the Subject taught: ");
        sub = sc.nextLine();
        System.out.print("Enter the years of Experience: ");
        exp = sc.nextInt();
    }
    public void displayTeacher(){
        System.out.println("\nName:" + name + 
                        "\nSAP ID:" + code + 
                        "\nSubject:" + sub + 
                        "\nExperience:" + exp);
    }
}
class Typist extends Staff{
    protected float speed;
    protected int exp;
}
class Regular extends Typist{
    private int sal;
    public void readTypistRegular(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        name = sc.nextLine();
        System.out.print("Enter SAP ID: ");
        code = sc.nextLong();
        sc.nextLine();
        System.out.print("Enter the Speed of Typing(WPM): ");
        speed = sc.nextFloat();
        System.out.print("Enter the years of Experience: ");
        exp = sc.nextInt();
        System.out.print("Enter the Salary(Monthly): ");
        sal = sc.nextInt();
    }
    public void displayTypistRegular(){
        System.out.println("\nName:" + name + 
                        "\nSAP ID:" + code + 
                        "\nSpeed(WPM):" + speed + 
                        "\nExperience:" + exp +
                        "\nSalary(Monthly):" + sal);
    }
}
class Casual extends Typist{
    private int daily_wages;
    public void readTypistCasual(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        name = sc.nextLine();
        System.out.print("Enter SAP ID: ");
        code = sc.nextLong();
        sc.nextLine();
        System.out.print("Enter the Speed of Typing(WPM): ");
        speed = sc.nextFloat();
        System.out.print("Enter the years of Experience: ");
        exp = sc.nextInt();
        System.out.print("Enter the Salary(Daily): ");
        daily_wages = sc.nextInt();
    }
    public void displayTypistCasual(){
        System.out.println("\nName:" + name + 
                        "\nSAP ID:" + code + 
                        "\nSpeed(WPM):" + speed + 
                        "\nExperience:" + exp +
                        "\nDaily Wages(Daily):" + daily_wages);
    }
}
class Officer extends Staff{
    private String dept;
    private String grade;
    public void readOfficer(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        name = sc.nextLine();
        System.out.print("Enter SAP ID: ");
        code = sc.nextLong();
        sc.nextLine();
        System.out.print("Enter the Department: ");
        dept = sc.nextLine();
        sc.nextLine();
        System.out.print("Enter the Grade of Officer: ");
        grade = sc.nextLine();
    }
    public void displayOfficer(){
        System.out.println("\nName:" + name + 
                        "\nSAP ID:" + code + 
                        "\nDepartment:" + dept + 
                        "\nGrade:" + grade);
    }
}
class P8c{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose one of the options: \n 1->Teacher\n 2->Regular Typist\n 3->Casual Typist\n 4-> Officer");
        int i = sc.nextInt();
        switch(i){
            case 1:
                Teacher t = new Teacher();
                t.readTeacher();
                t.displayTeacher();
                break;
            case 2:
                Regular r = new Regular();
                r.readTypistRegular();
                r.displayTypistRegular();
                break;
            case 3:
                Casual c = new Casual();
                c.readTypistCasual();
                c.displayTypistCasual();
                break;
            case 4:
                Officer o = new Officer();
                o.readOfficer();
                o.displayOfficer();
                break;
            default:
                System.out.print("\nPlease enter the correct Options.");
        }
    }
}