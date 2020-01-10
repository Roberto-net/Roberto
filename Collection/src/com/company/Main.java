package com.company;


import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        User<Date, String> u = new User<>();
        User<Integer, Object> u2 = new User<>();
        u2.iD= 25;
        //u.iD = "ggg";
        System.out.println(u2.iD.byteValue());
        u.iD = new Date();
        System.out.println(u.iD.getTime());
        Car<User> car= new Car<>();
        //Коллекции
        //ArrayList
        //все элементы распологаются друг за другом
        //порядок элементов не меняется
        //возможен доступ к элементам(по индексу, ссылке или значению)
        ArrayList<String> list= new ArrayList<>();
        int i = 0;
        //list.get(i);// то же самое что и list [i]
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(30);
        list2.add(20);
        list2.remove(new Integer(30));
        list2.remove(Integer.valueOf(10));
        System.out.println(list2);




    }
}
