package com.company;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private int number;
    private int nCount;

    public Game (){
        //генерация случайных чисел
        //double r=Math.random();  //r=[0;1)
        //r*(max-min)+min   [min,max]
        //второй способ
        Random random=new Random();
        this.number = random.nextInt(100)+1;
    }
    public void start (){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Введите число: ");
            int a;
            try {
                a = sc.nextInt();
            } catch (InputMismatchException e){
                System.out.println("Введите корректное число");
                sc=new Scanner(System.in);
                continue;
            }
            this.nCount++;
            if (this.number==a){
                System.out.println("Congrats");
                System.out.println("Количество попыток - " + this.nCount);
                break;
            }
            if (this.number > a){
                System.out.println("Загаданное число больше");
            }else {
                System.out.println("Загаданное число меньше");
            }
        }
    }
}
