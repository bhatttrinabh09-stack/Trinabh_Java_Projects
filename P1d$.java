class P1d$
{
	public static void main(String args[])
	{
		float a, b;
		op = args[1].charAt(0)
		a = Float.parseFloat(args[0]);
		b = Float.parseFloat(args[2]);
		switch(op){
			case '+': 
				System.out.printf("Addition=%.2f", (a+b));
				break;
			case '-': 
				System.out.printf("Subtraction=%.2f", (a-b));
				break;
			case '*': 
				System.out.printf("Multiplication=%.2f", (a*b));
				break;
			case '/': 
				System.out.printf("Quotient=%.2f", (a/b));
				break;
			case '%': 
				System.out.printf("Remainder=%.2f", (a%b));
				break;
			default:
				System.out.printf("Enter the correct Operator.");
		}		
	}
}