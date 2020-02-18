package com.company;

import java.io.ObjectInputStream;
import java.io.Serializable;

public class User implements Serializable {
    public int age;
    public String name;
    public transient float height;

    User(String name, int age){
     this.name=name;
     this.age=age;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", height=" + height +
                '}';
    }
}
