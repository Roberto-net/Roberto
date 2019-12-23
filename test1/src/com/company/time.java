package com.company;

public class time {
    public static void main(String[] args) {
        int b = 256;
        int h = b / 3600;
        int min = (b-h*3600)/60;
        int sec = b - (h*3600+min*60);
        if (h < 10) System.out.print("0"+h);
        else System.out.print(h);
        System.out.print(":");
        if (min < 10) System.out.print("0"+min);
        else System.out.print(min);
        System.out.print(":");
        if (sec < 10) System.out.print("0"+sec);
        else System.out.print(sec);






        //System.out.println();


        //System.out.print(h);
        //System.out.print(min);
        //System.out.print(sec);
    }
}
