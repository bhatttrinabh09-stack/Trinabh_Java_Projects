class P3${
	public static void main(String args[]){
		String s1 = "Java";
		String s2 = "Java";
		String s3 = new String("Java");
		String s4 = new String("Java");
		if( s1 == s2 )		System.out.println("Y");
		else		System.out.println("N");
		if( s3 == s4 )		System.out.println("Y");
		else		System.out.println("N");
		if( s1 == s3 )		System.out.println("Y");
		else		System.out.println("N");
	}
}