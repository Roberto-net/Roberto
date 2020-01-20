package com.company;

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

    }
}
