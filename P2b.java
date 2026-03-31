import java.util.*;
class P2b{
	public static void main(String args[]){
		int n=5, i, maxin=0;
		float max;
		int[]roll=new int[10];
		float[]s1=new float[10];
		float[]s2=new float[10];
		float[]s3=new float[10];
		float[]marks=new float[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 Student's data:\nRoll number Subject 1(Marks) Subject 2(Marks) Subject 3(Marks)");
		for(i=0;i<n;i++){
			roll[i]=sc.nextInt();
			s1[i]=sc.nextFloat();
			s2[i]=sc.nextFloat();
			s3[i]=sc.nextFloat();
		}
		for(i=0;i<n;i++){
			marks[i]=s1[i]+s2[i]+s3[i];
		}
		max=marks[0];
		for(i=0;i<n;i++){
			if (marks[i]>max){
				max=marks[i];
			}
		}
		for(i=0;i<n;i++){
			if(max==marks[i]){
				maxin=i;
			}
		}
		for(i=0;i<n;i++){
			System.out.println(roll[i]+" Scored: "+marks[i]);
		}
		System.out.println("\nRoll Number of student who got highest total marks is "+roll[maxin]);
	}
}