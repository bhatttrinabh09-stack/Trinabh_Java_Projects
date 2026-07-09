class PatternThread extends Thread {
    public void run() {
        for (int i = 1; i <= 4; i++) {
            System.out.print("/* ");
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println();
    }
}
public class P13b{
    public static void main(String args[]) {
        PatternThread t1 = new PatternThread();
        PatternThread t2 = new PatternThread();
        t1.start();
        t2.start();
    }
}
