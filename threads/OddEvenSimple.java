package assignment1.threads;

import java.util.concurrent.Semaphore;

public class OddEvenSimple implements Runnable {
    Semaphore lock;
    int limit;
    int counter = 0;
    boolean evenflag;

    OddEvenSimple(Semaphore lock, int limit) {
        this.lock = lock;
        this.limit = limit;
        evenflag = true;
    }

    public static void main(String arg[]) {
        Semaphore evenSemaphore = new Semaphore(1);
        //Semaphore oddSemaphore=new Semaphore(0,false);
        OddEvenSimple oddEvenSemaphore = new OddEvenSimple(evenSemaphore, 100);
        Thread even = new Thread(oddEvenSemaphore, "Even");
        Thread odd = new Thread(oddEvenSemaphore, "Odd");
        even.start();
        odd.start();
    }

    @Override
    public void run() {


        while (counter <= limit) {
            if (Thread.currentThread().getName().equals("Even") && evenflag) {
                    /*try {
                        //lock.acquire();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }*/
                System.out.println(Thread.currentThread().getName() + " " + counter++);
                evenflag = false;
                //System.out.println(even.availablePermits());
            }
            if (Thread.currentThread().getName().equals("Odd") && !evenflag) {

                System.out.println(Thread.currentThread().getName() + " " + counter++);
                //lock.release();
                evenflag = true;
                //System.out.println(counter);
            }

            //System.out.println(counter);
        }

    }

}
