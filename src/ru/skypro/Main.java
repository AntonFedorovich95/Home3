package ru.skypro;

public class Main {

    public static void main(String[] args) {
        int ClientOS = 0;
        if (ClientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        int clientDeviceYear = 2015;
        if (ClientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            if (ClientOS == 1 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите приложение по ссылке");
            }
        }

        int year = 2022;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным!");
        } else {
            System.out.println(year + " год не является високосным!");
        }

        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1 день!");
        } else {
            if (deliveryDistance >= 20 && deliveryDistance < 60) {
                System.out.println("Потребуется дней: 2 дня!");
            } else {
                if (deliveryDistance >= 60 && deliveryDistance <= 100) {
                    System.out.println("Потребуется дней: 3 дня!");
                }
            }
        }

        int mountNumber = 12;
        switch (mountNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}