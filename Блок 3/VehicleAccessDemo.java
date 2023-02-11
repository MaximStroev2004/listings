package org.example;

class VehicleAccessDemo {
        public static void main(String[] args) {

            Vehicle ferrari = new Vehicle(2, 4 ,360, 12);

            double distance = ferrari.distance(0.5);
            System.out.println("Ferrari за полчаса проедет" + distance + " км.");

            // следующая команда вызовет ошиьку компиляции.
            // Закомментируйте ее
            System.out.println("Скорость Ferrari: " + ferrari.maxspeed + " км/ч");
        } // main (String[]) method

    } // VehicleAccessDemo class
