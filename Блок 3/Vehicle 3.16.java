package org.example;

public abstract class Vehicle {
    int passengers; // количество пассажиров
    private int wheels; // число колес
    private int maxspeed; // max.cкорость
    int burnup; // расход топлива

    // конструктор без параметров
Vehicle() {
    this(4, 4, 160, 13);
} // Vehicle() конструктор

    // конструктор с параметрами
    Vehicle(int passengers,int wheels,int maxspeed,int burnup) {
        this.passengers = passengers;
        this.wheels = wheels;
        this.maxspeed = maxspeed;
        this.burnup = burnup;
    } // Vehicle ( int, int ,int, int) конструктор

    // методы расчета длины пройденного пути
    double distance (int interval) {
    return distance((double) interval);
    } // distance (int)
     double distance(double interval) {
double value = this.maxspeed * interval;
return value;
} // distance (double)

} // Vehicle class