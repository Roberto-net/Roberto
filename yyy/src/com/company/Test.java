package com.company;
import java.lang.reflect.Array;
import java.util.*;
public class Test {
    public boolean arr(int [] a, int []b){
        boolean h=false;
        for (int i = 0;i<a.length;i++){
            if (a[i]==b[i]);
            Arrays.sort(a);
            Arrays.sort(b);
            if (a[i]*a[i]!=b[i]) {
                return false;
            }else return true;
            }
        return h;
        }
}
