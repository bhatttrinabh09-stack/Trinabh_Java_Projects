
class Start {
    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);
        long sum = 0;
        while(n!=0){
            long rem = n%10;
            sum = sum + rem;
            n = n/10;
        }
        System.out.print("Sum of the digits is " + sum);
    }
}
