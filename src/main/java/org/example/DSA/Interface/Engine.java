package org.example.DSA.Interface;

public interface Engine {

    static final int PRICE = 78000;
    // static methods in interface should have a body coz they can't be inherited or overide these methods.
    // call the static methods via the interface name.

    void start();
    void stop();
    void acc();

}
