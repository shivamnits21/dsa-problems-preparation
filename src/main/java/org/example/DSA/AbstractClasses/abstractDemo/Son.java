package org.example.DSA.AbstractClasses.abstractDemo;


public class Son extends Parent{// Multiple inheritance is not allowed so we have interfaces.

    Son(int age){
        super(age);
        this.age = age;
    }
    @Override
    public void career() {
        System.out.println("I'm going to be a Software Developer");
    }

    @Override
    public void partner() {
        System.out.println("I love Ironman");
    }
}
