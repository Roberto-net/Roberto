package com.company;

public class Main {

    public static void main(String[] args) {
        /* массивы*/
        int  [] arr  = new int [5];
        arr [0]= 10;
        arr [3] = 31;
        System.out.println( arr [0] );
        System.out.println( arr [1] );
        System.out.println( arr [2] );
        System.out.println( arr [3] );
        System.out.println( arr [4] );
        //System.out.println( arr [0] );
        /*int [][] m = new int [5] [3];
        m [0] [1] = 32;
        m [4] [2] = 10;
        /*System.out.println( m  [0] [1] );
        System.out.println( m [4] [3] );*/
        // определение длинны массива
        /* System.out.println( arr.length );
        System.out.println(m [0].length );
        // инициализация массива
        int [] arr2 = {2,5,67,1,2,25,2,51,25};
        System.out.println( arr2 [5] );
        int [] [] m2 = {{4,5,6,1},{2,4,56,4},{2,6,7,3}};
        System.out.println( m2 [0] [3] );*/
        // циклы
        int i = 0;
        while (i < 3 ){
            System.out.println("printed " + i);
            i = i + 1;
        }
        // пост-проверка условия do-while
        do {
            System.out.println(" do-while-code" );
        } while (i < 3);
        /* a - блок инициализации,
           b - блок условия выполнения,
           с -  блок пост-выполения
           любой блок может отсутствовать
           оператор break
        for (a;b;c) {

        }*/
        for (int k = 1; k < 5; k = k + 1){
            System.out.println( k );
        }
        for (int o = 3; ; o = o + 2 ) {
            System.out.println( "Это " + o);
            if (o == 9 ) {
                break; // завершает выполнение цикла
            }
            // оператор continue
        }
        /*for (int p = 1; p < 9; p++){
            if ( p%2 != 0){
                continue; // завершает текущую итерацию цикла
            }
            System.out.println( p );*/
            // обход элементов массива
        for (int l = 1; l < arr.length; l++){
                System.out.println( arr [l] );
        }
            // операторы ++ и --
        int p = 5;
        p++;
        System.out.println( p );
        p--;
        System.out.println( p );
        for (int c = 1; c < 10 ; c++){
            for (int s = 1; s < 10; s++){
            System.out.println(c + " * " + s + " = "  + c*s +  "; ");
            }
            System.out.println( );
        }
        }
    }

