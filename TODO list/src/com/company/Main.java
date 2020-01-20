package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Condition c=Condition.NOTDONE;
        String numberMenu = "0";
        String dateToConvert = "20/01/2020";
        Date dateTemp= new Date();
        String taskTemp= "Заданий НЕТ.Отдохни.Расслабся.";
        HashMap<String, Condition> relax= new HashMap<>();
        HashMap<String, Condition> todoList= taskDay("10/12/2016",c);//Создаем таблицу: ключ - Задание, значение - Состояние
        HashMap<String, HashMap<String, Condition>> dayMonthYear= new HashMap<>();//Создаем основной TODO list
        dateToConvert=scanner();
        /*switch (numberMenu){
            case "1":
                System.out.print("Введите дату в формате dd/MM/YYYY:");
                dateToConvert = scanner();
                if (dayMonthYear.containsKey(dateToConvert)){//проверка наличия даты в ежедневнике
                    System.out.print("Введите задание на выбранную дату:");
                    taskTemp=scanner();
                    if (dayMonthYear.containsValue()){//проверка наличия задания в ежедневнике

                    }
                }
        }*/
        Set set = dayMonthYear.entrySet();
        set.remove("do coffe");
        todoList.remove("do coffe");
        dayMonthYear.get(dateToConvert);
        System.out.print(dayMonthYear.getOrDefault("do coffe", relax));
        dayMonthYear.put(scanner(),todoList);//Кладем в основной TODO: дату задания(ключ),
        // после кладем в него значение в ввиде еще одной таблицы: (ключ-задание, значение - состояние задания)

        Task task = task1(scanner(),c);//
        HashMap<String, Task > taskOnTheDay= new HashMap<>();//

        System.out.print(task);

        /*System.out.println(jj.get("10/12/2018"));
        for (Map.Entry<String, HashMap<String, Condition>> entry : jj.entrySet()) {
            int i = 1;
            System.out.print(i);
            System.out.print(" - ");
            System.out.print(entry.getValue());
            System.out.println();

            i++;

        }
        todoList.remove("doing list todo");

        System.out.println(todoList);*/




    }
    public static void hurt(int a){

    }
    public static HashMap<String, Condition> taskDay(String date, Condition t ){
        HashMap<String, Condition> taskDay1 = new HashMap<String, Condition>();
        taskDay1.put(date,t);
         return taskDay1;
    }
    public static Task task1(String content, Condition t ){
        Task taskTODO = new Task(content,t);
        return taskTODO;
    }
    public static String scanner (){
        String tempSc=null;
        Scanner sc=new Scanner(System.in);
        System.out.print("Введите желаемое значение: ");
        tempSc = sc.nextLine();
        return tempSc;
    }
    public static void  mapTemp(){

    }
}
