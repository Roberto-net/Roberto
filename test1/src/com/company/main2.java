package com.company;

public class main2 {
    public static void main(String[] args){
        int [] per = {3,5,55,33,11,65,45,34,51,31};
        int b = 0;
        for (int i = 0; i<per.length;i++){
            if (per[i]%2==0) {
                b = per[i];
                break;
            }
        }
        System.out.println(b);
    }
    /*public static void gain (String[] args){
        int x = ;
        int b = 0;
        for (int i = 0; i<per.length;i++){
            if (per[i]%2==0) {
                b = per[i];
                break;
            }
        }
        System.out.println(b);*/
}
