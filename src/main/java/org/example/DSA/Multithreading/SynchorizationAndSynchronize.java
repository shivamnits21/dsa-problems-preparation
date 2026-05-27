package org.example.DSA.Multithreading;

public class SynchorizationAndSynchronize extends Thread{

    private Counter counter;

    public SynchorizationAndSynchronize(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run(){
        for(int i = 0; i < 1000; i++){
            counter.increment();
        }
    }


    public static void main(String[] args) {
        Counter counter1 = new Counter();

        SynchorizationAndSynchronize t1 = new SynchorizationAndSynchronize(counter1);
        SynchorizationAndSynchronize t2 = new SynchorizationAndSynchronize(counter1);

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch(Exception e){

        }

        System.out.println(counter1.getCount());


    }

}
