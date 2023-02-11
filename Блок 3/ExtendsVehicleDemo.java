package org.example;

 class ExtendsVehicleDemo {

    public static void main(String[] args) {

        // создание объекта подкласса Auto
        Auto bmw = new Auto();
        bmw.sunroof = true; // люк есть

        // пример обращения к методам и переманным
        // надкласса и подкаласса
        System.out.println("Путь, пройденный за 1.5 часа:" + bmw.distance(1.5) + " км.");

        System.out.println("Max.скорость:" + bmw.getMaxSpeed() + " км.");

        System.out.println("Наличие люка: " + bmw.sunroof);

    } // main (String[]) method

} // ExtendsVehicleDemo class

