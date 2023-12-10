package com.company;

import java.util.Collection;

interface  A {
      void print(int n);

}
class B implements A {

    @Override
    public void print(int n) {
        System.out.println("Hello");
    }

    public void print(Object O){
        System.out.println("Hello world");
    }


}

class C extends B{
    public void print(){
        System.out.println("HELLOED");
    }
}

public class Interfaces {
    public static void main(String[] args) {
//        A a = new B();
//        a.print(1);

//        A c = new C();
//        c.print(1);

        A c1 = new C();
//        c1.print(1);// here A can be assumed as collection and C as an arraylist

        Object O = new Object();
        B c2 = new C();
        c2.print(O);

    }
}

// this is the example of how list and arraylist have different remove method from collection
