package com.company;

import java.text.ParseException;
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
        SimpleDateFormat smd= new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("date :" + smd.format(date));
        dateTask.put(dateFormat("23/01/2020"),array);
        putTask(dateTask, "hartty");
        //putTask(array,taskTemp,c);
        showTask(array);
        System.out.println("\n" + array);
        System.out.println(dateTask);
        mainMenu(dateTask,array);
    }
    public static HashMap<Date, ArrayList<Task>> mainMenu(HashMap<Date, ArrayList<Task>> main, ArrayList<Task> arr){
        HashMap<Date, ArrayList<Task>> temp= main;
        while (true){
            showMenu();
            int i = Integer.parseInt(scanner());
            switch (i){
                case 1://Добавить задание
                    putTask(temp);
                    break;
                case 2://Выбрать задание
                    System.out.println("Выберите желаемую дату");
                    String date= scanner();
                    try {
                        main.put(dateFormat(date), menuTask(main.get(dateFormat(date))));
                    } catch (NullPointerException e){
                        System.err.println("чтото пошло не так!");
                    }
                    break;
                case 3://Показать список дел
                    System.out.println(main);
                    break;
                case 4://Завершить работу
                    return main;
                default:
                    System.err.println("Выберите верный пункт!");
            }
        }
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
    public static HashMap<Date,ArrayList<Task>> putTask(HashMap<Date,ArrayList<Task>> main){
        System.out.println("Выберите желаемую дату");
        String date=scanner();
        System.out.println("Введите желаемое задание на выбранную дату");
        String tempTask = scanner();
        ArrayList<Task> tasks= main.get(dateFormat(date));
        if (main.containsKey(dateFormat(date))){
            System.err.println("Такое задание уже существует");
            /*while (true) {
                for (int i = 0; i < tasks.size(); i++) {
                    Task tempT = tasks.get(i);
                    if (tempT.content.equals(tempTask)) {
                        System.err.println("Такое задание уже существует");
                        tempT = null;
                        System.gc();
                        System.out.println("Введите другое задание");
                    }
                    tempT = null;
                    System.gc();
                }
            }*/
        }else {
            Task temp=new Task(tempTask,Condition.NOTDONE);
            tasks.add(temp);
            main.put(dateFormat(date),tasks);
        }
        return main;
    }
    public static Date dateFormat (String date){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date tempDate =  formatter.parse(date);
            System.out.println(tempDate);
            return tempDate;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new Date();
    }
    /*public static ArrayList<Task> putTask(ArrayList<Task> tasks, String content, Condition condition){
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
    }*/
    public static ArrayList<Task> menuTask (ArrayList<Task> t){
        Task tempTask=takeTask(t);
        while (true){
            showMenuTask();
            int i = Integer.parseInt(scanner());
            switch (i){
                case 1://Изменение описания
                    t.remove(tempTask);
                    t.add(changeTask(tempTask));
                    break;
                case 2://Удаление задачи
                    System.out.println("Вы действительно хотите удалить задание?");
                    System.err.println("y/n");
                    String g = scanner();
                    switch (g){
                        case "y":
                            t.remove(tempTask);
                            break;
                        case "n":
                            break ;
                    }
                    break;
                case 3://Пометить задание как выполненное
                    t.remove(tempTask);
                    tempTask.condition=Condition.DONE;
                    t.add(tempTask);
                    break;
                case 4://Пометить задание как невыполненное
                    t.remove(tempTask);
                    tempTask.condition=Condition.NOTDONE;
                    t.add(tempTask);
                    break;
                case 5://Выход в главное меню
                    return t;
                default:
                    System.err.println("Выберите верный пункт!");
            }
        }
    }
    /*public static Task getTask(ArrayList<Task> g){

        return ;
    }*/
    public static Task takeTask(ArrayList<Task> t){
        showTask(t);
        System.out.println("\n Введите индекс задания который хотите изменить:");
        String content=scanner();
        int p=Integer.parseInt(content);
        return t.get(p);
    }
    public static ArrayList<Task> taskAfterRemove (ArrayList<Task> arrt, Task t){
        arrt.remove(t);
        return arrt;
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
    public static void showDayTask(){
        System.out.println("Выберите нужный пунт:");
        System.out.println("1 - На сегодня");
        System.out.println("2 - На эту неделю");
        System.out.println("3 - На выбранную дату");
        System.out.println("4 - Показать весь список");
        System.out.println("5 - Назад");
    }

























    public static void hurt(int a){

    }
    public static HashMap<Date,ArrayList<Task>> putTask(HashMap<Date,ArrayList<Task>> t , String s){
        ArrayList<Task> tempArr= new ArrayList<>();
        tempArr.add(new Task(s,Condition.NOTDONE));
        t.put(new Date(),tempArr);
        return t;
    }
    public static Task task1(String content, Condition t ){
        Task taskTODO = new Task(content,t);
        return taskTODO;
    }
    public static String scanner (){
        String tempSc=null;
        Scanner sc=new Scanner(System.in);
        System.out.print("Введите желаемое значение: \n");
        tempSc = sc.nextLine();
        //sc.close();
        return tempSc;
    }
    public static void  mapTemp(){

    }

}
