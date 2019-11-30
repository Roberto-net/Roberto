package com.company;
import java.util.Scanner;
public class hw1up {
    public static void main(String[] args) {
        for (; ; ) {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите проверяемый год: ");
            int year = in.nextInt();
            if (year % 400 == 0) {
                if (year > 0 && year <= 3000)
                    System.out.println("Високостный год");
                else
                    System.out.println("Укажите год между 1 и 3000");
            } else if (year % 4 == 0) {
                if (year % 100 == 0){
                    if (year <= 0 || year >= 3000)
                        System.out.println("Укажите год между 1 и 3000");
                    else System.out.println("Это не високостный год");
                } else {
                    System.out.println("Високостный год");
                }
            } else {
                if (year > 0 && year <= 3000)
                    System.out.println("Это не високостный год");
                else
                    System.out.println("Укажите год между 1 и 3000");
            }
        }
    }
}

