package com.company;

public class MyException extends Exception {
    public long timestamp;
    public MyException (){
        super ();
        this.timestamp = System.currentTimeMillis();
    }
    @Override
    public String getMessage (){
        return "MyException error found";
    }
}
