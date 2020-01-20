package com.company;

public class WhoIsNext {
    public static String whoIsNext (String[]names , long a){
       // String[] nm = new String[];
        long w=0;
        if (a> names.length){
            w=a%names.length;
            System.out.println(w);
            int b = (int) w;
            return names[b];
        }

        int f = (int) a;
        return names[f-1];
    }
}
