package assignment1.threads;

public class OddEven extends Thread {
    int limit;
    Object object;
    boolean flag;

    OddEven(int limit, Object object) {
        this.limit = limit;
        this.object = object;
        flag = false;
    }

    public static void main(String arg[]) {
        Object object = new Object();
        OddEven odd = new OddEven(100, object);
        OddEven even = new OddEven(100, object);
        even.setName("Even");
        odd.setName("Odd");
        even.start();
        odd.start();
    }

    @Override
    public void run() {
        for (int i = 0; i <= limit; i++) {
            synchronized (object) {

                if (this.getName().equals("Even")) {
                    if (i % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + " " + i);
                        try {
                            object.wait();
                        } catch (Exception exception) {
                            System.out.println(exception);
                        }
                    } else if (i % 2 != 0) {

                        object.notify();
                    }
                }
                if (this.getName().equals("Odd"))
                    if (i % 2 != 0) {
                        System.out.println(Thread.currentThread().getName() + "  " + i);
                        try {

                            object.wait();
                        } catch (Exception exception) {
                            System.out.println(exception);
                        }
                    } else if (i % 2 == 0) {

                        object.notify();
                    }

            }
        }

    }
}
