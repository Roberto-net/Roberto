package com.company;

public class Main {

    public static void main(String[] args) {
       /* Animal animal = new Animal("white", 5);
        System.out.println(animal.color);
        System.out.println(animal.age);
        //Animal animal2= new Animal ("black",10);
        //System.out.println(animal2.color);
        //System.out.println(animal2.color);*/
        Dog dog = new Dog();
        //обращение к статическим полям класса осуществляется через название класса
        dog.footCount = 4;
        System.out.println(dog.footCount);
        System.out.println(dog.color);
        System.out.println(dog.age);
        Dog dog2 = new Dog("red", 7, "Rex");
        System.out.println(dog2.footCount);
        System.out.println(dog2.color);
        System.out.println(dog2.age);
        dog2.sayDog("uy uy");
        Dog.Cat cat = new Dog.Cat();
        cat.name = "Rikki";
        Dog.bark();
        dog.bark();



    }
}
