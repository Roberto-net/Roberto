package com.company;

import java.util.Date;

public class Main {
    public static void main(String[] args){
        Date date = new Date();
        int x=25;
        //x=x/0;
        int[] a = new int [3];
        try {
        a[2]=6;
        int b =5;
        b=b / 0;
        }
        catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
         catch (ArithmeticException e){
            System.out.println("divide by zero");
         }
        //обработка и генерация исключений
        try {
            //генерирует исключение
            throw new MyException();
        }
        catch (MyException e){
            System.out.println(e.getMessage());
            System.out.println(e.timestamp);
        }
        //порядок catch емеет значение (по иерархии наследований)
        //catch Exception and Throwable должны быть ниже всех исключений
        //
        try {
            test();
        } catch (MyException e) {
            System.out.println(e.getMessage() +"   "+ e.timestamp);
        }
        //игра "Загадай число"
        Game game = new Game();
        game.start();

    }
    public static void test () throws MyException{
        getMoney(-100);
    }

    public static void getMoney (int money) throws MyException{
        if (money<=0 || money >1000){
            throw new MyException();
        }
        System.out.println("alright");

    }

}
