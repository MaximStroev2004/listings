package org.example;

class ParaByValueDemo {

    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        // передача параметров по значению
        ParaByValue test = new ParaByValue();
        test.callByVal (a,b);

        System.out.println("a =" + a); // вывод 2
        System.out.println("b =" + b); // вывод 3
    } // main(String[]) method
} // ParaByValueDemo class
