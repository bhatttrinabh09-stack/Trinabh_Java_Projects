import java.util.*;
class P4c{
	public static void main(String args[]){
		Vector<Integer> v = new Vector<>();	
		Scanner sc = new Scanner(System.in);	
		int i;
		System.out.println("Enter the marks.");
		for(i=0; i<5; i++){
			System.out.print("Enter the marks of " + (i+1) + ":");
			v.addElement(sc.nextInt());
		}
		for(i=0; i<v.size(); i++){
			System.out.println(v.elementAt(i));
		}
		System.out.println("Size of vector " + v.size());
		System.out.println("Capacity of vector " + v.capacity());
		System.out.print("Enter the index where marks are to be added: ");
		int j = sc.nextInt();
		System.out.print("Enter the marks to be added at " + j + " index of vector: ");
		int marks = sc.nextInt();
		v.insertElementAt(marks, j);
		System.out.print("Enter the index where marks are to be removed: ");
		int k = sc.nextInt();
		v.removeElementAt(k);
		System.out.print("Enter the marks to be checked: ");
		int mark_check = sc.nextInt();
		if(v.contains(mark_check)){
			System.out.print("Vector contains " + mark_check);
			}
		else
			System.out.print("Vector doesn't contains " + mark_check);
		System.out.println("The first element of Vector is " + v.firstElement());
		System.out.println("The last element of Vector is " + v.lastElement());
		for(i=0; i<v.size(); i++){
			System.out.println(v.elementAt(i));
		}
	}
}