package com.company;

public class MyThread extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i=1000000;i<2000000;i++){
            double d =Math.exp(Math.random()*Math.cosh(2.2d)/(i*i));
            d*=d;
            d*=Math.asin(6.7)*100;
        }

    }
}
