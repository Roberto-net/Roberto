package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /*EnoughIsEnough enough= new EnoughIsEnough();
        int[]test={3,3,3,3};
        System.out.println(enough.enDel(test,3));*/
        String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
        String gg=WhoIsNext.whoIsNext(names,52l);
        gg="WUBWEWUBAREWUBWUBTHEWUBCHAMPIONSWUBMYWUBFRIENDWUB";
        gg.replace('W', '1');
        System.out.println(gg);
        dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"});
        carBuyer(2000, 8000, 1000, 1.5);





    }
        public static String sumOfChar(String inter) {
            String[] sArr = inter.split(" ");
            int max = 0;
            String temp = null;
            for (int i = 0; i < sArr.length; i++) {
                int b = 0;
                for (int k = 0; k < sArr[i].length(); k++) {
                    b += (sArr[i].charAt(k) - 96);
                }
                if (b > max) {
                    max = b;
                    temp = sArr[i];
                }
            }
            return temp;
        }
        public static boolean isValid(char[] walk) {
            if (walk.length!=10){
                return false;
            }
            int we=0;
            int ns=0;
            for (int i =0;i<walk.length;i++){
                switch (walk[i]){
                    case 'n':
                        ns+=1;
                        break;
                    case 's':
                        ns-=1;
                        break;
                    case 'w':
                        we+=1;
                        break;
                    case 'e':
                        we-=1;
                        break;
                }
            }
            if (ns==we&&ns==0&&we==0){
                return true;
            }
            return false;
        }
    public static String[]dirReduc(String[] arr) {
        if (arr.length==0){
            return new String[]{};
        }
        int we=0;
        int ns=0;
        ArrayList<String> NSWE=new ArrayList<>();
        for (int i =0;i<arr.length;i++){
            switch (arr[i]){
                case "NORTH":
                    ns+=1;
                    break;
                case "SOUTH":
                    ns-=1;
                    break;
                case "WEST":
                    we+=1;
                    break;
                case "EAST":
                    we-=1;
                    break;
                case "North":
                    ns+=1;
                    break;
                case "South":
                    ns-=1;
                    break;
                case "West":
                    we+=1;
                    break;
                case "East":
                    we-=1;
                    break;
            }
        }
        if (ns>0){
            for (int i =0;i<ns;i++){
                System.out.println(NSWE.add("NORTH"));
                System.out.println(NSWE);
            }
        }else if (ns<0){
            for (int i =0;i>ns;i--){
                System.out.println(NSWE.add("SOUTH"));
                System.out.println(NSWE);
            }
        }
        if (we>0){
            NSWE.add("WEST");
            for (int i =0;i<ns;i++){
                System.out.println(NSWE.add("WEST"));
                System.out.println(NSWE);
            }
        }else if (we<0){
            for (int i =0;i>ns;i--){
                System.out.println(NSWE.add("EAST"));
                System.out.println(NSWE);
            }
        }
        String []nowesoes=new String[NSWE.size()];
        System.out.println(NSWE);
        for (int i =0;i<NSWE.size();i++){
            nowesoes[i]=NSWE.get(i);
        }
        System.out.println(nowesoes);

        return nowesoes;
    }
    public static int[] carBuyer(int carOld, int carNew, int monthMoney, double perc){
        double g = monthMoney/perc;
        g=191.7%1;
        System.out.println(g);
        int m=1;
        double carOldT=(double)carOld;
        double carNewT=(double) carNew;
        double marge=0.0d;
        double money=0.0;
        int [] carB=new int[2];
        if (carOld-carNew>0){
            carB[0]=0;
            carB[1]=carOld-carNew;
            return  carB;
        }
        while (true){
            if (m%2==0){
                perc+=0.5;
            }
            m+=1;
            carOldT=carOldT*((100-perc)/100);
            carNewT=carNewT*((100-perc)/100);
            money+=monthMoney;

            g=(carOldT+money)-carNewT;
            if (g>0){
                System.out.println(g+" - "+(m-1));
                carB[0]=m-1;
                int sMoney=(int)g;
                carB[1]=sMoney;
                return carB;
            }
        }


    }

}
