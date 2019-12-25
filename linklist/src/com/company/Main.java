package com.company;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        /*try {
            list.add(33);
        } catch (MyException e) {
            e.printStackTrace();
        }
        try {
            list.add(44);
        } catch (MyException e) {
            e.printStackTrace();
        }
        try {
            list.add(55);
        } catch (MyException e) {
            e.printStackTrace();
        }
        try {
            list.add(66);
        } catch (MyException e) {
            e.printStackTrace();
        }
        try {
            list.add(77);
        } catch (MyException e) {
            e.printStackTrace();
        }*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение(числовое) для добавления элемента списка");
        int x=0;
        while (x < 8) {
            int ent;
            try {
                sc = new Scanner(System.in);
                ent = sc.nextInt();
                list.add(ent);
            } catch (InputMismatchException e) {
                System.err.println("Вы ввели не число!!!");
            } catch (MyException e) {
                e.printStackTrace();
            }
            x++;
            continue;
        }
       list.print();
        System.out.println("Введите индекс элемента который хотите удалить");
        int d ;
        try {
            sc=new Scanner(System.in);
            d= sc.nextInt();
            list.remove(d);
        } catch (InputMismatchException e){
            System.out.println("Введите числовой индекс");
        }catch ( MyException e) {
            System.err.println("Вы ввели неверный индекс");
        }
        list.printIndex();
        System.out.println("-------------------------------");
            System.out.println("Введите индекс элемента который хотите получить ");
            int a;
            try {
                sc=new Scanner(System.in);
                a = sc.nextInt();
                if (list.get(a)==-1||a < 0){
                    throw new MyException();
                }
                System.out.print("Value - ");
                System.out.print(list.get(a));
            } catch (InputMismatchException e){
                System.out.println("Введите числовой индекс");
            }catch ( MyException e) {
                System.err.println("Вы ввели неверный индекс");
            }
    }
}
