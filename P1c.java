class P1c{
	public static void main(String args[]){
		long n, count=0;
		n = Long.parseLong(args[0]);
		while(n != 0){
			n = n/10;
			count++;
		}
		System.out.println("The number has " +count+ " digits");
	}
}