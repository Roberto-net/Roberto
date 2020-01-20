package com.company;

public class Task {
    public Condition condition;
    public String content;
    Task(String content, Condition t){
        this.condition=Condition.NOTDONE;
        this.content=content;
    }
    public String toString(){
        String p=null;
        return this.content+" - " + this.condition;
    }



}
