package org.example.DSA.Multithreading;

public class Main {

    // when java programs starts, one thread start running immediately, which is called the main thread.
    // this thread is responsible for executing the main method of the program.
    // Process finished with exit code 0




    public static void main(String[] args) {
        System.out.println("Hello world");

        WorldRunnable world = new WorldRunnable();
        // Thread object is created by passing the an instance of world
        Thread t1 = new Thread(world); // when we implements Runnable interface.
        t1.start(); // Runnable state  // Start method is called on the Thread object to initiate the new Thread.
          // In Both cases run method contains the code that will be executed in the new thread.
//         World world = new World(); // New State
//        world.start(); // It is for when we extend Thread class // Start method is called to initiate the new thread.
        // Thread-0 is running for this method.
         for(; ;){
             // Concurrently 2 threads are running one is Main thread for this Loop coz it's in main method
             // and one is Thread 0;
             System.out.println(Thread.currentThread().getName());
         }

    }
}
