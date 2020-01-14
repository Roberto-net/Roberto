package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        HashSet<String> set= new HashSet<>();// SET - хранит не дублирующиеся уникальные элементы
        set.add("retry");
        set.add("rogue");
        set.add("hunter");
        set.add("owl");
        System.out.println(set);
        //set.contains();//проверка на содержание по данным
        set.add("owl");
        System.out.println(set);
        System.out.println(args.length);
        //Map - хранит элементы по принципу ключ-значение
        HashMap<String, Integer> rio= new HashMap<>();//
        rio.put("pal", 1200);
        rio.put("hunter", 2000);
        rio.put("knight", 2400);
        System.out.println(rio);
        rio.put("pal", 1800);
        System.out.println(rio);
        //keySet - возвращает список ключей
        //values - возвращает список значений
        rio.remove("hunter");
        System.out.println(rio);
        Stack<String> stack= new Stack<>();
        //Date
        Date date = new Date();
        //date.compareTo()
        //форматиррование даты
       /* SimpleDateFormat sd= new SimpleDateFormat("d/M/yyyy");
        System.out.println(sd.format(date));
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your date:\n");
        String date2= sc.nextLine();

        try {
            Date date3= sd.parse(date2);
            System.out.println(date3.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }*/
        //Calendar
        GregorianCalendar  calendar= (GregorianCalendar) Calendar.getInstance();
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        calendar.getTimeInMillis();
        System.out.println(calendar);


    }
}
