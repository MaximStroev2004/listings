public class Vehicle {
    int passengers; // количество пассажиров
    int wheels; // количество колес
    int maxspeed; // максимальная скорость
    int burnup; // расход топлива
} // Vehicle class

class VehicleDemo {

    public static void main(String[] args) {

        Vehicle car1 = new Vehicle();
        car1.passengers = 2; // два пассажира
        car1.wheels = 6; // шесть колес
        car1.maxspeed = 130; // max. скорость 130 км/ч
        car1.burnup = 30; // расход топлива 30 литров на 100 км

        // расчет пути, проходимого за полчаса
        // при движении с максимальной скоростью
        double distance = car1.maxspeed * 0.5;
        System.out.print("За полчаса car1 может проехать");
        System.out.println(distance + " км.");

        car1 = null;
    } // main(String[])
} // VehicleDemo class
