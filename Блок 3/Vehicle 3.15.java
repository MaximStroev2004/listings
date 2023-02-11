package org.example;

public class Vehicle {
    int passengers; // количество пассажиров
    int wheels; // число колес
    public int maxspeed; // max.cкорость
    int burnup; // расход топлива

    /* конструктор без параметров, инциализирующий
     ** переменные объекта стандартными начениями */
    Vehicle() {
        this.passengers = 4;
        this.wheels = 4;
        this.maxspeed = 160;
        this.burnup = 13;
    } // Vehicle() конструктор

    /* конструктор с парамтрами, инциализирующий
    ** переменные оьъекта значениями, переданными из
     вызывающей программы */
    Vehicle(int passengers, int wheels, int maxspeed, int burnup) {
        this.passengers = passengers;
        this.wheels = wheels;
        this.maxspeed = maxspeed;
        this.burnup = burnup;
    } // Vehicle( int, int, int, int,) constructor

} // Vehicle class