package org.example.DSA.Interface;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Start the power Engine");
    }

    @Override
    public void stop() {
        System.out.println("Stop the power Engine");
    }

    @Override
    public void acc() {
        System.out.println("Accelerate the power Engine");
    }
}
