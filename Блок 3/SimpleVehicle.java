public class SimpleVehicle { // упрощенный вариант класса Vehicle

    int passengers;
}

class RefTypes {

    public static void main(String[] args) {

        SimpleVehicle car1, car2;  // две ссылки не объект
                                   // типа SimpleVehicle
        car1 = new SimpleVehicle(); // создаем объект и ссылку
                                    // на него
        car1.passengers = 25; // задаем количество пассажиров

        //обе переменные ссылаються на один объект
        car2 = car1;

        // докажем это:
        System.out.println("Количество пассажиров car2 равно " + car2.passengers);
        car2.passengers = 50;
        // если сar2 и car 1 - это один и тот же объект, то теперь
        // car1.passengers стало равно 50
        System.out.println("Количество пассажиров car1 равно " + car1.passengers);
    } // main(String[])
} // RefTypes class
