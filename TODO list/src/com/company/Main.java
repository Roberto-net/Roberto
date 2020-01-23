package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Condition c=Condition.NOTDONE;
        String taskTemp= "Заданий НЕТ.Отдохни.Расслабся.";
        String numberMenu = "0";
        String dateToConvert = "20/01/2020";
        ArrayList<Task> array= new ArrayList<Task>();
        Task task = new Task(taskTemp,c);
        System.out.println(task.equals(taskTemp));
        showMenu();
        array.add(new Task("bla bla bla",c));
        array.add(new Task("lool", c));
        System.out.print(array);
        System.out.println();
        Date date = new Date();
        HashMap<Date, ArrayList<Task>> dateTask= new HashMap<>();//Создаем основной TODO list
        dateTask.put(new Date(),array);
        SimpleDateFormat smd= new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("date :" + smd.format(date));
        putTask(array,"lool",c);
        //putTask(array,taskTemp,c);
        System.out.println(dateTask);
        changeTask(array);
        System.out.println(dateTask);
        showTask(array);
        /*try {
        array.remove(0);
        } catch (IndexOutOfBoundsException e){
            System.out.println("Вышла ");
        }
        try {
        System.out.println("1 - " + array.get(0));
        } catch (IndexOutOfBoundsException e){
        System.out.println("Вышла за рамки");
        }
        Date dateTemp= new Date();*/






        //HashMap<String, Condition> relax= new HashMap<>();
        //HashMap<String, Condition> todoList= putTask("10/12/2016",c);//Создаем таблицу: ключ - Задание, значение - Состояние

        /*dateToConvert=scanner();
        switch (numberMenu){
            case "1":
                System.out.print("Введите дату в формате dd/MM/YYYY:");
                dateToConvert = scanner();
                if (dayMonthYear.containsKey(dateToConvert)){//проверка наличия даты в ежедневнике
                    System.out.print("Введите задание на выбранную дату:");
                    taskTemp=scanner();
                    if (dayMonthYear.containsValue()){//проверка наличия задания в ежедневнике
                    }
                }
        }
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
        Iterator<HashMap<String,Condition>> itr= set.iterator();*/

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
    public static void showTask(ArrayList<Task> e){
        for (int i=0;i<e.size();i++){
            System.out.println();
            System.out.print("Индекс - ");
            System.out.print(e.indexOf(e.get(i)));
            System.out.print(" Задание -  ");
            System.out.print(e.get(i));
        }
    }
    public static ArrayList<Task> putTask(ArrayList<Task> tasks, String content, Condition condition){
        System.out.println("Добавление задния");
        content=scanner();
        for (int i = 0;i<tasks.size();i++) {
            Task tempT = tasks.get(i);
            if (tempT.content.equals(content)){
                System.out.println("Такое задание уже существует");
                tempT=null;
                System.gc();
                return tasks;
            }
            tempT=null;
            System.gc();
        }

        tasks.add(new Task(content,condition));
        return tasks;
    }
    public static ArrayList<Task> getTask(ArrayList<Task> g){
        showMenuTask();

        return g;
    }
    public static Task takeTask(ArrayList<Task> t){
        showTask(t);
        System.out.println("Введите индекс задания который хотите изменить:");
        String content=scanner();
        int p=Integer.parseInt(content);
        return t.get(p);
    }
    public static Task changeTask(Task task){
        System.out.println("Введите новую задачу: \n");
        task.content=scanner();
        return task;
    }
    public static void showMenu(){
        System.out.println("Выберите нужный пунт:");
        System.out.println("1 - Добавить задание");
        System.out.println("2 - Выбрать задание");
        System.out.println("3 - Показать список дел");
        System.out.println("4 - Завершить работу");
    }
    public static void showMenuTask(){
        System.out.println("Выберите нужный пунт:");
        System.out.println("1 - Изменить описние");
        System.out.println("2 - Удалить");
        System.out.println("3 - Пометить как выполненное");
        System.out.println("4 - Пометить как невыполненное");
        System.out.println("5 - Назад");
    }

























    public static void hurt(int a){

    }
    public static HashMap<String, Condition> putTask(String date, Condition t ){
        HashMap<String, Condition> taskDay1 = new HashMap<String, Condition>();
        taskDay1.put(date,t);
         return taskDay1;
    }
    public static HashMap<String, Condition> putTask(String date, Condition t,String i ){
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
        //sc.close();
        return tempSc;
    }
    public static void  mapTemp(){

    }

}
