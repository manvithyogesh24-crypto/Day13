class code26 {

    private int balance = 1000;

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " withdrawing " + amount);
            balance -= amount;
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient balance for " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {

        code26 account = new code26();

        Thread t1 = new Thread(() -> account.withdraw(700), "Thread1");
        Thread t2 = new Thread(() -> account.withdraw(700), "Thread2");

        t1.start();
        t2.start();
    }
}
