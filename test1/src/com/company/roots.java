package com.company;

public class roots {
    public static void main(String[] args) {
        double a = 2.78;
        double b = 1.89;
        double c = 3.05;
        double x1= 0.0;
        double x2 = 0.0;
        double D;
        double dis;
        D = (b * b - 4 * a * c);
        if (D < 0 )
            System.out.println("Уравнение не имеет корней");
        else {
            dis = Math.sqrt(D);
            x1 = (-b - D) / (2 * a);
            x2 = (-b + D) / (2 * a);
            float f1 = (float) (x1);
            float f2 = (float) (x2);
            System.out.print("Корень х1 = ");
            System.out.print(f1);
            System.out.println();
            System.out.print("Корень х2 = ");
            System.out.print(f2);
        }


    }

}
