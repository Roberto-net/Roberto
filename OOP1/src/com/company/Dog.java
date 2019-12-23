package com.company;

//класс Дог наследует класс энимал
// свойства/ методы родителей
//public - наследуется ; private - не наследуется; protected - наследуется.
public class Dog extends Animal {
    public  String breed ;   //порода
    public void bark () {
        System.out.println("haw - haw");
    }
    @Override
    public void sleep (int h){
        System.out.println("dog sleep " + h + " hours");
    }
    @Override
    public void eat(){
        super.eat(); // указатель на объект родителя, вызываем метод eat родителя
        System.out.println("dog is not hungry anymore");
    }
}
