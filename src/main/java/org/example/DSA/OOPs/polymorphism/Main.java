package org.example.DSA.OOPs.polymorphism;



public class Main {

    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Shape square = new Square(); // depend on the type of object not on the type of reference variable.

        triangle.area();
        // Act of being representing the same thing in multiple ways.
        //Dynamic Method dispatch: it is the mechanism by which call to an overriden method is resolved at runitime rather then compile time.
        // So when we are using Shape as reference variable then area method should be in the Shape class
        //so that area method can be accessed but call to which method is resolved by dynamic method dispatcher at runtime.


    }
}
