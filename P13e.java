class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
}
class P13e{
    public static void main(String args[]) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.setName("TRINABH");
        t2.setName("VIRAT");
        System.out.println("Thread 1 Name: " + t1.getName());
        System.out.println("Thread 2 Name: " + t2.getName());
        t1.start();
        t2.start();
    }
}