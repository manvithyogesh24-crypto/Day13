class code24 {

    private static int number = 1;
    private static final int MAX = 10;

    public static void main(String[] args) {

        Object lock = new Object();

        Thread odd = new Thread(() -> {
            while (number <= MAX) {
                synchronized (lock) {
                    if (number % 2 == 1) {
                        System.out.println("Odd: " + number++);
                        lock.notify();
                    } else {
                        try { lock.wait(); } catch (Exception e) {}
                    }
                }
            }
        });

        Thread even = new Thread(() -> {
            while (number <= MAX) {
                synchronized (lock) {
                    if (number % 2 == 0) {
                        System.out.println("Even: " + number++);
                        lock.notify();
                    } else {
                        try { lock.wait(); } catch (Exception e) {}
                    }
                }
            }
        });

        odd.start();
        even.start();
    }
}
