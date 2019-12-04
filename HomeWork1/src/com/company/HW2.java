package com.company;

public class HW2 {
    public static void main(String[] args){
        System.out.println("Ваш гороскоп");
        String zodiac = "водолей";
        switch (zodiac){
            case "водолей":
            case "Водолей":
                System.out.println("Водолей");
                break;
            case "Овен":
            case "овен":
                System.out.println("Овен");
                break;
            case "Телец":
            case "телец":
                System.out.println("Телец");
                break;
            case "Близнецы":
            case "близнецы":
                System.out.println("Близнецы");
                break;
            case "Рак":
            case "рак":
                System.out.println("Рак");
                break;
            case "Лев":
            case "лев":
                System.out.println("Лев");
                break;
            case "Дева":
            case "дева":
                System.out.println("Водолей или водолей");
                break;
            case "Весы":
            case "весы":
                System.out.println("Весы");
                break;
            case "Скорпион":
            case "скорпион":
                System.out.println("Скорпион");
                break;
            case "Стрелец":
            case "стрелец":
                System.out.println("Стрелец");
                break;
            case "Козерог":
            case "козерог":
                System.out.println("Козерог");
                break;
            case "Рыбы":
            case "рыбы":
                System.out.println("Рыбы");
                break;
            case "Змееносец":
            case "змееносец":
                System.out.println("Змееносец");
                break;
            default:
                System.out.println("Вы ввели неверный знак зодиака");



        }

    }
}
