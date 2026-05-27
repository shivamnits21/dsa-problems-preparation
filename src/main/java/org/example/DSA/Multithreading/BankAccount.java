package org.example.DSA.Multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance = 100;
    private final Lock lock = new ReentrantLock();

    public  void withdraw(int amount) {


        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);


        if (lock.tryLock()) {
            if (balance >= amount) {
                System.out.println(Thread.currentThread().getName() + " proceeding with withdrawal");
                try {
                    Thread.sleep(1000); // thread2 will wait till thread1 complete it's execution here
                    // that's we are here studying lock, manual lock instead of synchronize keyword.
                    balance -= amount;
                    System.out.println(Thread.currentThread().getName() + " complete withdrawal. Remaining amount: " + balance);
                } catch (Exception e) {

                } finally {
                    lock.unlock();
                }

            } else {
                System.out.println(Thread.currentThread().getName() + " Insufficient balance ");
            }

        }else{
            System.out.println(Thread.currentThread().getName() + " Could not acquire the lock will try again later. ");
        }
    }

//        if(balance >= amount){
//            System.out.println(Thread.currentThread().getName()+ " proceeding with withdrawal");
//
//            try{
//                Thread.sleep(1000); // thread2 will wait till thread1 complete it's execution here
//                // that's we are here studying lock, manual lock instead of synchronize keyword.
//            }catch(InterruptedException e){
//
//            }
//            balance -= amount;
//
//            System.out.println(Thread.currentThread().getName() + " complete withdrawal. Remaining amount: " + balance);
//        }else{
//            System.out.println(Thread.currentThread().getName()+ " Insufficient balance ");
//        }
 //   }


    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                bankAccount.withdraw(50);
            }
        };
        Thread t1 = new Thread(task,"Thread1");
        Thread t2 = new Thread(task,"Thread2");

        t1.start();
        t2.start();

    }
}
