package myapp.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class Atomic {

    public static void main(String[] args) {
        ShareCounter counter = new ShareCounter();

        // thread 1
        Thread thread1 = new Thread(() -> {
            System.out.println(" thread 1 started.");
            for (int i = 0; i < 5000; i++) {
                counter.increment();
            }
            System.out.println(" thread 1 completed.");
        });
        thread1.start();


        // thread 2
        Thread thread2 = new Thread(() -> {
            System.out.println(" thread 2 started.");
            for (int i = 0; i < 5000; i++) {
                counter.increment();
            }
            System.out.println(" thread 2 completed.");
        });
        thread2.start();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("total count: "+ counter.getCount());

    }
}

class ShareCounter {

//    not getting current value if you use directly
//    private int count;
//    public int getCount() {
//        return count;
//    }
//    public void increment() {
//        count++;
//    }

//  get current value
    private AtomicInteger count = new AtomicInteger(0);
    public AtomicInteger getCount() {
        return count;
    }
    public void increment() {
        count.getAndIncrement();
    }


}


