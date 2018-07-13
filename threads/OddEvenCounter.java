package assignment1.threads;

public class OddEvenCounter implements Runnable {
    int counter;
    Object lock;
    int limit;

    OddEvenCounter(Object lock, int limit) {
        this.counter = 1;
        this.lock = lock;
        this.limit = limit;
    }

    public static void main(String arg[]) {
        Object lock = new Object();
        OddEvenCounter oddEvenCounter = new OddEvenCounter(lock, 100);
        Thread even = new Thread(oddEvenCounter, "Even");
        Thread odd = new Thread(oddEvenCounter, "Odd");
        even.start();
        odd.start();

    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                if ((Thread.currentThread().getName().equals("Even") && (counter % 2 == 0)) || (Thread.currentThread().getName().equals("Odd") && (counter % 2 == 1))) {
                    System.out.println(Thread.currentThread().getName() + " " + counter++);
                }
                lock.notify();
                if (counter >= limit) {
                    break;
                }

                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
