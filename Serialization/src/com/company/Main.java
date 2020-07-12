package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	    User u = new User("Victor", 25);
	    u.height = 120.5f;
        try {
            FileOutputStream fOS=new FileOutputStream("user.bin");
            ObjectOutputStream oos=new ObjectOutputStream(fOS);
            oos.writeObject(u);
            oos.close();//первым закрываем то что первым открыто
            fOS.close();//затем остальные по порядку открытия
        } catch (FileNotFoundException e) {
            System.err.println("Не могу обнаружить файл");
        }catch (Exception e){
            System.err.println("Это никуда не годится!!!");
        }
        try {
            FileInputStream fli= new FileInputStream("user.bin");
            ObjectInputStream ois= new ObjectInputStream(fli);
            User u2 = (User)ois.readObject();
            fli.close();
            ois.close();
            System.out.println(u2.name);
            System.out.println(u2.age);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ArrayList<User> users= new ArrayList<>();
        users.add(new User("Igor", 24));
        users.add(new User("Evgen", 31));
        users.add(new User("Uriy", 21));
        users.add(u);
        try {
            FileOutputStream fOS=new FileOutputStream("users.bin");
            ObjectOutputStream oos=new ObjectOutputStream(fOS);
            oos.writeObject(users);
            oos.close();//первым закрываем то что первым открыто
            fOS.close();//затем остальные по порядку открытия
        } catch (FileNotFoundException e) {
            System.err.println("Не могу обнаружить файл");
        }catch (Exception e){
            System.err.println("Это никуда не годится!!!");
        }
        try {
            FileInputStream fli= new FileInputStream("users.bin");
            ObjectInputStream ois= new ObjectInputStream(fli);
            ArrayList<User> usersArr = (ArrayList<User>) ois.readObject();
            fli.close();
            ois.close();
            System.out.println(usersArr);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
