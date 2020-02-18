package com.company;



public class Main {

    public static void main(String[] args) {
        long t = System.currentTimeMillis();
	    for (int i=0;i<2000000;i++){
	        double d =Math.exp(Math.random()*Math.cosh(2.2d)/(i*i));
	        d*=d;
	        d*=Math.asin(6.7)*100;
        }
	   System.out.println(System.currentTimeMillis()-t);
        t = System.currentTimeMillis();
	    Thread thread= new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<1000000;i++){
                    double d =Math.exp(Math.random()*Math.cosh(2.2d)/(i*i));
                    d*=d;
                    d*=Math.asin(6.7)*100;
                }

            }

        });
        MyThread mt =new MyThread();
        thread.start();
        mt.start();

        try {
            thread.join();
            mt.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(System.currentTimeMillis()-t);
        MyClass myClass= new MyClass();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                Thread ct1= Thread.currentThread();
                synchronized (ct1) {
                    try {
                        ct1.wait();
                    } catch (InterruptedException e) {
                        System.out.println("-_-");
                    } catch (IllegalMonitorStateException r) {
                        System.out.println("0_o");
                    }
                    for (int i = 0; i < 1000; i++) {
                        myClass.calc(1);
                        myClass.calc2(1, "out");
                    }
                }
            }
        });
        Thread t2= new Thread(new Runnable() {
            @Override
            public void run() {
                Thread tt2= Thread.currentThread();
                System.out.println();
                System.out.println(tt2.getName());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("\n"+tt2.getName()+" "+"Wake up\n");
                for (int i=0;i<1000;i++){

                    if (i==500){
                        synchronized (t1) {
                            System.out.println("\n"+t1.getState()+"\n");
                            t1.notifyAll();
                        }
                    }
                    myClass.calc(-1);
                    myClass.calc2(1,"IN");
                }
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
        }
        System.out.println(myClass.value);
        Thread ct=Thread.currentThread();
        try {
            Thread.sleep(100);// приостанавливает работу потока на заданное время
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //wait - приостанавливает работу потока до наступления события о его запуске
        try {
            ct.wait();// не вызывать оситановку основного потока
        } catch (InterruptedException e) {
            System.out.println("Ошибка в конце");
        } catch (IllegalMonitorStateException r){
            System.out.println("Самая последняя");
        }
        //notify, notifyAll - осздают для потока событие при котором он продолжал свою работу
        ct.getState();//возвращает текущее состояние потока
        System.out.println(ct.getState());
        //interrupt-прерывает выполнение потока
        ct.interrupt();
        Thread.yield();//завершает выделенное время для потока и переключается системой на новый поток


    }




}
