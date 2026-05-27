package org.example.DSA.OOPs;

public class BoxWeight extends Box{
    double weight;

    BoxWeight(){
        weight = -1;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); // call the parent class constructor
        // used to initialize values present in parent class
        // Box class is albe to initiazing this that's why we are getting error for private members in Box class.
        //Class Object is the root of the class hierarchy. Every class has Object as a superclass.
        // All objects, including arrays, implement the methods of this class.
        this.weight = weight;
    }
}
