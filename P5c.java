import java.util.*;
class P5c{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        float x = sc.nextFloat();
        System.out.print("Enter a number raised to (only Whole Numbers): ");
        int n = sc.nextInt();
        System.out.printf("%f^%d equals to %.4f", x, n, expo(x, n));
    }
    public static float expo(float x, int n){
        if(n == 0)
            return 1.0f;
        else if(n == 1)
            return x;
        else 
            return (x*expo(x, n-1));
    }
}