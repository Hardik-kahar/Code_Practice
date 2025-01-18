package myapp.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class DaemonThreadExample {
    public static void main(String[] args) {
        AtomicInteger i = new AtomicInteger();
        Thread daemonThread = new Thread(() -> {
            while (true) {
                System.out.println("Thread name: " + Thread.currentThread().getName());
                System.out.println("Daemon thread is running: "+ i);
                i.getAndIncrement();
                try {
                    Thread.sleep(1000); // Simulate some task
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        daemonThread.setDaemon(true); // Set the thread as daemon
//        daemonThread.start(); // Start the daemon thread
        daemonThread.run(); // run the main method // not  crate new thread
//        System.out.println("Name: "+ daemonThread.getName());
    }
}

