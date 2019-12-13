package com.company;

public class Dog extends Animal {
    public String name;
    //статические свойства располагабться в памяти в единственном экземляре
    public static int footCount;
    public Dog (){
        super("green",9);
        this.name = "rex";
        Cat cat = new Cat();
    }

    public Dog (String color, int age, String name){
        super(color,age);
        this.name = name;
    }
    public void sayDog (String sound){
        System.out.println("haw-haw" + sound);
    }
    //классы находящиеся внутри других классов - inner class
    public static class Cat {
        public String name;
        Cat() {
           this.name="juniper";
           name="bloodhound";
        }
    }
    private class Mouse {
        Mouse (){
            name = "Jerry";
        }
    }
    public static void bark(){
        //this.name = "ыывй"; // ошибка
        //для статического метода нельзя использовать ссылку на экземпляр объекта
        System.out.println("woof-woof");
        sleep();
    }
    public static void sleep (){
        System.out.println("z-z-z-z-z-z");
    }
}
