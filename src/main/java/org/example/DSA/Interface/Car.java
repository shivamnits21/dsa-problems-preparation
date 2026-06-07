package org.example.DSA.Interface;

public class Car implements Brake, Engine, Media{
    @Override
    public void brake() {
        System.out.println("I Brake Porsche");
    }

    @Override
    public void start() {
        System.out.println("I Start Porsche");
    }

    @Override
    public void stop() {
        System.out.println("I stop Porsche");
    }

    @Override
    public void acc() {
        System.out.println("I accelerate Porsche");
    }
}
