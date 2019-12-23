package com.company;

public class Animal {
    //свойства объекта
    public float weight ;
    public String color;
    private float height;
    protected int age;
    // методы объекта
    public void eat(){
        System.out.println("animal eat");
    }
    public void sleep (){
        System.out.println("animal sleep");
    }
    // перегрузка метода sleep
    public void sleep (int h){
        System.out.println("animal sleep");
        System.out.println(h);
        System.out.println("hours");
        System.out.println();
    }
    public void sleep (int min, int h){
        System.out.println("animal sleep");
        System.out.println(h);
        System.out.println(" hours");
        System.out.println(min);
        System.out.println(" minutes");
    }


}
