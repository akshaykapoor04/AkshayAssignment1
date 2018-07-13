package assignment1.threads;

import java.util.concurrent.Semaphore;

public class OddEvenOneSemaphore implements Runnable {
    Semaphore lock;
    int limit;
    int counter;

    OddEvenOneSemaphore(Semaphore lock, int limit) {
        this.lock = lock;
        this.counter = 0;
        this.limit = limit;
    }

    public static void main(String arg[]) {
        Semaphore lock = new Semaphore(1);
        OddEvenOneSemaphore oddEvenOneSemaphore = new OddEvenOneSemaphore(lock, 10);
        Thread even = new Thread(oddEvenOneSemaphore, "Even");
        Thread odd = new Thread(oddEvenOneSemaphore, "Odd");
        odd.start();
        even.start();

    }

    @Override
    public void run() {
        while (counter <= limit) {
            try {
                lock.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if ((Thread.currentThread().getName().equalsIgnoreCase("Even") && counter % 2 == 0 && counter <= limit) || (Thread.currentThread().getName().equalsIgnoreCase("Odd") && counter % 2 == 1 && counter <= limit)) {
                System.out.println(Thread.currentThread().getName() + " " + counter++);
            }
            lock.release();
        }
    }
}
