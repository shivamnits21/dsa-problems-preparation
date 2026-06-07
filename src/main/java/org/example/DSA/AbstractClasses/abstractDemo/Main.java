package org.example.DSA.AbstractClasses.abstractDemo;



public class Main {


    public static void main(String[] args) {
        Son son = new Son(30);
        son.career();

        Daughter daughter = new Daughter(26);
        daughter.career();

        //Here son and Daughter both contains the same methods overidden from the parent class but both have
        // provided the their own body to that function so in abstract methods child class with the same
        //method name can provide their own definition to that method and those methods will called on the basis
        // of that object. It's same as polymorphism just added the abstract keyword here.


        //Parent mom = new Parent(); // We cannot create objects of Abstract classes. if we create object of Parent
        // class and call the abstract methods they don't have the body so how they will be called then. for the same reason we can't create abstract constructors.
        // we also can't create the static methods coz they depend on the obj
    }
}
