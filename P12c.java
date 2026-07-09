import java.util.*;
class ZeroDivisorException extends Exception {
    ZeroDivisorException(String message) {
        super(message);
    }
}
public class P12c{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter numerator: ");
            int num = sc.nextInt();
            System.out.print("Enter divisor: ");
            int divisor = sc.nextInt();
            if (divisor == 0) {
                throw new ZeroDivisorException("Divisor cannot be zero!");
            }
            int result = num / divisor;
            System.out.println("Result = " + result);
        }
        catch (ZeroDivisorException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Caught");
            System.out.println(e);
        }
        finally {
            System.out.println("Program terminated successfully.");
        }
    }
}