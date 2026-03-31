import java.util.*;
class P4a{
	public static void main(String args[]){
		Vector<String> v = new Vector<>();
		int i;
		for(i = 0; i<args.length; i++){
			v.addElement(args[i]);
		}
		for(i=0; i<v.size() ; i++){
			System.out.println(v.elementAt(i));
		}
	}
}