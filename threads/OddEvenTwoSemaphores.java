package assignment1.threads;

import java.util.concurrent.Semaphore;

public class OddEvenTwoSemaphores implements Runnable {
    Semaphore even;
    Semaphore odd;
    int limit;
    boolean evenFlag;
    int counter;

    OddEvenTwoSemaphores(Semaphore even, Semaphore odd, int limit) {
        this.even = even;
        this.odd = odd;
        this.limit = limit;
        this.counter = 0;
        evenFlag = true;
    }

    public static void main(String arg[]) {
        Semaphore even = new Semaphore(1);
        Semaphore odd = new Semaphore(0);
        OddEvenTwoSemaphores oddEvenTwoSemaphores = new OddEvenTwoSemaphores(even, odd, 100);
        Thread evenThread = new Thread(oddEvenTwoSemaphores, "Even");
        Thread oddThread = new Thread(oddEvenTwoSemaphores, "odd");
        evenThread.start();
        oddThread.start();
    }

    @Override
    public void run() {
        while (counter <= limit) {
            if (Thread.currentThread().getName().equals("Even") && evenFlag&&counter%2==0) {
                try {
                    even.acquire();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " " + counter++);
                evenFlag = false;
                odd.release();

            }
            if (Thread.currentThread().getName().equals("Odd") && !evenFlag&& counter%2==1) {
                try {
                    odd.acquire();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " " + counter++);
                even.release();
                evenFlag = true;
            }
            System.out.println(counter+" "+evenFlag);
        }
    }
}
