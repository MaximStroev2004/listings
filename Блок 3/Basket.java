package org.example;

public class Basket { // "корзина покупок"

    // оплата наличными
    void pay(double money, int i) {
        System.out.println("Оплачено налчными:" + money);
    }

    // плата кредитными картами
    void pay(String carfNum) {
        System.out.println("Оплачено по кредитной карте #" + carfNum);
    }

    // оплата чеком
    void pay(String accountNum, String bankCode) {
        System.out.println("Переведено на счет #" + accountNum + " в банке " + bankCode);
    }
    } // Basket class


