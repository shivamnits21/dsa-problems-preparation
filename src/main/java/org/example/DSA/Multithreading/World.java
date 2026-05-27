package org.example.DSA.Multithreading;


// A new class World is creted that extends Thread.
// To create a new Thread in java, we can either extend the Thread class or implement the Runnable Interface.
public class World extends  Thread {

    // The run method is overridden to define the code that constitutes the new thread.
    @Override
    public void run() {
        int i = 1;
        while( i > 0 ){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
