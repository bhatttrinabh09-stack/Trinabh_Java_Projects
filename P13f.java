class Shared {
    synchronized void display() {
        System.out.println("Waiting thread is waiting...");
        try {
            wait();
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Waiting thread resumed execution.");
    }
    synchronized void printNumbers() {
        System.out.println("Printing numbers:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
        } 
        notify();
        System.out.println("Notification sent.");
    }
}
class WaitingThread extends Thread {
    Shared s;
    WaitingThread(Shared s) {
        this.s = s;
    }
    public void run() {
        s.display();
    }
}
class NotifyingThread extends Thread {
    Shared s;
    NotifyingThread(Shared s) {
        this.s = s;
    }
    public void run() {
        s.printNumbers();
    }
}
class P13f{
    public static void main(String args[]) {
        Shared s = new Shared();
        WaitingThread t1 = new WaitingThread(s);
        NotifyingThread t2 = new NotifyingThread(s);
        t1.start();
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }
        t2.start();
    }
}