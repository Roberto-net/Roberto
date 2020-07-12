package com.company;

public class User {
    private String name;
    private int age;
    //установка геттеров и сеттеров
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age <0 || age >=120){
            System.out.println("ай-яй-яй");
        }else {
            this.age = age;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    /*@Override
    public boolean equals(Object obj) {
        //явное преобразование
        // если явное преобразование не возможно экземпляяр будет  равен (null)
        User user = (User)obj;
        //все значения типа String надо сравнивать при помощи метода equals
        return this.age==user.age && this.name.equals(user.name);
    }*/
    /*@Override
    public int hashCode(){
       if (this.age >18){
           return 1;
       }else
           return 2;
    }*/
    @Override
    public String toString() {
        return this.name;
    }

}
