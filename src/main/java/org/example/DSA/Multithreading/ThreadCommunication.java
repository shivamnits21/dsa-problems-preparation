package org.example.DSA.Multithreading;

 class SharedResources{
 private int data;
 private boolean hasData;

 public void produce(int i){

 }
//
// public  int consumer(){
//
// }


}

class Producer implements Runnable{
    private SharedResources resource;

    public Producer(SharedResources resource){
        this.resource = resource;
    }
    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
           resource.produce(i);
            System.out.println("Produced: " + i);
        }
    }
}

//class Consumer implements Runnable{
//    private SharedResources resource;
//
//    public Consumer(SharedResources resource){
//        this.resource = resource;
//    }
//    @Override
//    public void run() {
//        for(int i = 0; i < 10; i++){
//            int values = resource.consumer();
//            System.out.println("Produced: " + values);
//        }
//    }
//}

public class ThreadCommunication {


    public static void main(String[] args) {
        SharedResources sharedResources = new SharedResources();
        Thread producerThread = new Thread(new Producer(sharedResources));
       // Thread consumerThread = new Thread(new Consumer(sharedResources));

        producerThread.start();
       // consumerThread.start();
    }
}
