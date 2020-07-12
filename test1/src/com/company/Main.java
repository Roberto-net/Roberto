package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*for (; ; ) {*/
        Scanner in = new Scanner(System.in);
        /*System.out.print("Введите проверяемый год: ");*/
        int num = in.nextInt();
            /*if (year % 400 == 0) {
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
        }*/
        boolean isPrime;
        if (num < 2) isPrime=false;
        else isPrime = true;
        for (int i = 2 ; i< Math.sqrt(num);i++){
            if((num % i )==0){
                isPrime=false;
                break;
            }
        }
        if (isPrime) System.out.println("простое");
        else System.out.println("не простое");



    }
}
