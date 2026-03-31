import java.util.*;
class Student{
	Scanner sc = new Scanner(System.in);
	private String name;
	private long id;
	int i;
	private float maths, phy, chem, total;
	public void getDetails(){
		System.out.print("Enter the name of the Student: ");
		name = sc.nextLine();
		System.out.print("Enter the SAP ID of the student: ");
		id = sc.nextLong();
		System.out.print("Enter the marks of Physics, Chemistry and Mathematics: ");
		phy = sc.nextFloat();
		chem = sc.nextFloat();
		maths = sc.nextFloat();
	}
	public void showDetails(){
		System.out.printf("%-10s %-10d %-10.2f %-10.2f %-12.2f %-10.2f\n", 
			name, id, phy, chem, maths, total);
	}
	public void calculateTotal(){
		total = maths+phy+chem;
	}
	public boolean compareResults(Student so){
			if(total>so.total)		return false;
			return true;
	}
}
class P6a{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int i, j, n;
		System.out.print("Enter the number of Students: ");
		n = sc.nextInt();
		Student s[] = new Student[n];
		Student temp;
		for(i=0; i<n; i++){
			s[i] = new Student();
			s[i].getDetails();	
			s[i].calculateTotal();
		}
		for(i=0; i<n-1; i++){
			for(j=0; j<n-1; j++){
				if(s[j].compareResults(s[j+1])){
					temp = s[j];
					s[j] = s[j+1];
					s[j+1] = temp;
				}
			}
		}
		System.out.printf("%-10s %-10s %-10s %-10s %-12s %-10s\n",
		"Name", "SAP ID", "Physics", "Chemistry", "Mathematics", "Total");

		for (i = 0; i < n; i++) {
    		s[i].showDetails();
		}
	}
}