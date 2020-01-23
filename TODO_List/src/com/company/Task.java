package com.company;

import java.util.Date;

public class Task {
    public Date date;
    public Condition condition;
    public String description;

    Task(Condition condition, String description){
        this.condition=condition;
        this.description=description;

    }

}
