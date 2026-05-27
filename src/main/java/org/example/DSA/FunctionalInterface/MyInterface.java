package org.example.DSA.FunctionalInterface;


@FunctionalInterface
public interface MyInterface {

    public void sayHello();

    default void sayBye(){
    };

}
