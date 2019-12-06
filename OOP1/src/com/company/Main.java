package com.company;

public class Main {
    /*

    Принципы ООП:
    1. Инкапсуляция
    2. Полиморфизм
    3. Наследование
    4. Абстракция

    */

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.color = "black";
        animal.weight = 42.65f;
        animal.eat();
        animal.sleep();
        animal.sleep(12);
        animal.sleep(45, 10);

        System.out.println(animal.color);
        System.out.println(animal.weight);
        //ссылочность
        Animal animal2 = animal;
        animal2.color = "red";
        System.out.println(animal2.color);
        System.out.println(animal.color);
        tt(animal);
        System.out.println(animal.color);
        Dog dog= new Dog ();
        dog.color = "orange";
        dog.weight =  4.76f;
        dog.breed = "Овчарка";
        dog.sleep (4);
        dog.bark();
        dog.eat();
        // полиморфизм
        Animal animal3 = new Dog();
        sleep(animal);
        sleep(dog);
        sleep(animal3);



    }
        public static void tt (Animal a){
            a.color = "green";
    }
    // sleep обобщенный метод
    public static  void sleep (Animal a){
        a.sleep(3);
    }


}
