package com.company;



import java.util.*;

public class Main {

    public static void main(String[] args) {
        Stack<String> st= new Stack<>();
        st.add("elem1");
        st.add("elem2");
        st.add("elem3");
        System.out.println(st);
        System.out.println(st.pop()); // достает верхний элемент стека
        System.out.println(st);
        st.push("elem5");
        System.out.println(st);
        st.peek();// возвращает верхний элемент стека не удаляя его из коллекции
        System.out.println("--------------");
        System.out.println(st);
        System.err.println(st.search("elem2"));
        st.remove(1);
        System.out.println(st);
        st.clear();// удаляем все элементы из стека
        try {
            System.out.println(st.pop());
        } catch (EmptyStackException e){
            System.err.println("Стек пустой");
        }
        // Коллекция очередь
        Queue<String> qu= new PriorityQueue<>(4);
        qu.add("1111");
        qu.add("2222");
        qu.add("3333");
        qu.add("4444");

        if (qu.offer("55555")){
            System.out.println("Элемент добавлен");
        }else {
            System.out.println();
        }
        System.out.println(qu);
        qu.poll();// достает первый элемент и удаляет его
        System.out.println(qu);
        qu.element();
        qu.peek();
        UserComparator comparator= new UserComparator();
        Queue<User> users= new PriorityQueue<>(comparator);
        Random rd= new Random();
        for (int i =0;i<10;i++){
            User u = new User();
            u.setMoney(rd.nextInt(1000));
            users.add(u);
        }
        while(true){
            User u = users.poll();
            if (u == null){
                break;
            }
            System.out.println(u);
        }
        /*for (int i = 0;i<10;i++){
            System.out.println(users.poll());
        }*/

        int x = 5;
        x <<=2;
        System.out.println(x);
        System.out.println(fact2(5));


    }
    public static int fact(int d){
        int f=1;
        for (int i=1;i<=d;i++){
            f*=i;
        }
        return f;
    }
    public static int fact2 (int d){
        if (d==0){
            return 1;
        }
        return d*fact2(d-1);
    }


}
