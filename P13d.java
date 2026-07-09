class BankAccount {
    int balance = 1000;
    synchronized void withdraw(int amount, String name) {
        System.out.println(name + " is trying to withdraw Rs." + amount);
        if (balance >= amount) {
            System.out.println(name + " is withdrawing money...");
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
            balance = balance - amount;
            System.out.println(name + " completed withdrawal.");
            System.out.println("Remaining Balance = Rs." + balance);
        }
        else {
            System.out.println("Insufficient Balance for " + name);
        }
        System.out.println();
    }
}
class Customer extends Thread {
    BankAccount account;
    String customerName;
    Customer(BankAccount account, String customerName) {
        this.account = account;
        this.customerName = customerName;
    }
    public void run() {
        account.withdraw(700, customerName);
    }
}
class P13d{
    public static void main(String args[]) {
        BankAccount b = new BankAccount();
        Customer t1 = new Customer(b, "Rohit");
        Customer t2 = new Customer(b, "Virat");
        t1.start();
        t2.start();
    }
}