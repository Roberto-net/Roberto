package com.company;

public class Main {

    public static void main(String[] args) {
        // бинарные операторы
        // & - двочиное И
        /*System.out.println(5 & 7);
        // | - бинарное ИЛИ
        System.out.println( 5 | 7);
        // >> - бинарный сдвиг вправо, << - бинарный сдвиг влево
        System.out.println(7 >> 2);
        System.out.println(5 << 2);*/
        // пример
        // 4 первых бита - скорость, 5-7 напряжение, 8-11 сила тока
        //1001 100 1101
        int data;
        data = 1229;
        int speed = data << 27;
        speed = speed >> 27;
        //System.out.println(speed);
        int maskSpeed = 15;
        maskSpeed = data & maskSpeed;
        System.out.println(maskSpeed);
        int maskV = 112;
        int Voltage = (data & maskV) >> 4;
        System.out.println(Voltage);
        int current = data >> 7;
        System.out.println(current);







    }
}
