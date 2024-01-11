public class Main {

    public static void task1(int clientOS){
        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            throw new IllegalArgumentException("Неверный ввод! Такой ОС нет");
        }
    }

    public static void task2(int clientOS, int year){
        if (clientOS == 0) {
            if (year < 2015){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1){
            if (year < 2015){
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else {
            throw new IllegalArgumentException("Неверный ввод! Такой ОС нет");
        }
    }

    public static void task3(int year){
        int leapYear = 1584;
        int yearDifference = year - leapYear;
        if (yearDifference < 0){
            throw new IllegalArgumentException("Введен неверный год! Вводимый год должен быть больше или равен 1584");
        } else if (yearDifference % 100 == 0 && yearDifference % 400 != 0 || yearDifference % 4 != 0){
            System.out.println(year + " год не является високосным");
        } else {
            System.out.println(year + " год является високосным");
        }
    }

    public static void task4(int deliveryDistance){
        int days = 0;
        if (deliveryDistance < 0){
            throw new IllegalArgumentException("Неверный ввод! Расстояние не может быть меньше нуля");
        }
        if (deliveryDistance <= 20){
            days++;
        } else if (deliveryDistance <= 60){
            days += 2;
        } else if (deliveryDistance <= 100) {
            days += 3;
        } else {
            System.out.println("Доставки нет!");
            return;
        }
        System.out.println("Потребуется дней: " + days);
    }

    public static void task5(int monthNumber){
        switch (monthNumber){
            case 1:
                System.out.println("Январь - зимний месяц");
                break;
            case 2:
                System.out.println("Февраль - зимний месяц");
                break;
            case 3:
                System.out.println("Март - весенний месяц");
                break;
            case 4:
                System.out.println("Апрель - весенний месяц");
                break;
            case 5:
                System.out.println("Май - весенний месяц");
                break;
            case 6:
                System.out.println("Июнь - летний месяц");
                break;
            case 7:
                System.out.println("Июль - летний месяц");
                break;
            case 8:
                System.out.println("Август - летний месяц");
                break;
            case 9:
                System.out.println("Сентябрь- осенний месяц");
                break;
            case 10:
                System.out.println("Октябрь - осенний месяц");
                break;
            case 11:
                System.out.println("Ноябрь - осенний месяц");
                break;
            case 12:
                System.out.println("Декабрь - зимний месяц");
                break;
            default:
                throw new IllegalArgumentException("Неверный ввод! Такого месяца не существует!");
        }
    }

    public static void main(String[] args){

    }
}