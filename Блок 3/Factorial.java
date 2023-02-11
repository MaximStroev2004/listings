package org.example;

public class Factorial {

    // вычисление факториала в цикле
    static long computeI(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++)
            result *= i;
        return result;
    }

    // вычисление факториала рекурсивынм способом
    static long computeR(int n) {
        if (n == 1) return n;
        return computeR(n - 1) * n;
    }
} // Factorial class
