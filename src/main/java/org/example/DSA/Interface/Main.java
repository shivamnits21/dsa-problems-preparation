package org.example.DSA.Interface;

public class Main {

    public static void main(String[] args) {

        Car car = new Car();

//        car.start();
//        car.stop();
//        car.brake();
//        car.acc();

         NiceCar niceCar = new NiceCar();
         niceCar.start();
         niceCar.stop();

         niceCar.upgradeEngine();
         niceCar.start();
         niceCar.stop();
    }
}
