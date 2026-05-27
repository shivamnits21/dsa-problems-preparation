package org.example.DSA.Multithreading;

// To create a new Thread in java, we can either extend the Thread class or implement the Runnable Interface.
// A Class is created that implements the Runnable interface.
public class WorldRunnable implements  Runnable{
    // The run method is overridden to define the code that constitutes the new thread.
    @Override
    public void run() {
        int i = 1;
        while( i > 0 ){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
