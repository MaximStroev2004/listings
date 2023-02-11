package org.example;

public class FactorialDemo {
    public static void main(String[] args) {
        // Factorial f = new Factorial();
        System.out.println("Вычисление факториала в цикле:");
        for (int i =6; i > 0; i--) {
            System.out.println(i +"! = " + Factorial.computeI(i));
        }
        System.out.println("Вычисление факториала рекурсивным методом:");
        for (int r =1; r <= 6; r++) {
            System.out.println(r +"! = " + Factorial.computeI(r));
        }
    } // main (String[]) method
} // FactorialDemo class
