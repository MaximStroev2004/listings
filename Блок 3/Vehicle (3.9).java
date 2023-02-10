  public class Vehicle {
    int passengers; // количество пассажиров
    int wheels; // число колес
    int maxspeed; // max.cкорость
    int burnup; // расход топлива

    // конструктор
    Vehicle(int passengers,int wheels,int maxspeed,int burnup) {
        this.passengers = passengers;
        this.wheels = wheels;
        this.maxspeed = maxspeed;
        this.burnup = burnup;
    } // Vehicle конструктор
    // расчет пройденого пути
    double distance(double interval) {
        double value = this.maxspeed * interval;
        return value;
    } // distance (double) method
} // Vehicle class
