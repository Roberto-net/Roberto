package com.company;

public class MyClass {
    public int value;
    public int g;
    public synchronized void calc(int d){//synchronized - приостанвливает потоки при одновременном их обращении к методу
        // и ставит поток в очередь
        this.value+=d;
    }
    /*
    локальная синхронизация на объекте
    public void calc(int d){
         synchronized(this){
        this.value+=d;
        }
    }
    */

    public void calc2(int i, String c){
        System.out.print(c);
        synchronized (this){
            this.g+=i;

        }
    }
}
