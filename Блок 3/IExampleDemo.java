package org.example;
interface A {
    void metodA();
} // A interface
interface B extends A {
    void metodB();
} // B interface
public class IExampleDemo {
        public static void main(String[] args) {
            IExample ie = new IExample();
            ie.metodA();
            ie.metodB();
        } // main (String[]) method
    } // IExampleDemo class

