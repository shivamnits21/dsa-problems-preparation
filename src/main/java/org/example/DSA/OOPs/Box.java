package org.example.DSA.OOPs;

public class Box {
     double l;
    double h;
    double w;

    Box(){
      this.l = -1;
      this.h = -1;
      this.w = -1;
    }

    Box(double side){
       // super();    Object class, calling the super class constructor that is Object class.
        this.l = side;
        this.h = side;
        this.w = side;
    }
    Box(double l, double h, double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }


}
