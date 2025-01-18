package myapp.thread;

//class Mythread extends Thread{
//
//    @Override
//    public void run() {
//
////        System.out.println("MyThread running in thread: " );
//    }
//}

class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("run myRunnable.... " + Thread.currentThread().getName());
    }
}

public class Thread1 {

    public static void main(String[] args) {

//        System.out.println("Main thread: "+ Thread.currentThread().getName());
//        Mythread myThread = new Mythread();
//        myThread.run();

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        System.out.println("created thread "+  thread.getName());
        thread.start();
        myRunnable.run();

        Thread objThread = new Thread(()->{
            System.out.println("Thread 1.. ");
        });
        objThread.start();
        System.out.println("objThread: "+  objThread.getName());

//         optimize way to create thread
        Runnable objrunnable = () -> {
//            System.out.println("runnableThread: ");
            System.out.println("Runnable thread: "+ Thread.currentThread().getName());

        };
        Thread runnableThread = new Thread(objrunnable);
        runnableThread.start();
//        System.out.println("Runnable thread: "+  runnableThread.getName());

    }

}