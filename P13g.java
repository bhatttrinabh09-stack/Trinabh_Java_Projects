class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread Name: " + getName() + " | Priority: " + getPriority());
            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
class P13g{
    public static void main(String args[]) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.setName("Alpha");
        t2.setName("Beta");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }
}