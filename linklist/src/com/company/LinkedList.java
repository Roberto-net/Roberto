package com.company;

public class LinkedList {
    private Node head;
    private int size=9;
    private Node tail;
    public LinkedList(){
        head=null;
    }
    public void add(int value)throws MyException{
        Node temp = new Node(value);
        if (head==null) {
            head = temp;
            tail=temp;
        }else {
            tail.next = temp;
            tail = temp;
        }
    }
    public void remove(int index)throws MyException{
        if (index < 0){
            try {
                throw new MyException();
            } catch (MyException e) {
                e.printStackTrace();

            }
        }
        if(head == null){
            System.out.println("В списке нет элементов");
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
            return;
        }
        int b = 1;
        if (0 == index) {
            head = head.next;
            return;
        }
        Node n=head;
        while (n.next != null) {
            if (b == index) {
                /*if(tail == n.next){
                    tail = n;
                }*/
                n.next = n.next.next;
                return;
            }
            n = n.next;
            b++;
        }

    }
    public int get (int index) throws MyException{
        if (index < 0){
            try {
                throw new MyException();
            } catch (MyException e) {
                e.printStackTrace();
            }
        }
        int b = 0;
        Node m=head;
        while (m != null){
            if (index == b){
                return m.value;
            }else {
                m = m.next;
                b++;
            }
        }
        return -1;
    }
    public void print(){
        int i=0;
        Node temp = head;
        if (temp == null){
            System.out.println("В списке нет элементов");
        }
        while (temp != null){
            System.out.print("Index - ");
            System.out.print(i);
            System.out.print(" " + " ------->");
            System.out.print(" Value - ");
            System.out.print(" " );
            System.out.print(temp.value + "\n");
            temp=temp.next;
            i++;
        }

    }
    public void printIndex(){
        int i=0;
        Node temp = head;
        if (temp == null){
            System.out.println("В списке нет элементов");
        }
        System.out.print("Доступные индексы ");
        System.out.print("\n");
        while (temp != null){
            System.out.print("Index - ");
            System.out.print(i);
            System.out.print("\n");
            temp=temp.next;
            i++;
        }

    }
}
