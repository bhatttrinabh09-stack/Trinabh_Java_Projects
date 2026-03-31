import java.util.*;
class P4b{
	public static void main(String args[]){
		Vector<String> v = new Vector<>();	
		Scanner sc = new Scanner(System.in);	
		int i;
		for(i = 0; i<args.length; i++){
			v.addElement(args[i]);
		}
		System.out.print("Enter a new String: ");
		String str = sc.next();
			if(v.contains(str)){
				v.remove(str);
			}
			else
				v.addElement(str);
		for(i=0; i<v.size(); i++){
			System.out.println(v.elementAt(i));
		}	
	}
}