package org.example.DSA.AbstractClasses.abstractDemo;

// when we have abstract methods in a class then that class also needs to be declare as Abstract.
// and child class will need to ovveride these methods as it's child class responsibility to provide the
// definition (body) to these abstract methods.
public abstract class Parent { // Abstract class cannot be final, coz this claass needs to be extend to provide
    // body to it's methods.
    int age;
    static String name;// we can have static and final variables in the abstract classes.
    final int VALUE = 432443;
    public Parent(int age){
        this.age = age;
    }

    // we can't create abstract static methods here as well coz static methods can't be ovveride. so there is no meaning of creting them here.
    // but we can create static methods.
    static void hello(){
        System.out.println("Hello");// it does not depend on the object so we can directly call it.
    }

    // we can create normal methods in abstract classes

    public void normal(){
        System.out.println("NOrmal method");
    }
  //  abstract Parent();  /// we cannot create abstract constructors.
    public abstract  void career();
    public abstract void partner();
}
