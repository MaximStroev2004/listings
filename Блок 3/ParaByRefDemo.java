package org.example;

public class ParaByRefDemo {
    public static void main (String[] args) {
        ParaByRef p = new ParaByRef(2,3); // первый объект
        ParaByRef q = new ParaByRef(3,2); // второй объект

        System.out.println("q.x=" + q.x); // вывод 3
        System.out.println("q.x=" + q.y); // вывод 2

        p.callByRef(q);

        System.out.println("q.x=" + q.x); // вывод 5
        System.out.println("q.y=" + q.y); // вывод 5
    } // main(String[]) method
} // ParaByRefDemo class
