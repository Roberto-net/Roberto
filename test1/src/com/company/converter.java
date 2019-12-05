package com.company;

public class converter {
    public static void main(String[] args){
        long a = 125125;
        long b = 0;
        String con ="b";
        switch (con){
            case "kb":
             b=a*1024;
             break;
            case "b":
                b=a*1050578;
                break;
            default:
                System.out.println("Не верный определитель");
        }
        System.out.println(a + " Mb " + "= " + b + " " + con);
    }
}
