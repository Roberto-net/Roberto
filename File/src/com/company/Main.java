package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        //абсолютный путь к файлу
	    File f = new File("C:\\gg\\t.exe");
	    if (f.exists()){
	        System.out.println("Файл сущесвтует ");
        }else {
	        System.out.println("Files don not create");
        }
	    //указываем относительный путь к файлу
        File ff=new File("1.txt");
	    if (!ff.exists()){
            try {
                ff.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
                System.err.println("ERROR");
            }
        }
	    //удаляет файл сразу после вызова метода
	    //ff.delete();
        //ff.deleteOnExit();//---- удаляет файл после завершения программы
        File dir=new File("D:\\Korinevskiy\\File");
        String [] str = dir.list();
        for (int i =0;i<str.length;i++){
            System.err.println(str[i]);
        }
        File mkdir=new File("D:\\Korinevskiy\\File\\test111");
         if (!mkdir.exists()){
             mkdir.mkdir();//создает только последнюю папку в пути, mkdirs -создает все папки в пути
         }
         //read TXT file
        try {
            FileReader reader=new FileReader(ff);

            int c = reader.read();
            while (c!=-1){
                System.out.print((char)(c));
                c=reader.read();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // запись в файл
        try {
            FileWriter fw=new FileWriter("2.txt");
            fw.write("Hello\nWorld");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //преобразования строки в число
        try {
            FileReader fr= new FileReader("3.txt");
            //int [] temp= new [7];
            int c =fr.read();
            String number="";
            while (c !=-1){
                if ((char)(c)==' '){
                    int v = Integer.parseInt(number);
                    System.out.println(v*v);
                    number="";
                }else {
                    number +=(char)c;

                }
                c = fr.read();
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
