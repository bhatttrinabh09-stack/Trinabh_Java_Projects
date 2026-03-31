import java.util.*;
class P1e
{
	public static void main(String args[])
	{
		float gr;
		System.out.print("Please enter the Marks of  the Student: ");
		Scanner sc = new Scanner(System.in);
		gr = sc.nextFloat();
		if(gr>100 || gr<0)				System.out.println("Enter the correct marks");
		else if(gr>=90)					System.out.println("Grade O");
		else if(gr<90 && gr>=80)		System.out.println("Grade A+");
		else if(gr<80 && gr>=70)		System.out.println("Grade A");
		else if(gr<70 && gr>=60)		System.out.println("Grade B");
		else if(gr<60 && gr>=55)		System.out.println("Grade C");
		else if(gr<55 && gr>=50)		System.out.println("Grade D");
		else if(gr<50 && gr>=40)		System.out.println("Grade P");
		else							System.out.println("Grade F");
	}
}