package com.company;

public class lesson4 {
    public static void main(String[] args){
        int s = sum (15,125,52);
         System.out.println(s);
         float m = max (124.1f,1457.6f, 225.2f);
         System.out.println(m);
         int []o={14,11,11,66,234,346,2341};
         s = sumM (o);
         System.out.println(s);
         float r = sumOdd(124.4f,212.5f,65.5f,25.6f);
         System.out.println(r);
         System.out.println("--------------------------------");
         o = bubbleSort(o);
         for (int i =0; i< o.length;i++){
             System.out.println(o[i]);
         }
    }

    public static int sum (int a, int b, int c){
        return a + b + c; // ключевое слово return завершает выполнение функции
        }
    public static float max (float z, float x, float y){
        if (z > y && z > x){
            return z;
        }
        if ( x > z && x > y){
            return x;
        }
        return y;
    }
    public static int sumM (int [] arr ){
        int j=0;
        for (int i = 0; i < arr.length; i++){
            j = j + arr[i];
        }
        return j;
    }
    // функция с переменным чилсом параметров
    public static float sumOdd (float...g){
        float t = 0.0f;
        for (int i = 0; i< g.length; i ++ ){
            if ( i % 2==0){
                continue;
            }
            t = t + g[i];
        }
        return t;

    }
    // сортировка методом "пузырек"
    public static int [] bubbleSort(int []mas){
        for (int i = 0; i < mas.length; i++){
            for (int j=i+1; j<mas.length; j++){
                if (mas[i]<mas[j]){
                    int temp = mas[i];
                    mas[i]=mas[j];
                    mas[j]= temp;
                }
            }
        }
        return mas;
    }





}
