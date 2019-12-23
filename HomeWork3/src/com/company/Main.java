package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // String stringMenu = null;

        //
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите модель кофемашины ");
        System.out.println("1  Siemens" + "      " + "2  Jura");
        int button = scanner.nextInt();
        if (button==2){
            juraMachine("Jura");
        }
        if (button==1){
            siemensMachine("Siemens");
        }
    }
    public static void juraMachine (String name ) {
        Jura jura = new Jura();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            jura.menu();
            int button = scanner.nextInt();
            switch (button) {
                case 8:
                    jura.off();
                    return;
                case 1:
                    jura.levelWater();
                    System.out.println();
                    jura.levelCoffe();
                    break;
                case 2:
                    jura.typeC("Americano");
                    break;
                case 3:
                    jura.typeC("Espresso");
                    break;
                case 4:
                    jura.typeC("DoubleEspresso");
                    break;
                case 5:
                    jura.fillWater();
                    break;
                case 6:
                    jura.fillCoffe();
                    break;
                case 7:
                    jura.info();
                    break;
            }
            System.out.println();
        }
    }
    public static void siemensMachine (String name ) {
        Siemens siemens = new Siemens();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            siemens.menu();
            int button = scanner.nextInt();
            switch (button) {
                case 8:
                    siemens.off();
                    return;
                case 1:
                    siemens.levelWater();
                    System.out.println();
                    siemens.levelCoffe();
                    break;
                case 2:
                    siemens.typeC("Americano");
                    break;
                case 3:
                    siemens.typeC("Espresso");
                    break;
                case 4:
                    siemens.typeC("DoubleEspresso");
                    break;
                case 5:
                    siemens.fillWater();
                    break;
                case 6:
                    siemens.fillCoffe();
                    break;
                case 7:
                    siemens.info();
                    break;
            }
            System.out.println();
        }
    }
}

