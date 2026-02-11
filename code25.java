class code25 {

    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public static void main(String[] args) throws InterruptedException {

        code25 counter = new code25();

        Thread[] threads = new Thread[1000];

        for (int i = 0; i < 1000; i++) {
            threads[i] = new Thread(counter::increment);
            threads[i].start();
        }

        for (Thread t : threads)
            t.join();

        System.out.println("Final Count: " + counter.count);
    }
}
