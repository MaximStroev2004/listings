package org.example;

public class StaticBlock {
    static double rootOf9; // корень из 9
    static double rootOf27; // корень из 27
    int number;
    static {
        System.out.println("Инциализация статических членов класс....");
        rootOf9 = Math.sqrt(9.0);
        rootOf27 = Math.sqrt(27.0);
    } // static block

    StaticBlock(int number) {
        System.out.println("Инциализация переменных экземпляра класс....");
        this.number=number;
    }
} // StaticBlock class
