package com.company;

class complite {
    public static void main(String[] args) {
        int[] o = {124, 22, 66, 46, 21, -56};
        int av;
        av = average(o);
        System.out.println(av);
        float[] t = {25.2f, 11.2f, 250.2f, 5.7f, 56.5f, 2.4f};
        float m = minX(t);
        System.out.println(m);
        int[] u = {2, 3, 3, 5, 6, 7};
        boolean s = isSorted(u);
        System.out.println(s);
        int simp = 12546;
        boolean p = isPrime(simp);
        if (p==true)System.out.println("Это число простое");
        else System.out.println("Это число не простое");
        int d = 54367;
        int dig = sumDigits(d);
        System.out.println(dig);
        int time = 4025;
        showTime(time);
        double a = 2.78, b = 1.89, c = 3.05;
        sqRoots(a,b,c);
        long mb = 4568;
        String op = "b";
        long bc = byteConverter(mb,op);
        System.out.println(mb + " Mb " + "= " + bc + " " + op);
        int [] [] n= {{1,4,5,8,-6},
                     {-2,44,8,-8,-37},
                     {-3,-44,-31,-46,-67,55,91,1},
                     {21,34,-5,8}
        };
        int [][] pos = replaceNegatives(n);
        System.out.println();
        for (int i =0; i<pos.length;i++){
            for(int j = 0;j<pos[i].length;j++){
                System.out.print(pos [i] [j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int ev = firstEven(55,67,87,91,12,-23,35);
        System.out.println(ev);
    }

    public static int average(int[] sum) {
        int j = 0;
        for (int i = 0; i < sum.length; i++) {
            j = j + sum[i];
        }
        j = j / sum.length;
        return j;
    }

    public static float minX(float[] el) {
        float min = el[0];
        for (int i = 0; i < el.length; i++) {
            if (el[i] < min) {
                min = el[i];
            }
        }
        return min;
    }

    public static boolean isSorted(int[] k) {
        boolean y = true;
        for (int i = 1; i < k.length; i++) {
            if (k[i] < k[i - 1]) {
                y = false;
            }
        }
        return y;
    }

    public static boolean isPrime(int h) {
        boolean b = false;
        if (h < 2) b=false;
        else b = true;
        for (int i = 2 ; i< Math.sqrt(h);i++){
            if((h % i )==0){
                b=false;
                break;
            }
        }
        return b;
    }

    public static int sumDigits(int x) {
        int s = 0;
        while (x != 0) {
            s += x % 10;
            x = x / 10;
        }
        return s;
    }

    public static void showTime(int t) {
        int h = t / 3600;
        int min = (t - h * 3600) / 60;
        int sec = t - (h * 3600 + min * 60);
        if (h < 10) System.out.print("0" + h);
        else System.out.print(h);
        System.out.print(":");
        if (min < 10) System.out.print("0" + min);
        else System.out.print(min);
        System.out.print(":");
        if (sec < 10) System.out.print("0" + sec);
        else System.out.print(sec);
    }

    public static void sqRoots(double a, double b, double c) {
        double x1 = 0.0;
        double x2 = 0.0;
        double D = (b * b - 4 * a * c);
        double dis = 0.0;
        System.out.println();
        if (D < 0)
            System.out.println("Уравнение не имеет корней");
        else {
            dis = Math.sqrt(D);
            x1 = (-b - dis) / (2 * a);
            x2 = (-b + dis) / (2 * a);
            float f1 = (float) (x1);
            float f2 = (float) (x2);
            System.out.print("Корень х1 = ");
            System.out.print(f1);
            System.out.println();
            System.out.print("Корень х2 = ");
            System.out.print(f2);
        }

    }

    public static long byteConverter(long a, String con) {
        long b = 0;
        switch (con) {
            case "kb":
                b = a * 1024;
                break;
            case "b":
                b = a * 1050578;
                break;
            default:
                System.out.println("Не верный определитель");
        }
        return b;
    }
    public static int[][] replaceNegatives ( int[][] neg){
            for (int i = 0; i < neg.length; i++) {
                for (int j = 0; j < neg[i].length; j++)
                    if (neg[i][j] < 0)
                        neg[i][j] = 0;
            }
            return neg;
    }
    public static int firstEven ( int...g){
        int b = 0;
        for (int i = 0; i<g.length;i++){
            if (g[i]%2==0) {
                b = g[i];
                break;
            }
        }
            return b;
    }
}

