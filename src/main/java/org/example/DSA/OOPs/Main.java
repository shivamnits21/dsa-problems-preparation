package org.example.DSA.OOPs;

public class Main {

    public static void main(String[] args) {
//        BoxWeight boxWeight = new BoxWeight(1,2,3,4);
//        System.out.println(boxWeight.w + " " + boxWeight.weight);

        Box box5 = new BoxWeight(2,3,4,7);
        //System.out.println(box5.weight );// So here reference type is of box and referencing to object of type boxweightand
        // it is not able to access the membbers of child class So
        // it is actually the type of reference variable and not the type of
        // object that determines what members can be accessed,

        //Threr are many variavble in both parent and child
        // you're given access to variables that are in reference type i.e boxWeight
        // hence we have access to weight variable
        // this also means the once we are trying to access should also be initialised
        // but here when the object is of type parent class how will we cALL  the constructor of child class.
        // so we are not able to initialise weight in the child class, that's why getting the error.
        //BoxWeight box6 = new BoxWeight(2,4,6);// error

    }
}
