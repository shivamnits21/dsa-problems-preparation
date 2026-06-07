package org.example.DSA.AbstractClasses.abstractDemo;

public class Daughter extends Parent{

    Daughter(int age){
        super(age);
        this.age = age;
    }
    @Override
    public void career() {
        System.out.println("I'm going to be Doctor");
    }

    @Override
    public void partner() {
        System.out.println(" I love tom");
    }
}
