package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	float x=14.5f;
	double z=20.3;
	float y=0.4f;
	System.out.println(x);
        System.out.println(z);
        System.out.format("%.1f%n",y);
        System.out.println(y);
        Test test = new Test();
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        System.out.println(a[0]*a[0]);
        System.out.println(test.arr(a,b));
    }
}
