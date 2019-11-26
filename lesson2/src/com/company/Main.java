package com.company;

public class Main {

    public static void main(String[] args) {
        /*
         логические операторы:
         >,<,<=,>=,&&,==,
         != - не равно,
         && - логическое И
         || - логическое ИЛИ

        */
        int a = 20, b = 34, c = 42;
        if (a > b && a > c){
            System.out.println(a);
        } else if (b > a && b > c){
            System.out.println(b);
        } else {
            System.out.println(c);
        }
        int month = 22;
        switch (month){
            case 1:
                System.out.println("Январь");
                //break;
            case 2:
                System.out.println("Февраль");
            case 3:
                System.out.println("март");
            case 4:
                System.out.println("апрель");
            case 5:
                System.out.println("май");
            case 6:
                System.out.println("июнь");
            case 7:
                System.out.println("июль");
            case 8:
                System.out.println("август");
            case 9:
                System.out.println("сентябрь");
                //break;
            case 10:
                System.out.println("октябрь");
            case 11:
                System.out.println("ноябрь");
            case 12:
                System.out.println("декабрь");
            default:
                System.out.println("такого месяца нет");
             // %
             System.out.println(5%10);



             }

















    }
}
