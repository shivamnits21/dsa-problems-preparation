package org.example.DSA.Multithreading;

public class LmbdaExpression {

    public static void main(String[] args) {
        //with lamda expressions.
        Runnable runnable = () -> System.out.println("Hello");// Runnable is functional interface it have
        // Only one abstract method that is run so here we know that  this method is implementaion of abstract
        // method in functional interface Runnable.

        Thread t1 = new Thread(runnable);
        t1.start();


        //Without lambda expressions
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello");
//            }
//        };
//
//        Thread t1 = new Thread(runnable);
//        t1.start();
    }
}
