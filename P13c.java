import java.util.*;
class SumThread extends Thread {
    int n;
    int sum = 0;
    SumThread(int n) {
        this.n = n;
    }
    public void run() {
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Child thread calculated the sum.");
    }
}
class P13c {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        SumThread t = new SumThread(n);
        t.start();
        try {
            t.join();
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Sum of first " + n + " natural numbers = " + t.sum);

    }
}
