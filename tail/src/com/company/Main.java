package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;

public class Main {

    public static void main(String[] args)  {
        String l="", p="", n="";
        long milisStart=System.currentTimeMillis();
        l=args[0];
        int k=10;
        if (l.equals(null) || l.equals("")){
            System.err.println("");
        }
        for (int i=1;i<args.length;++i) {
            String arg = args[i];
            if (arg.equalsIgnoreCase("-All")||arg.equalsIgnoreCase("-a")) {
                p = "all";
            }
            if (arg.equalsIgnoreCase("-nl")){
                p="nl";
                k=Integer.parseInt(args[i+1]);
            }
        }
        HashMap<Integer,String> stringInText= new HashMap<>();
        RandomAccessFile raf;
        String s="";
        int strNumber=1;
        try {
            //raf = new RandomAccessFile("Necronomicon.txt","r");
            //raf = new RandomAccessFile("shadow.txt","r");
            raf= new RandomAccessFile(l,"r");
            while((s=raf.readLine())!=null){
                stringInText.put(strNumber,s);
                strNumber+=1;
            }
            raf.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        switch (p){
            case "all":
                for (int i =1;i<stringInText.size();i++){
                    if (!stringInText.get(i).equalsIgnoreCase("")) {
                        if (stringInText.get(i)!=null) {
                            System.out.print(i);
                            System.out.print(" - ");
                            System.out.print(stringInText.get(i));
                            System.out.print("\n");
                        }
                    }
                }
                return;
            case "nl":
                if (k>stringInText.size()){
                    k=stringInText.size()-1;
                }
                for (int i =stringInText.size()-k;i<=stringInText.size();i++){
                    if (!stringInText.get(i).equalsIgnoreCase("")) {
                        if (stringInText.get(i)!=null) {
                            System.out.print(i);
                            System.out.print(" - ");
                            System.out.print(stringInText.get(i));
                            System.out.print("\n");
                        }
                    }
                }
                break;
            default:
                System.out.println("попробуйте другие комбинации");
        }
        System.out.print("Время работы программы");
        System.out.print(" - ");
        System.out.print(System.currentTimeMillis()-milisStart);
        System.out.print(" мс ");
    }
}
