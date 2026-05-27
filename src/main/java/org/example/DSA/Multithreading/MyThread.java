package org.example.DSA.Multithreading;

public class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println("Running");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();       // New state
        System.out.println(t1.getState()); // New state
        t1.start();   // Runnable state
        System.out.println(t1.getState()); // Runnable state
        Thread.sleep(100);
        System.out.println(t1.getState()); // timed waiting as t1 thread is in sleep of 2000ms
        t1.join();  // main thread waiting for t1 to come out of sleep then main thread will start it's work.
        System.out.println(t1.getState()); // t1 state is terminated.
    }
}
