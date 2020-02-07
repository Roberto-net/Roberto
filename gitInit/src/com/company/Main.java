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
                for (int i=0;i<1000;i++){
                    myClass.calc(1);
                    myClass.calc2(1,"out");
                }
            }
        });

        Thread t2= new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<1000;i++){
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


    }




}
