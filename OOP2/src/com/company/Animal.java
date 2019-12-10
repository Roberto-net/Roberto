package com.company;

//в java невозможно создать экземляр объекта абстрактного класса
public abstract class Animal {
    public String color;
    public int age;
    /*public Animal () {
        color = "red";
        age = 12;
        System.out.println("animal was created");
    }*/
    public Animal (String color, int age){
        this.color=color; // ссылка на текущий экземпляр объекта
        this.age=age;
    }
    //public abstract void sayDog ();


}
