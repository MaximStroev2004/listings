package org.example;

 class PolyVehicleDemo {
     public static void main(String[]args) {

         Auto a = new Auto(true);
         Vehicle v = new Vehicle();

         /*
         ** поместим оба объекта в массив типа Vehicle
         ** Первый элемент массива
         ** pvd[0] будет содержать экземпляр подкласса Auto,
         ** а второй - экземпляр класса Vehicle.
          */
         Vehicle [] pvd = {a,v};

         for (int i = 0; i < pvd.length; i++) {
             // динамический выбор версии
             // переопределенного метода toString()
             System.out.println(pvp[i].toSting());
         } // for

     } // main(Sting[]) method
} // PolyVehicleDemo class
