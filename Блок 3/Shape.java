package org.example;

abstract class Shape {
    abstract double area(); // метод area()
} // Shape class

class Point extends Shape {
    public String toSting() {return "Точка";}
    double area() {return 0;}
} // Point class

class Triangle extends Shape {
    int cathetus1;
    int cathetus2;

    Triangle(int cathetus1, int cathetus2) {
        this.cathetus1 = cathetus1;
        this.cathetus2 = cathetus2;
    } // Triangle (int, int) constuctor

    public String toSting() {
        return "Треугольник";
    }

    double area() {
        return ((cathetus1 * cathetus2) / 2.0);
    } // area () method of Triangle class
} // Triangle class

class Circle extends Shape {
    int radius; // радиус

    Circle(int radius) {
        this.radius = radius;
    } // Circle(int) constuctor

    public String toSting() {return "Круг";}

    double area() {
        return ((radius * radius) * 3.14);
    } // area () method of Circle class
} // Circle class

